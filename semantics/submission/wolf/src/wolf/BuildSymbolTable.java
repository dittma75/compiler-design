package wolf;

import java.util.ArrayList;
import java.util.List;
import wolf.interfaces.*;
import wolf.enums.*;

/**
 * A visitor responsible for building symbol tables for the
 * parser.
 * @author William Ezekiel
 * @author Kevin Dittmar
 * @author Joseph Alacqua
 * @version Apr 3, 2016
 */
public class BuildSymbolTable implements Visitor {

    List<SymbolTable> tables;
    SymbolTable program_table;
    SymbolTable current_def_table;

    /**
     * Visit a program
     * @param n a program
     */
    @Override
    public void visit(Program n) {
        tables = new ArrayList<>();
        program_table = new SymbolTable("Program Environment Table");        
        tables.add(program_table);
        for (Def def : n.def_list) {
            current_def_table = new SymbolTable(program_table, def.def_name.toString() + " Table");
            program_table.put(def.def_name, new Binding(def.def_name, new TableValue(def.type,current_def_table)));
            def.accept(this);
            tables.add(current_def_table);
        }
        n.function.accept(this);
        StringBuilder sb = new StringBuilder();
        for(SymbolTable st : tables) {
            sb.append(st);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
    
    /**
     * Visit a definition
     * @param n a definition object (Def)
     */
    @Override
    public void visit(Def n) {
        // sig has no args
        if(n.sig != null) {
            n.sig.accept(this);
        }
        n.function.accept(this);
    }
    
    /**
     * Visit a function signature
     * @param n a signature (Sig)
     */
    @Override
    public void visit(Sig n) {
        for(SigArg sig_arg: n.sig_args) {
            current_def_table.put(sig_arg.identifier, 
                    new Binding(sig_arg.identifier,new TableValue(sig_arg.type,null)));
        }
    }
    
    @Override
    public Object visit(SigArg n) {
        n.identifier.accept(this);
        return n.type.accept(this);
    }
    
    public Type visit(Type n) {
        return n.accept(this);
    }
    
    /**
     * Visit a function in the WOLF language.
     * @param n a function
     */
    @Override
    public Object visit(WolfFunction n) {
        if(n instanceof UserFunc) {
            return visit((UserFunc) n);
        } else if(n instanceof NativeUnary) {
            return visit((NativeUnary) n);
        } else if(n instanceof NativeBinary) {
            return visit((NativeBinary) n);
        } else if (n instanceof Branch) {
            return visit((Branch) n);
        } else if(n instanceof Fold) {
            return visit((Fold) n);
        } else if(n instanceof WolfMap) {
            return visit((WolfMap) n);
        } else if (n instanceof NativeListUnary) {
            return n.accept(this);
        } else if (n instanceof NativeListBinary) {
            return n.accept(this);
        } else {
            System.err.println("Invalid Function");
            System.exit(1);
            return null;
        }
    }
    
    /**
     * Visit a user function.
     * @param n a user function
     */
    @Override
    public Object visit(UserFunc n) {
        n.arg_list.accept(this);
        return n.user_func_name.accept(this);
    }
    
    /**
     * Visit a native unary
     * @param n a native unary
     */
    @Override
    public Object visit(NativeUnary n) {
        return n.accept(this);
    }
    
    /**
     * Visit a native binary
     * @param n a native unary
     */
    @Override
    public Object visit(NativeBinary n) {
        return n.accept(this);
    }
    
    /**
     * Visit a branch
     * @param n a branch
     */
    @Override
    public Object visit(Branch n) {
        Type condType = (Type) n.condition.accept(this);
        if(!condType.equals(new Type(FlatType.INTEGER))) {
            System.err.print("Condition not of integer type!");
            System.exit(1);
        }
        
        Type trueType = (Type)  n.true_branch.accept(this);
        Type falseType = (Type) n.false_branch.accept(this);
        if(!(trueType.equals(falseType))) {
            System.err.print("Ambiguous return types for branch: true branch: " 
                    + trueType + " false branch: " + falseType);
            System.exit(1);
        }
        return trueType;
    }
    
    /**
     * Visit a mapping function in the WOLF language
     * @param n a mapping function object (WolfMap)
     */
    @Override
    public Object visit(WolfMap n) {
        n.unary_op.accept(this);
        n.list_argument.accept(this);
        return null;
    }
    
    /**
     * Visit a fold function
     * @param n a fold function
     */
    @Override
    public Object visit(Fold n) {
        n.fold_symbol.accept(this);
        n.fold_body.accept(this);
        return null; //for now
    }
    
    /**
     * Visit a fold symbol
     * @param n a fold symbol
     */
    @Override
    public Object visit(FoldSymbol n) {
        return n.accept(this);
    }
    
    /**
     * Visit a unary operation
     * @param n a unary operation object
     */
    @Override
    public Object visit(UnaryOp n) {
        if(n instanceof NativeUnary) {
            return visit((NativeUnary) n);
        } else if(n instanceof Identifier) {
            return visit((Identifier) n);
        } else if(n instanceof WolfLambda) {
            return visit((WolfLambda) n);
        } else {
            System.err.println("Invalid UnaryOp");
            System.exit(1);
            return null;
        }
    }
    
    /**
     * Visit a list argument
     * @param n a list argument
     */
    @Override
    public Object visit(ListArgument n) {
        if(n instanceof WolfList) {
            return visit((WolfList) n);
        } else if(n instanceof Identifier) {
            return visit((Identifier) n);
        } else if(n instanceof WolfFunction) {
            return visit((WolfFunction) n);
        }
        else {
            System.err.println("Invalid List Argument");
            System.exit(1);
            return null;
        }
    }
    
    /**
     * Visit a lambda in the WOLF language
     * @param n a lambda object (WolfLambda)
     */
    @Override
    public Object visit(WolfLambda n) {
        n.sig.accept(this);
        n.function.accept(this);
        return null; // for now
    }
    
    /**
     * Visit a fold body
     * @param n a fold body
     */
    @Override
    public Object visit(FoldBody n) {
        n.bin_op.accept(this);
        n.list_argument.accept(this);
        return null; // for now
    }
    
    /**
     * Visit a binary operation
     * @param n a binary operation
     */
    @Override
    public Object visit(BinOp n) {
        if(n instanceof NativeBinary) {
            return visit((NativeBinary) n);
        } else if(n instanceof Identifier) {
            return visit((Identifier) n);
        } else if(n instanceof WolfLambda) {
            return visit((WolfLambda) n);
        }
        else {
            System.err.println("Invalid BinOp");
            System.exit(1);
            return null;
        }
    }
    
    /**
     * Visit a list in the WOLF language
     * @param n a list object (WolfList)
     */
    @Override
    public Object visit(WolfList n) {
        for(Arg arg:n.arg_list) {
            arg.accept(this);
        }
        return n.accept(this);
    }
    
    /**
     * Visit an identifier
     * @param n an identifier
     */
    @Override
    public Object visit(Identifier n) {
        // An identifier can be anything, it depends on the context of the
        // fucntion. Identifiers are only used for user-defined functions, and
        // its type cannot be determined until said function has been evaluated.
        // A general type, PARAMETER, is used to encompass all possibilities.
        
// Something has to be done about this
//      Binding /*of*/ isaac = new Binding(n,new TableValueType(Type.PARAMETER));
//        program_table.put(n, isaac);
        return n.accept(this);
    }
    
    /**
     * Visit an argument
     * @param n an argument
     * @return ???
     */
    @Override
    public Object visit(Arg n) {
        if(n instanceof WolfFunction) {
            return visit((WolfFunction) n);
        } else if(n instanceof WolfList) {
            return visit((WolfList) n);
        } else if(n instanceof IntLiteral) {
            return visit((IntLiteral) n);
        } else if(n instanceof FloatLiteral) {
            return visit((FloatLiteral) n);
        } else if(n instanceof Identifier) {
            return visit((Identifier) n);
        } else if(n instanceof WolfString) {
            return visit((WolfString) n);
        } else {
            System.err.println("Invalid Arg");
            System.exit(1);
            return null;
        }
    }
    
    /**
     * Visit a user function name
     * @param n a user function name
     */
    @Override
    public Object visit(UserFuncName n) {
        if(n instanceof Identifier) {
            return visit((Identifier) n);
        } else if(n instanceof WolfLambda) {
            return visit((WolfLambda) n);
        } else {
            System.err.println("Invalid UserFuncName");
            System.exit(1);
            return null;
        }
    }
    
    /**
     * Visit a list of arguments
     * @param n a list of arguments object (ArgList)
     */
    @Override
    public Object visit(ArgList n) {
        for(Arg arg:n.arg_list) {
            arg.accept(this);
        }
        return null;
    }
    
    /**
     * Visit an integer literal
     * @param n an integer literal
     */
    @Override
    public Object visit(IntLiteral n) {
        return n.accept(this);
    }
    
    /**
     * Visit a float literal
     * @param n a float literal
     */
    @Override
    public Object visit(FloatLiteral n) {
       return n.accept(this);
    }
    /**
     * Visit a string in the WOLF language
     * @param n a string object (WolfString)
     */
    @Override
    public Object visit(WolfString n) {
        return n.accept(this);
    }
    
    /**
     * Visit a string middle
     * @param n a string middle
     */
    @Override
    public Object visit(StringMiddle n) {
        if(n instanceof StringBody) {
            return visit((StringBody) n);
        } else if(n instanceof StringEscapeSeq) {
            return visit((StringEscapeSeq) n);
        } else {
            System.err.println("Invalid StringMiddle");
            System.exit(1);
            return null;
        }
    }
    
    /**
     * Visit a string body
     * @param n a string body
     */
    @Override
    public Object visit(StringBody n) {
        return n.accept(this);
    }
    
    /**
     * Visit a string escape sequence
     * @param n a string escape sequence
     */
    public Object visit(StringEscapeSeq n) {
        return n.accept(this);
    }
}
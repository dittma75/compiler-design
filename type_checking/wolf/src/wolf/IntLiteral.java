package wolf;

import wolf.interfaces.Arg;
import wolf.interfaces.Visitor;
import wolf.node.TIntNumber;

/**
 * An integer literal, represents an integer
 * @author Kevin Dittmar
 * @author William Ezekiel
 * @author Joseph Alacqua
 * @version Apr 3, 2016
 */
public class IntLiteral implements Arg {
    TIntNumber int_literal;
    
    public IntLiteral(TIntNumber int_literal) {
        this.int_literal = int_literal;
    }
    
    /**
     * Accepts a visitor
     * @param v a visitor
     * @return the type of this IntLiteral, INTEGER
     */
    @Override
    public Type accept(Visitor v) {
        return new Type(FlatType.INTEGER);
    }
    
    public String toString() {
        return int_literal.getText();
    }
}

package wolf.enums;

import wolf.interfaces.UnaryOp;
import wolf.interfaces.Visitor;
import wolf.node.THead;
import wolf.node.TLast;
import wolf.node.TLength;
import wolf.node.TReverse;
import wolf.node.TTail;

/**
 *
 * @author Kevin Dittmar
 * @version Apr 5, 2016
 */
public enum NativeListUnaryOp implements UnaryOp {
    HEAD(THead.class),
    TAIL(TTail.class),
    REVERSE(TReverse.class),
    LAST(TLast.class),
    LENGTH(TLength.class);
    
    final Class token_class;
    
    /**
     * Create a NativeListUnaryOp
     * @param token_class the class of the token being represented
     */
    NativeListUnaryOp(Class token_class) {
        this.token_class = token_class;
    }
    
    @Override
    public String toString() {
        return EnumReporter.report(token_class);
    }

    @Override
    public Object accept(Visitor v) {
        return null;
    }
}

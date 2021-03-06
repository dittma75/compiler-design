package wolf;

import java.util.List;
import wolf.interfaces.Arg;
import wolf.interfaces.StringMiddle;
import wolf.interfaces.Visitor;

/**
 * A string in the WOLF language
 * @author Kevin Dittmar
 * @author William Ezekiel
 * @author 
 * @version Apr 3, 2016
 */
public class WolfString implements Arg {
    List<StringMiddle> string;
    
    public WolfString(List<StringMiddle> string) {
        this.string = string;
    }
    
    /**
     * Accept a visitor
     * @param v a visitor
     * @return 
     */
    @Override
    public Object accept(Visitor v) {
        return new Type(FlatType.STRING);
    }
}

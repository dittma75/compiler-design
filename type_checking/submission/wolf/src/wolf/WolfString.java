package wolf;

import java.util.List;
import wolf.interfaces.Arg;
import wolf.interfaces.StringMiddle;
import wolf.interfaces.Visitor;

/**
 * A string in the WOLF language
 * @author Kevin Dittmar
 * @author William Ezekiel
 * @author Joe Alacqua
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
     * @return the String type
     */
    @Override
    public Type accept(Visitor v) {
        return new Type(FlatType.STRING);
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(StringMiddle middle:string) {
            sb.append(middle.toString());
        }
        return sb.toString();
    }
}

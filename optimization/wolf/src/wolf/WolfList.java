package wolf;

import java.util.List;
import wolf.interfaces.Arg;
import wolf.interfaces.ListArgument;
import wolf.interfaces.ListElement;
import wolf.interfaces.Visitor;

/**
 * A list object used in the WOLF language
 * @author William Ezekiel
 * @author Kevin Dittmar
 * @author Joseph Alacqua
 * @version Apr 3, 2016
 */
public class WolfList extends Arg implements ListArgument {
    List<ListElement> list_elements;
    
    public WolfList(List<ListElement> arg_list) {
        this.list_elements = arg_list;
    }
    
    /**
     * Accept a visitor
     * @param v a visitor
     * @return the type of this WolfList, LIST
     */
    @Override
    public Object accept(Visitor v) {
        return v.visit(this);
    }
}

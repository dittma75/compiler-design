package wolf;

import wolf.interfaces.UserFuncName;
import wolf.interfaces.Visitor;
import wolf.interfaces.WolfFunction;

/**
 *
 * @author Kevin Dittmar
 * @version Apr 3, 2016
 */
public class UserFunc implements WolfFunction {
    UserFuncName user_func_name;
    ArgList arg_list;
    
    public void accept(Visitor v) {
        v.visit(this);
    }
}

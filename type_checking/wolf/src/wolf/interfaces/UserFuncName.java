package wolf.interfaces;

import wolf.Type;

/**
 * Interface for UserFuncNames in WOLF
 * @author Kevin Dittmar
 * @author William Ezekiel
 * @author Joseph Alacqua
 * @version Apr 3, 2016
 */
public interface UserFuncName {
    Type accept(Visitor v);
}

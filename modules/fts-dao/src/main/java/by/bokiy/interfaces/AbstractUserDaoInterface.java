package by.bokiy.interfaces;

import by.bokiy.damain.AbstractUser;

/**
 * Created with IntelliJ IDEA.
 * User: kiryl
 * Date: 10/4/13
 * Time: 1:45 PM
 * To change this template use File | Settings | File Templates.
 */
public interface AbstractUserDaoInterface {
    AbstractUser find(Long id);
}

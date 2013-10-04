package by.bokiy.dao;

import by.bokiy.damain.AbstractUser;

/**
 * Created with IntelliJ IDEA.
 * User: kiryl
 * Date: 10/4/13
 * Time: 1:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class AbstractUserDao implements AbstractUserDaoInterface{
    @Override
    public AbstractUser find(Long id) {
        System.out.println("Carry out finding user");
        return  null;
    }
}

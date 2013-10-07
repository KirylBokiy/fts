package by.bokiy.services;

import by.bokiy.damain.AbstractUser;
import by.bokiy.dao.AbstractUserDao;
import by.bokiy.dao.AbstractUserDaoInterface;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: kiryl
 * Date: 10/7/13
 * Time: 10:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class AbstractUserService implements AbstractUserServiceLocal{


   private AbstractUserDao abstractUserDao;


    @Override
    public void createOrUpdate(String name,  String authname) {
        AbstractUser abstractUser  = new AbstractUser();
        abstractUser.setAuthName(authname);
        abstractUser.setName(name);
        if (abstractUser.getId() == null){
           abstractUserDao.create(abstractUser);
        } else {
            abstractUserDao.update(abstractUser);
        }
    }

    @Autowired
    public void setAbstractUserDao(AbstractUserDao abstractUserDao) {
        this.abstractUserDao = abstractUserDao;
    }
}

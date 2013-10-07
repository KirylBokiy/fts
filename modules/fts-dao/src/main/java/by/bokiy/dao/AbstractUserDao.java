package by.bokiy.dao;

import by.bokiy.damain.AbstractUser;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created with IntelliJ IDEA.
 * User: kiryl
 * Date: 10/4/13
 * Time: 1:44 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class AbstractUserDao implements AbstractUserDaoInterface{

    @PersistenceContext
    EntityManager em;



    @Override
    public AbstractUser find(Long id) {
        return em.find(AbstractUser.class, id);
    }

    @Override
    public void create(AbstractUser abstractUser) {
        em.persist(abstractUser);
        em.flush();
    }

    @Override
    public void update(AbstractUser abstractUser) {
        em.merge(abstractUser);
        em.flush();
    }
}

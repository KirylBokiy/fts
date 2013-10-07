package by.bokiy.controllers;

import by.bokiy.damain.AbstractUser;
import by.bokiy.services.AbstractUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;

/**
 * Created with IntelliJ IDEA.
 * User: kiryl
 * Date: 10/7/13
 * Time: 10:53 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/user")
public class AbstractUserController {

    private AbstractUserService abstractUserService;

    @Inject
    public void setAbstractUserService(AbstractUserService abstractUserService) {
        this.abstractUserService = abstractUserService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public void createAbstractUser(){
        System.out.println("++++++++++++create++++++++++++++++++++");
        //AbstractUser abstractUser = new AbstractUser();
        //abstractUser.setName(name);
        //abstractUser.setAuthName(authname);
       //abstractUserService.createOrUpdate(name, authname);
    }
}

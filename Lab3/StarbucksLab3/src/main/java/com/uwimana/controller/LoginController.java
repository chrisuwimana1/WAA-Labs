package com.uwimana.controller;

import com.uwimana.domain.User;
import com.uwimana.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.SQLOutput;


@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping(value={"/", "/login"}, method = RequestMethod.GET)
    public String showLoginForm(User user) throws Exception {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User user) throws Exception{

        User loggedInUser = userService.findByName(user.getName());

        if (loggedInUser == null){
            System.out.println("Not found");
            return "login";
        }else{
            if (loggedInUser.getPassword().equals(user.getPassword())){
                return "LoginSuccessful";
            }else{
                System.out.println("Wrong Password");
                return "login";
            }
        }

    }





}

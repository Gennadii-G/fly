package com.jh3.springmvc.controllers;

import com.jh3.springmvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @GetMapping(value = "/login")
    public ModelAndView login(){
        return new ModelAndView("login", "user", new User());
    }

    @PostMapping(value = "/checkUser")
    public ModelAndView checkUser(@ModelAttribute User user){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        if(user.getName().equals("12") && user.getPassword().equals("12")){
            mav.setViewName("checkUser");
        }
        mav.addObject("user", user);
        return mav;
    }
}

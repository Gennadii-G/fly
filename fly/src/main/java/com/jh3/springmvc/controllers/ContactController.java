package com.jh3.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ContactController {

    @RequestMapping(value="/contacts", method = RequestMethod.GET)
    public String initPage(Model model){
        model.addAttribute("number", "345");
        return "contact";
    }
}

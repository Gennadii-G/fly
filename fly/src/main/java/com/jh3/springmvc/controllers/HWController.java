package com.jh3.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HWController {

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model){
        model.addAttribute("greeting", "hello, how are you?)");
        return "login";
    }
    @RequestMapping(value="/helloagain", method=RequestMethod.GET)
    public String sayHelloAgain(ModelMap model){
        model.addAttribute("greeting", "hello, again");
        return "login";
    }

    @GetMapping(value = "/search")
    public String test(){
        return "search";
    }

    @GetMapping(value = "/test2")
    public ModelAndView test2(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

}

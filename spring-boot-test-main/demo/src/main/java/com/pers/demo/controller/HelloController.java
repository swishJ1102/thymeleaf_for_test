package com.pers.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @Autowired
    private HttpServletRequest request;
    @GetMapping("/hello")
    public String hello(String name) {
        return "hello";
    }

    @RequestMapping("/submit")
    public ModelAndView testBean(){
        String name = request.getParameter("name");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        return mav;
    }
}

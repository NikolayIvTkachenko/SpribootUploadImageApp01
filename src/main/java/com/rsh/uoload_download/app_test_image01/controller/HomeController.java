package com.rsh.uoload_download.app_test_image01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public ModelAndView home(){
        //return "start";
    	ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("start.html");
        return modelAndView;
    }
	
}

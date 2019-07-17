package com.stackroute.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController
{
      User user = new User("poojitha");

    @RequestMapping("/")
    public ModelAndView display()
    {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("name",user.getUserName());
        return mv;
    }



}



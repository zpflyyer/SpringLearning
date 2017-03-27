package com.pengfei.springmvc.Controller;

import com.pengfei.springmvc.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhaopen on 3/16/2017.
 */
@Controller
@RequestMapping(value = "/")
public class IndexController {

    @Autowired
    StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    ModelAndView getHome(){

        System.out.println("called!");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("studentList",studentService.getAllStudents());
        System.out.println(studentService.getAllStudents());
        modelAndView.setViewName("index");
        return modelAndView;
    }
}

package org.java.spring.hello_spring_mvc.controllers;
import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
@RequestMapping("/")


public class HelloController {

    @GetMapping("/hello")
        public String hello(){
            return "hello";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/time")
    @ResponseBody
    public String time() {
        return "<html>"
        +"<body>"
        +"<h1>Sono le:" + LocalTime.now() +"<h1>"
        +"<body>"
        +"<html>";
    }

    @GetMapping()
    public String redirectHello(){
        return "redirect:/hello";
    }
    
    @GetMapping("/utente")
    public String utente (Model model, @RequestParam (name="name")String name, @RequestParam(name = "surname") String surname) {
        model.addAttribute("name", name);
        model.addAttribute("surname", surname);
        return "utente";
    }
    
    
}

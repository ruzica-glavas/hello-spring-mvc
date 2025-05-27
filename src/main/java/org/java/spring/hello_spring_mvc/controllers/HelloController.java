package org.java.spring.hello_spring_mvc.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")


public class HelloController {

    @GetMapping("/")
        public String hello(){
            return "hello";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }
    
}

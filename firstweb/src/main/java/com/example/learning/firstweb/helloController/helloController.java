package com.example.learning.firstweb.helloController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello first webapp with Spring Boot";
    }

    @RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}

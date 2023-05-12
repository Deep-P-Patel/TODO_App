package com.springboot.todo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
public class HelloContoller {

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello()
    {
        return "How are you doing?";
    }

    @RequestMapping("/helloJsp")
    public String sayHelloJSP()
    {
        return "sayHello";
    }
}

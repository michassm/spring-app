package com.michas.spring_app.Controller;

import com.michas.spring_app.Service.HelloWorldService;
import com.michas.spring_app.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;


    @GetMapping
    public String helloWorld(){
        return helloWorldService.helloWorld("michas");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id,@RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body){
        return "Hello World " + filter;
    }
}

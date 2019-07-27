package com.dev.ecommerce.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("apiapi")
public class HelloWorldResource {

    @RequestMapping(method = RequestMethod.GET, path = "hello")
    public String sayHello() {
        return "Hello World!";
    }
}

package com.devtraining.mission1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {
    @RequestMapping("/test")
    public String hello()
    {

        return "Hello World";
    }
}

package io.alexc.demoapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "demo")
public class DemoController {

    @RequestMapping(value = "hello")
    public String testController() {
        return "Hello World!";
    }

}

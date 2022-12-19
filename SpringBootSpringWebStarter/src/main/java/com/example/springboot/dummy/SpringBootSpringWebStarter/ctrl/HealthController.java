package com.example.springboot.dummy.SpringBootSpringWebStarter.ctrl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String index() {
        return "Basic SpringBoot Spring Web starter!";
    }

}

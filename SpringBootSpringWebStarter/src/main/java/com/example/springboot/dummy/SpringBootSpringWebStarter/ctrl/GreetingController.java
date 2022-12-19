package com.example.springboot.dummy.SpringBootSpringWebStarter.ctrl;
import com.example.springboot.dummy.SpringBootSpringWebStarter.service.GreetingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    private Logger logger = LoggerFactory.getLogger(GreetingController.class);

    @GetMapping(value = "/greeting/{type}/ref/{id}")
    public ResponseEntity<?> getGreeting(@PathVariable("type") String classification, @PathVariable int id) {
        logger.info("greeting endpoint hit");
        return ResponseEntity.ok().body(greetingService.getGreeting(id, classification));
    }


}



package pl.devs.mentoring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping(value = "/status")
    public String status() {
        return "Web application running";
    }
}

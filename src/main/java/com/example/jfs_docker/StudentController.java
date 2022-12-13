package com.example.jfs_docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class StudentController {

    @GetMapping("/Hello Docker")
    public String sayHello() {
        return "Hello Docker";
    }
}

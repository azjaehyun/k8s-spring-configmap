package com.example.k8sspringconfigmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class K8sSpringConfigmapApplication {

    public static void main(String[] args) {
        SpringApplication.run(K8sSpringConfigmapApplication.class, args);
    }

    @RequestMapping("/api")
    public String test(){
        return "test";
    }

}

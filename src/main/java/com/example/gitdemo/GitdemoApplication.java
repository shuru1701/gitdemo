package com.example.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableAutoConfiguration
@RestController
@SpringBootApplication

public class GitdemoApplication {


    @RequestMapping("/hello/{name}")
    public String Hello(@PathVariable("name") String name){
        return  "hello, " + name +",this is spring boot demo";
    }
	public static void main(String[] args) {
		SpringApplication.run(GitdemoApplication.class, args);
	}

}

package com.cultureofcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class HelloWorld {

  public static void main(String[] args) {
    SpringApplication.run(HelloWorld.class, args);
  }

  @RequestMapping(path = "/", method = RequestMethod.GET)
  @ResponseBody
  public String helloWorld() {
    return "<h1>hello world!</h1>";
  }
}

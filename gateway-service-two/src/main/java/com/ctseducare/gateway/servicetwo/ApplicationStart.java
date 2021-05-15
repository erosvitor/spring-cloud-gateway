package com.ctseducare.gateway.servicetwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApplicationStart {

  public static void main(String[] args) {
    SpringApplication.run(ApplicationStart.class, args);
  }
  
  @GetMapping("/servicetwo")
  public String hello() {
    return "Hello, I am service TWO from Gateway sample!!!";
  }

}

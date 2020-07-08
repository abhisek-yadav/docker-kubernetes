package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisitCountController {

  @GetMapping("/ping")
  public String ping() {
    System.err.println("ping call");
    return "Hello World!";
  }

}

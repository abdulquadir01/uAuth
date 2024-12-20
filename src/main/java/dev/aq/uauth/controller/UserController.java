package dev.aq.uauth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/demo-controller")
public class UserController {

  @GetMapping
  public ResponseEntity<String> helloWorld() {
    return ResponseEntity.ok("hello from secured endpoint");
  }

}

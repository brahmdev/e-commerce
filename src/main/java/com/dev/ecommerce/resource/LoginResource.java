package com.dev.ecommerce.resource;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("login")
public class LoginResource {

  @RequestMapping(method = POST)
  public void authenticate() {
  }
}
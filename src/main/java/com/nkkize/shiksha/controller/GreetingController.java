package com.nkkize.shiksha.controller;

import com.nkkize.shiksha.model.User;
import com.nkkize.shiksha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting/api")
public class GreetingController {
  
  @Autowired
  private UserService userService;
  
  @GetMapping("/hello")
  public String salutation() {
    return "Hello World!";
  }
  
  
  /*
   * @RequestParams extract values from the query string, the parameter is URL decoded 
   * @PathVariables extract values from the URI path, it’s not encoded
   * @PathVariable(required = false)
   * A single @RequestParam can have multiple values. Eg: @RequestParam List<String> id
   * */
  @PostMapping("/save")
  public String save(@RequestParam("name") String name) {
    User user = new User();
    user.setName(name);
    user = userService.saveUser(user);
    String userId = user.getId().toString();
    return userId;
  }
  
  
  @GetMapping("/request/{id}")
  public String showParams(@PathVariable String id) {
    return "ID is: "+id;
  }
  

}

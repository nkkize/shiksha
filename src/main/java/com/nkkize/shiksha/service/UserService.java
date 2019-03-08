package com.nkkize.shiksha.service;

import com.nkkize.shiksha.model.User;
import com.nkkize.shiksha.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  
  @Autowired
  private UserRepository userRepository;

  public User saveUser(User user) {
    return userRepository.save(user);
  }
  
  public User getUserByName(String name) {
    return userRepository.findByName(name);
  }
}

package com.nkkize.shiksha.repository;

import com.nkkize.shiksha.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author narenderk
 *
 */
@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{
  
  
  @Autowired
  UserRepository userRepo;

  @Override
  public void run(String... args) throws Exception {
    User user = new User();
    user.setName("Kavya");
    userRepo.save(user);
    List<User> users = userRepo.findAll();
    System.out.println(users.toString());    
  }

}

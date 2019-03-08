package com.nkkize.shiksha;

import com.nkkize.shiksha.controller.GreetingController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import spock.lang.Specification;

@SpringBootTest
@AutoConfigureMockMvc
@WebMvcTest
public class LoadContextTest extends Specification {
  
  @Autowired
  private GreetingController greetingController;
  
  def "when context is loaded then all expected beans are created"() {
    expect: "the WebController is created"
    greetingController
  }

}

package com.nkkize.shiksha.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class AppStartRunner implements ApplicationRunner {

  static final Logger logger = LoggerFactory.getLogger(AppStartRunner.class);

  @Override
  public void run(ApplicationArguments args) throws Exception {
    logger.info("******* ------ ***** ---- The app started with application Runner.");
  }

}

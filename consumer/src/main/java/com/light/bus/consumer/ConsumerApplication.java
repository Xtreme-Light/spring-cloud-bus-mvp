package com.light.bus.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ConsumerApplication {


  public static void main(String[] args) {
    try  {

      SpringApplication.run(ConsumerApplication.class,
          args);
    } catch (Exception e) {
      log.error("启动异常",e);
    }
  }


}

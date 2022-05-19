package com.light.bus.consumer;

import com.light.bus.consumer.consumer.DemoConsumer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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

  @Bean
  public DemoConsumer demoConsumer() {
    return new DemoConsumer();
  }
}

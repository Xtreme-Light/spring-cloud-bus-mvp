package com.light.bus.supplier;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.config.EnableIntegration;

@SpringBootApplication
@Slf4j
@EnableIntegration
public class SupplierApplication {


  public static void main(String[] args) {
    try {
      SpringApplication.run(SupplierApplication.class,
          args);
    } catch (Exception e) {
      log.error("启动异常", e);
      throw e;
    }

  }

}

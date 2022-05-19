package com.light.bus.consumer.listener;


import com.light.bus.consumer.event.CustomerEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
@Slf4j
public class CustomEventListener {


  @EventListener(classes = CustomerEvent.class)
  public void listener(CustomerEvent customerEvent) {
    log.info("接收到事件{}", customerEvent);
    final Object source = customerEvent.getSource();
    log.info("接收到事件源{}", source);
  }
}

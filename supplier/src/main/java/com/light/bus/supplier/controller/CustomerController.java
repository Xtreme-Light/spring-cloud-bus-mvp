package com.light.bus.supplier.controller;

import com.light.bus.supplier.event.CustomerEvent;
import com.light.bus.supplier.gateway.DemoGateway;
import com.light.bus.supplier.model.Data;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.bus.ServiceMatcher;
import org.springframework.cloud.bus.event.PathDestinationFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CustomerController {

  @Setter(onMethod_ = {@Autowired})
  private ApplicationEventPublisher publisher;
  @Setter(onMethod_ = {@Autowired})
  PathDestinationFactory pathDestinationFactory;
  @Setter(onMethod_ = {@Autowired})
  private ServiceMatcher serviceMatcher;
  @Setter(onMethod_ = {@Autowired})
  private DemoGateway demoGateway;

  @GetMapping
  public void hello() {
    final Data data = new Data();
    data.setAge(100);
    data.setName("hello");
    final CustomerEvent customerEvent = new CustomerEvent(CustomerController.class,
        serviceMatcher.getBusId(),
        pathDestinationFactory.getDestination(null), data);

    publisher.publishEvent(customerEvent);
  }

  @GetMapping("/stream")
  public void stream() {
    final Data data = new Data();
    data.setAge(1000);
    data.setName("hello stream");
    demoGateway.send(data);
  }
}

package com.light.bus.supplier.gateway;

import com.light.bus.supplier.model.Data;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface DemoGateway {

  @Gateway(requestChannel = "MVP_STREAM_OUTPUT")
  void send(Data data);
}

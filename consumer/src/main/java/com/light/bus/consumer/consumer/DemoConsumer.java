package com.light.bus.consumer.consumer;

import com.light.bus.consumer.model.Data;
import java.util.function.Consumer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoConsumer implements Consumer<Data> {

  @Override
  public void accept(Data data) {
    log.info("接收到 数据 {}",data);
  }
}

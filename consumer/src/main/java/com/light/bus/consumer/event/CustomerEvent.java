package com.light.bus.consumer.event;

import com.google.common.base.MoreObjects;
import com.light.bus.consumer.model.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cloud.bus.event.Destination;
import org.springframework.cloud.bus.event.RemoteApplicationEvent;

@Getter
@Setter
public class CustomerEvent extends RemoteApplicationEvent {

  private Data data;

  public CustomerEvent() {
    super();
  }

  public CustomerEvent(Object source, String originService, Destination destination,Data data) {
    super(source, originService, destination);
    this.data = data;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("data", this.getData()).toString();
  }


}

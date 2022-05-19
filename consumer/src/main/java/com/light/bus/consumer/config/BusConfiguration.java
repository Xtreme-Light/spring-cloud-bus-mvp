package com.light.bus.consumer.config;


import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@RemoteApplicationEventScan("com.light.bus.consumer.event")
public class BusConfiguration {

}

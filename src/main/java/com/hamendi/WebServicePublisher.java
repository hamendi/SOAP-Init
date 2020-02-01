package com.hamendi;

import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class WebServicePublisher {


	@Autowired
	private SpringBus bus;

    @Bean
    public Endpoint endpointHello() {
        System.out.println("WebServicePublisher endpointHello called");
        Endpoint endpoint = new EndpointImpl(bus, new HelloWsImpl());
        endpoint.publish("/hello");
        return endpoint;
    }

	@Bean
	public Endpoint endpointBye() {
        System.out.println("WebServicePublisher endpointBye called");
        Endpoint endpoint = new EndpointImpl(bus, new ByeWsImpl());
        endpoint.publish("/bye");
		return endpoint;
	}

}

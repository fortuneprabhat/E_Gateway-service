package com.gatewayService.E_Gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gatewayService.E_Gatewayservice.filters.AddRequestHeaderFilters;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@Configuration
public class EGatewayServiceApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(EGatewayServiceApplication.class, args);
	}

	@Bean
	public AddRequestHeaderFilters addRequestHeaderFilters() {
		return new AddRequestHeaderFilters();
	}
}

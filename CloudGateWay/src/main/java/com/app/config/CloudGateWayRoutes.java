package com.app.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudGateWayRoutes {

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		//@formatter:off
		return builder.routes()
				.route("OrderService", r -> r.path("/orders/**")
						.uri("http://orderservice:9091"))
				.route("PaymentService", r -> r.path("/payment/**")
						.uri("http://paymentservice:9092"))				
				.build();
		//@formatter:on
	}

}

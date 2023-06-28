package Apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class config {
	@Bean
public RouteLocator allroutes(RouteLocatorBuilder route)
	{
	return route.routes()
			.route(cart->cart
		    .path("/cart/*")
		    .uri("http://localhost:8084"))
			
			.route(payment->payment
			.path("/payment/*")
			.uri("http://localhost:8085"))
			
			.route(product->product
			.path("/product/*")
			.uri("http://localhost:9091"))
			
			.route(profile->profile 
			.path("/profile/*")
			.uri("http://localhost:8007"))

			.route(order->order 
			.path("/order/*")
			.uri("http://localhost:9099"))

			
		    .build();
	
}

}
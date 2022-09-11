package com.api.project.mapperMarsPhotoRover.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
  
	private String baseURLCenter = "https://api.nasa.gov";
	
	@Bean
	public WebClient webClient(WebClient.Builder builder) {
		return builder
				.baseUrl(baseURLCenter)
				.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				.build();
	}
}

package com.api.project.mapperMarsPhotoRover.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class ConfigCors implements WebMvcConfigurer {
   
	 public  void AddCorsMappins(CorsRegistry registry) {
		 registry.addMapping("/**");
	 }
}

package com.api.project.mapperMarsPhotoRover.service;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.api.project.mapperMarsPhotoRover.model.MarsRoverResponse;

import reactor.core.publisher.Mono;

@Service
public class ServiceMarsRover {

	private WebClient webClient;
	private String keyAPI = "O9GhnLpLgZPJ6ZvdMEaDtqXZUmnbdVC1tlf9SG55&";

	public ServiceMarsRover(WebClient webClient) {
		this.webClient = webClient;
	}

	public MarsRoverResponse MarsRoverBase(Integer marsSol , String roverType, String camera, Integer page) {
 			String urlAPI = "/mars-photos/api/v1/rovers/"+roverType+"/photos?"+camera+"&sol="+marsSol+"&page="+page+"&api_key="+keyAPI;
 			
		Mono<MarsRoverResponse> bodyResponse = this.webClient
				.method(HttpMethod.GET)
				.uri(urlAPI)
				.retrieve()
				.bodyToMono(MarsRoverResponse.class);
		MarsRoverResponse marsRoberBase = bodyResponse.block();
		System.out.println(marsRoberBase);
		return marsRoberBase;
		
  	}
}













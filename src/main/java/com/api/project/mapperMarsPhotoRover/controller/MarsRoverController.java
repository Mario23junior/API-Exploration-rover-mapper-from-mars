package com.api.project.mapperMarsPhotoRover.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.project.mapperMarsPhotoRover.model.MarsRoverResponse;
import com.api.project.mapperMarsPhotoRover.service.ServiceMarsRover;

@RestController
@RequestMapping("/api/photos/marsrover/")
public class MarsRoverController {
   
	ServiceMarsRover service;
	
	public MarsRoverController(	ServiceMarsRover service) {
		this.service = service;
 	}
	
	@GetMapping()
	public MarsRoverResponse listAllDataBase(@RequestParam(required=false) String marsRoverData,
			@RequestParam(required = false) Integer marsSol,
	        @RequestParam(required = false) String robomars,
	        @RequestParam(required = false) String camera,
	        @RequestParam(required = false) Integer page)
	      {
		return service.MarsRoverBase(marsSol, robomars, camera, page);
	}
}

package com.api.project.mapperMarsPhotoRover.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cameras {
 
	private Long id;
	
	private String name;
	
	@JsonProperty("rover_id")
	private String roverId;
	
	@JsonProperty("rover_name")
	private String fullName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoverId() {
		return roverId;
	}

	public void setRoverId(String roverId) {
		this.roverId = roverId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	
}

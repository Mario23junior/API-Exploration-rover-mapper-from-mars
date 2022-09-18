package com.api.project.mapperMarsPhotoRover.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarsPhotoDto {

	private Long id;
	private Integer sol;
 
	@JsonProperty("img_src")
	private String img;

	@JsonProperty("earth_date")
	private String earth_date;

 
	public MarsPhotoDto() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getSol() {
		return sol;
	}

	public void setSol(Integer sol) {
		this.sol = sol;
	}

 

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getEarth_date() {
		return earth_date;
	}

	public void setEarth_date(String earth_date) {
		this.earth_date = earth_date;
	}
 
	 

}

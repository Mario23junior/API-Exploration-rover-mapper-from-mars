package com.api.project.mapperMarsPhotoRover.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarsPhoto {

	private Long id;
	private Integer sol;
	private Cameras camera;
	
	@JsonProperty("img_src")
	private String img;

	@JsonProperty("earth_date")
	private String earth_date;
	private MarsRover rover;
	
	public MarsPhoto() {
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

	public Cameras getCamera() {
		return camera;
	}

	public void setCamera(Cameras camera) {
		this.camera = camera;
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

	public MarsRover getRover() {
		return rover;
	}

	public void setRover(MarsRover rover) {
		this.rover = rover;
	}

	@Override
	public String toString() {
		return "MarsPhoto [id=" + id + ", sol=" + sol + ", camera=" + camera + ", img=" + img + ", earth_date="
				+ earth_date + ", rover=" + rover + "]";
	}
	
	

}

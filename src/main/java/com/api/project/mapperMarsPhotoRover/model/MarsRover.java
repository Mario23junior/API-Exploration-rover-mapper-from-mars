package com.api.project.mapperMarsPhotoRover.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarsRover {
  
	private Long id;
	
	@JsonProperty("name")
	private String nome;
	
	@JsonProperty("landing_date")
	private Date landingDate;
	
	private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getLandingDate() {
		return landingDate;
	}

	public void setLandingDate(Date landingDate) {
		this.landingDate = landingDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}


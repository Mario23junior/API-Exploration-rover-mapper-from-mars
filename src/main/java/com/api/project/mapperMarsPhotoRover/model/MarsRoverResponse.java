package com.api.project.mapperMarsPhotoRover.model;

import java.util.ArrayList;
import java.util.List;

public class MarsRoverResponse {

	List<MarsPhoto> photos = new ArrayList<>();

	 
	@Override
	public String toString() {
		return "MarsRoverResponse [photos=" + photos + "]";
	}


	public List<MarsPhoto> getPhotos() {
		return photos;
	}
}

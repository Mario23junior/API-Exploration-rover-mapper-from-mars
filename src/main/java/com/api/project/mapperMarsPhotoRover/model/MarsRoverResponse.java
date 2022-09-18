package com.api.project.mapperMarsPhotoRover.model;

import java.util.ArrayList;
import java.util.List;

public class MarsRoverResponse {

	List<MarsPhoto> photos = new ArrayList<>();

	public List<MarsPhoto> getPhotos() {
		return photos;
	}

	@Override
	public String toString() {
		return "MarsRoverResponse [photos=" + photos + "]";
	}
 
	 	
}

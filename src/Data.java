package com.storage;


public class Data {
	public String getName() {
		return name;
	}
	public String getVenue() {
		return venue;
	}

	public void setName( String name ) {
		this.name = name;
	}
	public void setVenue( String venue ) {
		this.venue = venue;
	}
	private Data(){}

	private String name = "";
	private String venue = "";
	private Data instance = new Data();
}
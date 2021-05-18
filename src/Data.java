package com.storage;


public class Data {
	public String getName() {
		return name;
	}
	public String getVenue() {
		return venue;
	}
	public static Data getInstance() {
		return instance;
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
	private static Data instance = new Data();
}
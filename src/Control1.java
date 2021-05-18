package com.controls;

import javafx.scene.control.*;
import javafx.fxml.FXML;

import com.storage.Data;

public class Control1 {
	public void store() {
		Data.getInstance().setName( name.getText() ) ;
		Data.getInstance().setVenue( venue.getText() ) ;
		
	}
	@FXML
	private TextField name;
	@FXML
	private TextField venue;
}
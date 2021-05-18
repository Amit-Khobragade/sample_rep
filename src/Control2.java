package com.controls;

import javafx.scene.control.Label;
import javafx.fxml.FXML;

import com.storage.Data;

public class Control2 {
	public void initialize(){
		name.setText( Data.getInstance().getName() );
		venue.setText( Data.getInstance().getVenue() );
	}
	@FXML
	private Label name;
	@FXML
	private Label venue;
}
package com.controls;

import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

import com.controls.Control1;

public class Control{
	public void initialize() {
		FXMLLoader scene1 = new FXMLLoader( getClass().getResource( "/scene1.fxml" ) );
		try {
			firstScene = (GridPane) scene1.load();
			mainScene.getChildren().add( firstScene );
		}
		catch( Exception ex ){
			System.out.println( "Control initialize error" );
			ex.printStackTrace();
			System.exit( 1 );
		}
		baseControl = scene1.getController();
		Button accept = new Button( "accept" );
		accept.setOnAction( ( ActionEvent e ) -> { handleAction(); });
		firstScene.add( accept, 0, 2, 2, 1 );
	}

	@FXML
	public void handleAction() {
		baseControl.store();
	}
	private Control1 baseControl;
	private GridPane firstScene;
	@FXML
	private HBox mainScene;
}
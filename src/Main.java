package com.sample;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
	@Override
	public void start( Stage primary ) throws Exception {
		Parent root = FXMLLoader.load( getClass().getResource( "/base.fxml" ));
		primary.setTitle( "Bday" );
		primary.setScene( new Scene( root, 500, 500 ));
		primary.show();
	}

	public static void main( String[] args ){
		launch( args );
	}
}
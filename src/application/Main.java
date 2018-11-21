package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	AnchorPane mypane;
	@Override
	public void start(Stage primaryStage) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Diseno.fxml"));
		
		
		try {
			mypane = (AnchorPane) loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		primaryStage.setTitle("Agenda");
		primaryStage.setScene(new Scene(mypane));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

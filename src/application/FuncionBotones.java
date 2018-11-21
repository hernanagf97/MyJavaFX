package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class FuncionBotones {
	private AnchorPane mypane;

	public void Cerrar() {
		System.exit(0);
	}

	@FXML
	public void abrir() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("SegundaPagina.fxml"));

		Stage secondaryStage = new Stage();

		try {
			mypane = (AnchorPane) loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		secondaryStage.setTitle("Agenda");
		secondaryStage.setScene(new Scene(mypane));
		secondaryStage.show();
	}

}

package application;

import java.io.IOException;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class IntroController {
	
	public void onActionJouer() {
		Main.commencerPartie(this);
	}

	public void onActionParametre() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Parametres.fxml"));
		try {
			Scene scene = new Scene(fxmlLoader.load(), 800, 600);
			Stage stage = new Stage();
	        stage.setTitle("Parametres");
	        stage.setScene(scene);
	        stage.show();
		} 
		catch (IOException e) {e.printStackTrace();}
        
	}
	
	public void onActionAide() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Support.fxml"));
		try {
			Scene scene = new Scene(fxmlLoader.load(), 800, 600);
			Stage stage = new Stage();
	        stage.setTitle("Support");
	        stage.setScene(scene);
	        stage.show();
		}
		catch (IOException e) {e.printStackTrace();}
	}
	
	public void onActionQuitter() {
		Platform.exit();
	}

}

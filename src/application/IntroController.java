package application;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.DialogPane;

public class IntroController {
	
	public void onActionJouer() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Partie.fxml"));
        try {
        	Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        	Main.stage.setScene(scene);
        } catch (Exception e) {e.printStackTrace();}
	}

	public void onActionParametre() {
	}
	
	public void onActionAide() {
		
	}
	
	public void onActionQuitter() {
		Platform.exit();
	}

}

package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SupportController {
	@FXML
	private Button boutonRetour = new Button();

	@FXML
	private void retourMethod() {
		Stage stage = (Stage)boutonRetour.getScene().getWindow();
		stage.close();
	}
}

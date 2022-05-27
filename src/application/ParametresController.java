package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class ParametresController {
	
	@FXML
	private ToggleButton dictionnaireBasique;
	@FXML
	private ToggleButton dictionnairePirate;
	private ToggleGroup choixDic = new ToggleGroup();
	@FXML
	private ToggleButton penduPirate;
	@FXML
	private ToggleButton penduLuffy;
	public ToggleGroup choixPendu = new ToggleGroup();
	@FXML
	private Slider taillePoliceSlider;
	@FXML
	private Button boutonAnnuler;
	@FXML
	private Button boutonValider;
	
	@FXML
	private void initialize() {
		dictionnaireBasique.setToggleGroup(choixDic);
		dictionnairePirate.setToggleGroup(choixDic);
		dictionnaireBasique.setSelected(true);
		penduPirate.setToggleGroup(choixPendu);
		penduLuffy.setToggleGroup(choixPendu);
		penduPirate.setSelected(true);
		
		choixDic.selectedToggleProperty().addListener((obsVal, oldVal, newVal) -> {
		    if (newVal == null)
		        oldVal.setSelected(true);
		});
		choixPendu.selectedToggleProperty().addListener((obsVal, oldVal, newVal) -> {
		    if (newVal == null)
		        oldVal.setSelected(true);
		});

	}
	
	@FXML
	private void validerMethod() {
		ToggleButton choixD = (ToggleButton)choixDic.getSelectedToggle();
		String D = choixD.getText();
		if(D.equals("Basique"))
			Main.modele.opt.setChoixDico("Dictionnaires/Dico.txt");
		else
			Main.modele.opt.setChoixDico("Dictionnaires/DicoPirates.txt");
		
		ToggleButton choixP = (ToggleButton)choixPendu.getSelectedToggle();
		String P = choixP.getText();
		if (P.equals(" "))
			Main.modele.opt.setChoixAvatar(1);
		else
			Main.modele.opt.setChoixAvatar(2);
		
		Main.modele.opt.setTaillePolice((int)taillePoliceSlider.getValue());
		Stage stage = (Stage)boutonValider.getScene().getWindow();
		stage.close();
	}
	
	@FXML
	private void annulerMethod() {
		Stage stage = (Stage)boutonAnnuler.getScene().getWindow();
		stage.close();
	}
		
}

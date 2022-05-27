package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class OutroController {
	@FXML
	private Label labelMessage;
	
	@FXML
	private void initialize() {
		String message;
		if (Main.modele.jeu.getNbErreurs() < Main.modele.jeu.getNbMaxErreurs()) {
			switch(Main.modele.jeu.getNbErreurs()) {
				case 0 : message = "Bravo mousaillon ! Tu as trouvé le mot "+Main.modele.jeu.getMotMystere()+" en ne faisant aucune erreur ! Quel énorme bg";break;
				case 1 : message = "Bravo mousaillon ! Tu as trouvé le mot "+Main.modele.jeu.getMotMystere()+" en ne faisant qu'une seule erreur ! Presque parfait, ça donne envie de rejouer";break;
				default : message = "Bravo mousaillon ! Tu as trouvé le mot "+Main.modele.jeu.getMotMystere()+" en ne faisant que "+Main.modele.jeu.getNbErreurs()+" erreurs ! Tu veux rejouer ?";break;
			}
		}
		else
		message = "Dommage... Le mot était "+Main.modele.jeu.getMotMystere()+". Je suis sur que tu y arriveras la prochaine fois !";
		labelMessage.setText(message);
	}
	
	@FXML
	private void rejouerMethod() {	
			Main.commencerPartie(this);
	}
}

package application;


import java.util.Vector;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class PartieController {
	@FXML
	private Label labelMotMystere;
	@FXML
	private Label labelMessage;
	private String nomPendu;
	@FXML
	private ImageView lePendu;
	private String affichageMot = "";
	
	@FXML
	private void initialize() {
		initAffichageMot();
		labelMotMystere.setText(affichageMot);
		if (Main.modele.opt.getChoixAvatar() == 1)
			nomPendu = "pirate";
		else
			nomPendu = "luffy";
		labelMotMystere.setAlignment(Pos.BASELINE_CENTER);
		labelMessage.setStyle("-fx-background-color:  rgb(169,149,123, 0.85); -fx-background-radius:  10; -fx-font: "+(18+(int)(Main.modele.opt.getTaillePolice()*0.5))+" Papyrus;");
	}
	
	private void initAffichageMot () {
		for (int i=0 ; i < Main.modele.jeu.getMotMystere().length() ; i++) {
			affichageMot = affichageMot + "_";
		}
	}
	
	
	public boolean proposerLettre (String s) {
		Vector<Integer> v = new Vector<Integer>();
		Main.modele.jeu.setNbLettresTrouvees(Main.modele.jeu.getNbLettresTrouvees() + Main.modele.jeu.ChercherLettreDansMot(s.charAt(0), v));
		if (v.isEmpty()) {
			Main.modele.jeu.MAJNbErreurs();
			afficherNombreErreurs(Main.modele.jeu.getNbErreurs());
			partieTerminee();
			return false;
		}
		else {
			StringBuilder sb = new StringBuilder(affichageMot);
			for (int i : v) {
		        sb.setCharAt(i, s.charAt(0));
			}
			affichageMot = sb.toString();
			labelMotMystere.setText(affichageMot);
			partieTerminee();
			return true;
		}
	}
	
	public void partieTerminee() {
		if (Main.modele.jeu.getNbErreurs() >= Main.modele.jeu.getNbMaxErreurs() || Main.modele.jeu.ToutTrouve()) {
			try {
				AnchorPane outro = FXMLLoader.load(getClass().getResource("Outro.fxml"));
				Main.root.getChildren().clear();
	        	Main.root.getChildren().add(outro);
				Main.root.getChildren().add(Main.toolBar);
	        } 
			catch (Exception e) {e.printStackTrace();}
		}
	}
	
	
	@FXML
	private ImageView vie1;
	@FXML
	private ImageView vie2;
	@FXML
	private ImageView vie3;
	@FXML
	private ImageView vie4;
	@FXML
	private ImageView vie5;
	@FXML
	private ImageView vie6;
	
	public void afficherNombreErreurs(int nbErreur) {
		
		Image vie = new Image("file:Images/icone_vie_perdue.png");
			
		switch(nbErreur) {
			case 1 : vie1.setImage(vie);break;
			case 2 : vie2.setImage(vie);break;
			case 3 : vie3.setImage(vie);break;
			case 4 : vie4.setImage(vie);break;
			case 5 : vie5.setImage(vie);break;
			case 6 : vie6.setImage(vie);break;
		}
			
		Image pendu = new Image("file:Images/"+nomPendu+"_pendu_"+nbErreur+".png");
		lePendu.setImage(pendu);
	}
	
	
	@FXML
	private Button boutonA;
	@FXML
	private Button boutonB;
	@FXML
	private Button boutonC;
	@FXML
	private Button boutonD;
	@FXML
	private Button boutonE;
	@FXML
	private Button boutonF;
	@FXML
	private Button boutonG;
	@FXML
	private Button boutonH;
	@FXML
	private Button boutonI;
	@FXML
	private Button boutonJ;
	@FXML
	private Button boutonK;
	@FXML
	private Button boutonL;
	@FXML
	private Button boutonM;
	@FXML
	private Button boutonN;
	@FXML
	private Button boutonO;
	@FXML
	private Button boutonP;
	@FXML
	private Button boutonQ;
	@FXML
	private Button boutonR;
	@FXML
	private Button boutonS;
	@FXML
	private Button boutonT;
	@FXML
	private Button boutonU;
	@FXML
	private Button boutonV;
	@FXML
	private Button boutonW;
	@FXML
	private Button boutonX;
	@FXML
	private Button boutonY;
	@FXML
	private Button boutonZ;
	
	
	
	@FXML 
	private void pressBoutonA () {
		if (proposerLettre("A"))
			boutonA.setStyle("-fx-background-color: GREEN;");
		else
			boutonA.setStyle("-fx-background-color: RED;");
		boutonA.setDisable(true);		
	}
	
	@FXML 
	private void pressBoutonB () {
		if (proposerLettre("B"))
			boutonB.setStyle("-fx-background-color: GREEN;");
		else
			boutonB.setStyle("-fx-background-color: RED;");
		boutonB.setDisable(true);	
	}
	
	@FXML 
	private void pressBoutonC () {
		if (proposerLettre("C"))
			boutonC.setStyle("-fx-background-color: GREEN;");
		else
			boutonC.setStyle("-fx-background-color: RED;");
		boutonC.setDisable(true);
	}
	
	@FXML 
	private void pressBoutonD () {
		if (proposerLettre("D"))
			boutonD.setStyle("-fx-background-color: GREEN;");
		else
			boutonD.setStyle("-fx-background-color: RED;");
		boutonD.setDisable(true);
	}
	
	@FXML 
	private void pressBoutonE () {
		if (proposerLettre("E"))
			boutonE.setStyle("-fx-background-color: GREEN;");
		else
			boutonE.setStyle("-fx-background-color: RED;");
		boutonE.setDisable(true);
	}
	
	@FXML 
	private void pressBoutonF () {
		if (proposerLettre("F"))
			boutonF.setStyle("-fx-background-color: GREEN;");
		else
			boutonF.setStyle("-fx-background-color: RED;");
		boutonF.setDisable(true);
	}
	
	@FXML 
	private void pressBoutonG () {
		if (proposerLettre("G"))
			boutonG.setStyle("-fx-background-color: GREEN;");
		else
			boutonG.setStyle("-fx-background-color: RED;");
		boutonG.setDisable(true);
	}
	
	@FXML 
	private void pressBoutonH () {
		if (proposerLettre("H"))
			boutonH.setStyle("-fx-background-color: GREEN;");
		else
			boutonH.setStyle("-fx-background-color: RED;");
		boutonH.setDisable(true);
	}
	
	@FXML 
	private void pressBoutonI () {
		if (proposerLettre("I"))
			boutonI.setStyle("-fx-background-color: GREEN;");
		else
			boutonI.setStyle("-fx-background-color: RED;");
		boutonI.setDisable(true);
	}
	
	@FXML 
	private void pressBoutonJ () {
		if (proposerLettre("J"))
			boutonJ.setStyle("-fx-background-color: GREEN;");
		else
			boutonJ.setStyle("-fx-background-color: RED;");
		boutonJ.setDisable(true);
	}
	
	@FXML 
	private void pressBoutonK () {
		if (proposerLettre("K"))
			boutonK.setStyle("-fx-background-color: GREEN;");
		else
			boutonK.setStyle("-fx-background-color: RED;");
		boutonK.setDisable(true);
	}
	
	@FXML 
	private void pressBoutonL () {
		if (proposerLettre("L"))
			boutonL.setStyle("-fx-background-color: GREEN;");
		else
			boutonL.setStyle("-fx-background-color: RED;");
		boutonL.setDisable(true);
	}
	
	@FXML 
	private void pressBoutonM () {
		if (proposerLettre("M"))
			boutonM.setStyle("-fx-background-color: GREEN;");
		else
			boutonM.setStyle("-fx-background-color: RED;");
		boutonM.setDisable(true);
	}
	
	@FXML 
	private void pressBoutonN () {
		if (proposerLettre("N"))
			boutonN.setStyle("-fx-background-color: GREEN;");
		else
			boutonN.setStyle("-fx-background-color: RED;");
		boutonN.setDisable(true);
	}
	
	@FXML 
	private void pressBoutonO () {
		if (proposerLettre("O"))
			boutonO.setStyle("-fx-background-color: GREEN;");
		else
			boutonO.setStyle("-fx-background-color: RED;");
		boutonO.setDisable(true);
	}
	
	@FXML 
	private void pressBoutonP () {
		if (proposerLettre("P"))
			boutonP.setStyle("-fx-background-color: GREEN;");
		else
			boutonP.setStyle("-fx-background-color: RED;");
		boutonP.setDisable(true);
	}
	
	@FXML 
	private void pressBoutonQ () {
		if (proposerLettre("Q"))
			boutonQ.setStyle("-fx-background-color: GREEN;");
		else
			boutonQ.setStyle("-fx-background-color: RED;");
		boutonQ.setDisable(true);
	}
	
	@FXML 
	private void pressBoutonR () {
		if (proposerLettre("R"))
			boutonR.setStyle("-fx-background-color: GREEN;");
		else
			boutonR.setStyle("-fx-background-color: RED;");
		boutonR.setDisable(true);
	}
	
	@FXML 
	private void pressBoutonS () {
		if (proposerLettre("S"))
			boutonS.setStyle("-fx-background-color: GREEN;");
		else
			boutonS.setStyle("-fx-background-color: RED;");
		boutonS.setDisable(true);
	}
	
	@FXML 
	private void pressBoutonT () {
		if (proposerLettre("T"))
			boutonT.setStyle("-fx-background-color: GREEN;");
		else
			boutonT.setStyle("-fx-background-color: RED;");
		boutonT.setDisable(true);
	}
	
	@FXML 
	private void pressBoutonU () {
		if (proposerLettre("U"))
			boutonU.setStyle("-fx-background-color: GREEN;");
		else
			boutonU.setStyle("-fx-background-color: RED;");
		boutonU.setDisable(true);
	}
	
	@FXML 
	private void pressBoutonV () {
		if (proposerLettre("V"))
			boutonV.setStyle("-fx-background-color: GREEN;");
		else
			boutonV.setStyle("-fx-background-color: RED;");
		boutonV.setDisable(true);
	}
	
	@FXML 
	private void pressBoutonW () {
		if (proposerLettre("W"))
			boutonW.setStyle("-fx-background-color: GREEN;");
		else
			boutonW.setStyle("-fx-background-color: RED;");
		boutonW.setDisable(true);
	}
	
	@FXML 
	private void pressBoutonX () {
		if (proposerLettre("X"))
			boutonX.setStyle("-fx-background-color: GREEN;");
		else
			boutonX.setStyle("-fx-background-color: RED;");
		boutonX.setDisable(true);
	}
	
	@FXML 
	private void pressBoutonY () {
		if (proposerLettre("Y"))
			boutonY.setStyle("-fx-background-color: GREEN;");
		else
			boutonY.setStyle("-fx-background-color: RED;");
		boutonY.setDisable(true);
	}
	
	@FXML 
	private void pressBoutonZ () {
		if (proposerLettre("Z"))
			boutonZ.setStyle("-fx-background-color: GREEN;");
		else
			boutonZ.setStyle("-fx-background-color: RED;");
		boutonZ.setDisable(true);
	}	
}

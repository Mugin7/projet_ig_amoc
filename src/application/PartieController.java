package application;


import java.util.Vector;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PartieController {
	public Label labelMotMystere;
	// private String affichageMot;
	// private ArrayList<Character> motTableau = new ArrayList<>();
	public String nomPendu;
	public ImageView lePendu;
	private String affichageMot = "";
	
	@FXML
	public void initialize() {
		initAffichageMot();
		labelMotMystere.setText(affichageMot);
		if (Main.modele.opt.getChoixAvatar() == 1)
			nomPendu = "pirate";
		else
			nomPendu = "luffy";
		labelMotMystere.setAlignment(Pos.BASELINE_CENTER);
		
	}
	
	private void initAffichageMot () {
		for (int i=0 ; i < Main.modele.getMotMystere().length() ; i++) {
			affichageMot = affichageMot + "_";
		}
	}
	
	
	public boolean proposerLettre (String s) {
		Vector<Integer> v = new Vector<Integer>();
		Main.modele.jeu.setNbLettresTrouvees(Main.modele.jeu.getNbLettresTrouvees() + Main.modele.jeu.ChercherLettreDansMot(s.charAt(0), v));
		if (v.isEmpty()) {
			Main.modele.jeu.MAJNbErreurs();
			afficherNombreErreurs(Main.modele.jeu.getNbErreurs());
			return false;
		}
		else {
			StringBuilder sb = new StringBuilder(affichageMot);
			for (int i : v) {
		        sb.setCharAt(i, s.charAt(0));
			}
			affichageMot = sb.toString();
			labelMotMystere.setText(affichageMot);
			return true;
		}
	}
	
	public ImageView vie1;
	public ImageView vie2;
	public ImageView vie3;
	public ImageView vie4;
	public ImageView vie5;
	public ImageView vie6;
	
	
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
	
	
	
	public Button boutonA;
	public Button boutonB;
	public Button boutonC;
	public Button boutonD;
	public Button boutonE;
	public Button boutonF;
	public Button boutonG;
	public Button boutonH;
	public Button boutonI;
	public Button boutonJ;
	public Button boutonK;
	public Button boutonL;
	public Button boutonM;
	public Button boutonN;
	public Button boutonO;
	public Button boutonP;
	public Button boutonQ;
	public Button boutonR;
	public Button boutonS;
	public Button boutonT;
	public Button boutonU;
	public Button boutonV;
	public Button boutonW;
	public Button boutonX;
	public Button boutonY;
	public Button boutonZ;
	
	
	public void pressBoutonA () {
		if (proposerLettre("A"))
			boutonA.setStyle("-fx-background-color: GREEN;");
		else
			boutonA.setStyle("-fx-background-color: RED;");
		boutonA.setDisable(true);		
	}
	
	public void pressBoutonB () {
		if (proposerLettre("B"))
			boutonB.setStyle("-fx-background-color: GREEN;");
		else
			boutonB.setStyle("-fx-background-color: RED;");
		boutonB.setDisable(true);	
	}
	
	public void pressBoutonC () {
		if (proposerLettre("C"))
			boutonC.setStyle("-fx-background-color: GREEN;");
		else
			boutonC.setStyle("-fx-background-color: RED;");
		boutonC.setDisable(true);
	}
	
	public void pressBoutonD () {
		if (proposerLettre("D"))
			boutonD.setStyle("-fx-background-color: GREEN;");
		else
			boutonD.setStyle("-fx-background-color: RED;");
		boutonD.setDisable(true);
	}
	
	public void pressBoutonE () {
		if (proposerLettre("E"))
			boutonE.setStyle("-fx-background-color: GREEN;");
		else
			boutonE.setStyle("-fx-background-color: RED;");
		boutonE.setDisable(true);
	}
	
	public void pressBoutonF () {
		if (proposerLettre("F"))
			boutonF.setStyle("-fx-background-color: GREEN;");
		else
			boutonF.setStyle("-fx-background-color: RED;");
		boutonF.setDisable(true);
	}
	
	public void pressBoutonG () {
		if (proposerLettre("G"))
			boutonG.setStyle("-fx-background-color: GREEN;");
		else
			boutonG.setStyle("-fx-background-color: RED;");
		boutonG.setDisable(true);
	}
	
	public void pressBoutonH () {
		if (proposerLettre("H"))
			boutonH.setStyle("-fx-background-color: GREEN;");
		else
			boutonH.setStyle("-fx-background-color: RED;");
		boutonH.setDisable(true);
	}
	
	public void pressBoutonI () {
		if (proposerLettre("I"))
			boutonI.setStyle("-fx-background-color: GREEN;");
		else
			boutonI.setStyle("-fx-background-color: RED;");
		boutonI.setDisable(true);
	}
	
	public void pressBoutonJ () {
		if (proposerLettre("J"))
			boutonJ.setStyle("-fx-background-color: GREEN;");
		else
			boutonJ.setStyle("-fx-background-color: RED;");
		boutonJ.setDisable(true);
	}
	
	public void pressBoutonK () {
		if (proposerLettre("K"))
			boutonK.setStyle("-fx-background-color: GREEN;");
		else
			boutonK.setStyle("-fx-background-color: RED;");
		boutonK.setDisable(true);
	}
	
	public void pressBoutonL () {
		if (proposerLettre("L"))
			boutonL.setStyle("-fx-background-color: GREEN;");
		else
			boutonL.setStyle("-fx-background-color: RED;");
		boutonL.setDisable(true);
	}
	
	public void pressBoutonM () {
		if (proposerLettre("M"))
			boutonM.setStyle("-fx-background-color: GREEN;");
		else
			boutonM.setStyle("-fx-background-color: RED;");
		boutonM.setDisable(true);
	}
	
	public void pressBoutonN () {
		if (proposerLettre("N"))
			boutonN.setStyle("-fx-background-color: GREEN;");
		else
			boutonN.setStyle("-fx-background-color: RED;");
		boutonN.setDisable(true);
	}
	
	public void pressBoutonO () {
		if (proposerLettre("O"))
			boutonO.setStyle("-fx-background-color: GREEN;");
		else
			boutonO.setStyle("-fx-background-color: RED;");
		boutonO.setDisable(true);
	}
	
	public void pressBoutonP () {
		if (proposerLettre("P"))
			boutonP.setStyle("-fx-background-color: GREEN;");
		else
			boutonP.setStyle("-fx-background-color: RED;");
		boutonP.setDisable(true);
	}
	
	public void pressBoutonQ () {
		if (proposerLettre("Q"))
			boutonQ.setStyle("-fx-background-color: GREEN;");
		else
			boutonQ.setStyle("-fx-background-color: RED;");
		boutonQ.setDisable(true);
	}
	
	public void pressBoutonR () {
		if (proposerLettre("R"))
			boutonR.setStyle("-fx-background-color: GREEN;");
		else
			boutonR.setStyle("-fx-background-color: RED;");
		boutonR.setDisable(true);
	}
	
	public void pressBoutonS () {
		if (proposerLettre("S"))
			boutonS.setStyle("-fx-background-color: GREEN;");
		else
			boutonS.setStyle("-fx-background-color: RED;");
		boutonS.setDisable(true);
	}
	
	public void pressBoutonT () {
		if (proposerLettre("T"))
			boutonT.setStyle("-fx-background-color: GREEN;");
		else
			boutonT.setStyle("-fx-background-color: RED;");
		boutonT.setDisable(true);
	}
	
	public void pressBoutonU () {
		if (proposerLettre("U"))
			boutonU.setStyle("-fx-background-color: GREEN;");
		else
			boutonU.setStyle("-fx-background-color: RED;");
		boutonU.setDisable(true);
	}
	
	public void pressBoutonV () {
		if (proposerLettre("V"))
			boutonV.setStyle("-fx-background-color: GREEN;");
		else
			boutonV.setStyle("-fx-background-color: RED;");
		boutonV.setDisable(true);
	}
	
	public void pressBoutonW () {
		if (proposerLettre("W"))
			boutonW.setStyle("-fx-background-color: GREEN;");
		else
			boutonW.setStyle("-fx-background-color: RED;");
		boutonW.setDisable(true);
	}
	
	public void pressBoutonX () {
		if (proposerLettre("X"))
			boutonX.setStyle("-fx-background-color: GREEN;");
		else
			boutonX.setStyle("-fx-background-color: RED;");
		boutonX.setDisable(true);
	}
	
	public void pressBoutonY () {
		if (proposerLettre("Y"))
			boutonY.setStyle("-fx-background-color: GREEN;");
		else
			boutonY.setStyle("-fx-background-color: RED;");
		boutonY.setDisable(true);
	}
	
	public void pressBoutonZ () {
		if (proposerLettre("Z"))
			boutonZ.setStyle("-fx-background-color: GREEN;");
		else
			boutonZ.setStyle("-fx-background-color: RED;");
		boutonZ.setDisable(true);
	}	
}

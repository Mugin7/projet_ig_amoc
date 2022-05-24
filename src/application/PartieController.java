package application;

import java.util.ArrayList;
import java.util.Vector;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class PartieController {
	private Modele modele = Main.modele;
	public Label labelMotMystere;
	private String affichageMot;
	// private ArrayList<Character> motTableau = new ArrayList<>();
	public ImageView lePendu;
	private String motMystere = "POMME"; // modele.getMotMystere();
	private String motMystereCache = "";
	
	public void debutPartie () {
		initAffichageMot();
		labelMotMystere.setText(motMystereCache);
		
	}
	
	private void initAffichageMot () {
		/* motTableau.ensureCapacity(motMystere.length());
		for (int i=0 ; i < motMystere.length() ; i++) {
			motTableau.set(i, motMystere.charAt(i));
		}*/
		for (int i=0 ; i < motMystere.length() ; i++) {
			motMystereCache = motMystereCache + "_";
		}
	}
	
	
	public void proposerLettre (String s) {
		Vector<Integer> v = new Vector<Integer>();
		modele.jeu.setNbLettresTrouvees(modele.jeu.getNbLettresTrouvees() + modele.jeu.ChercherLettreDansMot(s.charAt(0), v));
	}
	
	
	public void pressBoutonA () {
		proposerLettre("A");
	}
	
	public void pressBoutonB () {
		proposerLettre("B");	
	}
	
	public void pressBoutonC () {
		proposerLettre("C");
	}
	
	public void pressBoutonD () {
		proposerLettre("D");
	}
	
	public void pressBoutonE () {
		proposerLettre("E");
	}
	
	public void pressBoutonF () {
		proposerLettre("F");
	}
	
	public void pressBoutonG () {
		proposerLettre("G");
	}
	
	public void pressBoutonH () {
		proposerLettre("H");
	}
	
	public void pressBoutonI () {
		proposerLettre("I");
	}
	
	public void pressBoutonJ () {
		proposerLettre("J");
	}
	
	public void pressBoutonK () {
		proposerLettre("K");
	}
	
	public void pressBoutonL () {
		proposerLettre("L");
	}
	
	public void pressBoutonM () {
		proposerLettre("M");
	}
	
	public void pressBoutonN () {
		proposerLettre("N");
	}
	
	public void pressBoutonO () {
		proposerLettre("O");
	}
	
	public void pressBoutonP () {
		proposerLettre("P");
	}
	
	public void pressBoutonQ () {
		proposerLettre("Q");
	}
	
	public void pressBoutonR () {
		proposerLettre("R");
	}
	
	public void pressBoutonS () {
		proposerLettre("S");
	}
	
	public void pressBoutonT () {
		proposerLettre("T");
	}
	
	public void pressBoutonU () {
		proposerLettre("U");
	}
	
	public void pressBoutonV () {
		proposerLettre("V");
	}
	
	public void pressBoutonW () {
		proposerLettre("W");
	}
	
	public void pressBoutonX () {
		proposerLettre("X");
	}
	
	public void pressBoutonY () {
		proposerLettre("Y");
	}
	
	public void pressBoutonZ () {
		proposerLettre("Z");
	}	
}

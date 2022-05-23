package application;

public class Modele {
	private GestionJeu jeu;
	private GestionOption opt;

	public Modele() {
		this.opt = new GestionOption();
		try {
			this.jeu = new GestionJeu(opt.getChoixDico());
		} catch (Exception e) {}
	}
}

package application;

public class Modele {
	public GestionJeu jeu;
	public GestionOption opt;

	public Modele() {
		this.opt = new GestionOption();
		try {
			this.jeu = new GestionJeu(opt.getChoixDico());
		} catch (Exception e) {}
	}
	
	public void InitPartie() {
		jeu.InitialiserPartie();
	}
	
	public int getTaillePolice () {
		return opt.getTaillePolice();
	}
	
	public int getChoixAvatar () {
		return opt.getChoixAvatar();
	}
	
	public String getMotMystere () {
		return jeu.getMotMystere();
	}
}

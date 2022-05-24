package application;

public class GestionOption {
	private int taillePolice = 1;
	private String choixDico = "Dictionnaires/Dico.txt";
	private int choixAvatar = 1;
	
	public GestionOption() {}
	
	public GestionOption (int taillePo, String choixDic, int choixAvatar) {
		taillePolice = taillePo;
		choixDico = choixDic;
		this.choixAvatar = choixAvatar;
	}
	
	public int getTaillePolice() {
		return taillePolice;
	}
	
	public String getChoixDico() {
		return choixDico;
	}
	
	public int getChoixAvatar () {
		return choixAvatar;
	}
	
	public void setTaillePolice(int taille) {
		this.taillePolice = taille;
	}
	
	public void setChoixDico (String dic) {
		this.choixDico = dic;
	}
	
	public void setChoixAvatar (int avatar) {
		if (avatar != 1 && avatar != 2)
			throw new IllegalArgumentException();
		this.choixAvatar = avatar;
	}
	
	

}

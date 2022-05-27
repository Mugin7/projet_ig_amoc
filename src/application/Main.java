package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	
	public static Modele modele;
	public static AnchorPane root = new AnchorPane();
	public static Parent toolBar;
	
	@Override
	public void init()
	{
		Main.modele = new Modele();
	}
	@Override
	public void start(Stage primaryStage) {
		try {
			toolBar = FXMLLoader.load(getClass().getResource("ToolBar.fxml"));
			AnchorPane intro = FXMLLoader.load(getClass().getResource("Intro.fxml"));
			root.getChildren().add(intro);
	        Scene scene = new Scene(root, 800, 600);
	        primaryStage.setTitle("Le Pendu AMOC");
	        primaryStage.setScene(scene);
	        primaryStage.show();
		} 
		catch(Exception e) {e.printStackTrace();}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	

	public static void commencerPartie(Object o) {
        try {
        	Main.modele.jeu = new GestionJeu(Main.modele.opt.getChoixDico());
    		Main.modele.jeu.InitialiserPartie();
    		Main.modele.jeu.setNbMaxErreurs(7);
    		AnchorPane partie = FXMLLoader.load(o.getClass().getResource("Partie.fxml"));
    		Main.root.getChildren().clear();
        	Main.root.getChildren().add(partie);
			Main.root.getChildren().add(Main.toolBar);
        } catch (Exception e) {e.printStackTrace();}
	}
}

package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class Main extends Application {
	
	public static Modele modele;
	public  static Stage stage;
	@Override
	public void init()
	{
		Main.modele = new Modele();
		Main.modele.jeu.InitialiserPartie();
		Main.modele.jeu.setNbMaxErreurs(6);
	}
	@Override
	public void start(Stage primaryStage) {
		try {
			Main.stage = primaryStage;
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Partie.fxml"));
	        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
	        stage.setTitle("Le Pendu AMOC");
	        stage.setScene(scene);
	        stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

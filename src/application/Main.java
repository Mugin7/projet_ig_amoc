package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class Main extends Application {
	
	public static Modele modele;
	@Override
	public void init()
	{
		this.modele = new Modele();
	}
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Partie.fxml"));
	        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
	        primaryStage.setTitle("Le Pendu AMOC");
	        primaryStage.setScene(scene);
	        primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

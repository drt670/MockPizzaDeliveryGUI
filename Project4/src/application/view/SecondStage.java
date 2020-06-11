package application.view;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SecondStage extends Application {

	
	private Stage primaryStage;
	private BorderPane mainLayout;
	
	@Override
	public void start(Stage primaryStage) {
		try 
		{
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Pizza Order");
			showMainView();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Method to create and show scene created through FXML
	 * @throws IOException
	 */
    public void showMainView() throws IOException
    {
	    FXMLLoader loader = new FXMLLoader();
        loader.setLocation(SecondStage.class.getResource("MainOutput.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
    /**
     * Main function to launch scene
     * @param args
     */
	public static void main(String[] args) {
		launch(args);
	}
}

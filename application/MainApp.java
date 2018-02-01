package application;

import java.io.IOException;

import controller.SongController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Song;

public class MainApp extends Application {
	private ObservableList<Song> songData = FXCollections.observableArrayList();
	public ObservableList<Song> getsongData (){
		return songData;
	}
	@Override
	public void start(Stage primaryStage) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/application/test.fxml"));
		AnchorPane root = (AnchorPane) loader.load();

		// ListController listController = loader.getController();
		// listController.start(primaryStage);
		
		

		Scene scene = new Scene(root, 600, 300);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();

	}
	public void showSongdata() {
		try {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/application/test.fxml"));
			AnchorPane Songdata = (AnchorPane) loader.load();
			SongController controller = loader.getController();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}

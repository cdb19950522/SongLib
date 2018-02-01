package controller;

import application.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;
import model.Song;

public class SongController {
	@FXML
	private TableView<Song> songTable;
	@FXML
	private TableColumn<Song, String> nameColumn;
	@FXML
	private TableColumn<Song, String> artistColumn;
	@FXML
	private Text Nametext;
	@FXML
	private Text Artisttext;
	@FXML
	private Text Albumtext;
	@FXML
	private Text Yeartext;

	// Reference to the main application
	private MainApp mainApp;

	@FXML
	private void initialize() {
		nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameproperty());
		artistColumn.setCellValueFactory(cellData -> cellData.getValue().artistproperty());
	}

	public void setMainAPP(MainApp mainApp) {
		this.mainApp = mainApp;
		songTable.setItems(mainApp.getsongData());
	}

}

package GUI;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
	@FXML
	private TextField idTfield;
	@FXML
	private PasswordField password;
	@FXML
	private Button loginBtn;
	private Stage stage;
	
	public Controller() {
		
	@FXML
	loginBtn.setOnAction(e -> {
		FXMLLoader.load(getClass().getResource("Home.fxml"));
		
	});
}
}

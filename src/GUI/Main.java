package GUI;

import tps_hr.TPS;

import javafx.fxml.*;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.event.*;



public class Main extends Application{
	
	@FXML
	private Button LoginBtn;
	@FXML
	private TextField id;
	@FXML
	private PasswordField password;
	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
			
			Scene scene = new Scene(root);
			
			LoginBtn.setOnAction((ActionEvent event)->{
				
			});
			
			stage.setScene(scene);
			stage.show();
		}catch(Exception e) {
			e.printStackTrace();
		} 
	}
	public static void main(String[] args) {
		
		launch(args);
	}
}
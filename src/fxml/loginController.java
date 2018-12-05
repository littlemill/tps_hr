package fxml;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.event.*;

import java.util.Map;

import tps_hr.*;

public class loginController extends newMain{
	    @FXML
	    private TextField idTfield;

	    @FXML
	    private PasswordField password;

	    @FXML
	    private Button loginBtn;

	    @FXML
	    private AnchorPane mainLayout;
	    
	    @FXML
	    void setOnAction(ActionEvent event) {
	    	login lgin = new login();
	    	Map<String,String> check = lgin.getLoginInfo();
	    	String id = idTfield.getText();
	    	String pass = password.getText();
	    	if(check.get(id) == null ||check.get(id) == pass) {
	    		Alert alert = new Alert(AlertType.ERROR);
				alert.setContentText("Login fail");
				alert.show();
	    	}else {
	    		try{
	    			switchScene("Home.fxml");
	    		}catch(Exception e) {
	    			e.printStackTrace();
	    		}
	    	}
	    
	    }

}

	


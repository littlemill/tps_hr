package fxml;


import java.util.ArrayList;

import javafx.event.ActionEvent;

import picture.*;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import tps_hr.*;


public class ProfileController  {
	@FXML
	private TextArea profileTextArea;

	@FXML
	private ImageView userImage;

	@FXML
	private Button showProfileBtn;

	@FXML
	private Button backBtn;
	
	
	
	@FXML
	void setOnActionShowProfile(ActionEvent event) {
		Main.startThread();
		EmployeeType type = Main.user.getType();
		Employee employee;
		userImage.setImage(new Image("/picture/"+Main.user.getName().toLowerCase()+".jpg"));
		switch (type) {
			case CEO: 
				employee = (CEO) Main.user;
				break;
			case EVP: 
				employee = (EVP) Main.user;
				break;
			case Finance: 
				employee = (Finance) Main.user;
				break;
			case GA: 
				employee = (GA) Main.user;
				break;
			case Sales: 
				employee = (Sales) Main.user;
				break;
			case Engineer: 
				employee = (Operation) Main.user;
				break;
			default:
				employee = (CEO) Main.user;
		}
		profileTextArea.setText(employee.toString());
		Main.stopThread();
	}
	
	@FXML
	void setOnActionBackBtn(ActionEvent event) {
		Main.startThread();
		Main.switchScene("Home.fxml");
		Main.stopThread();
	}
}


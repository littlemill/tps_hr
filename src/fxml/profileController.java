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


public class profileController  {
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
		EmployeeType type = newMain.user.getType();
		System.out.println(newMain.user.getType().toString());
		Employee employee;
		userImage.setImage(new Image("/picture/"+newMain.user.getName().toLowerCase()+".jpg"));
		switch (type) {
			case CEO: 
				employee = (CEO) newMain.user;
				break;
			case EVP: 
				employee = (EVP) newMain.user;
				break;
			case Finance: 
				employee = (Finance) newMain.user;
				break;
			case GA: 
				employee = (GA) newMain.user;
				break;
			case Sales: 
				employee = (Sales) newMain.user;
				break;
			case Engineer: 
				employee = (Operation) newMain.user;
				break;
			default:
				employee = (CEO) newMain.user;
		}
		profileTextArea.setText(employee.toString());

	}
	
	@FXML
	void setOnActionBackBtn(ActionEvent event) {
		newMain.switchScene("Home.fxml");
	}
}


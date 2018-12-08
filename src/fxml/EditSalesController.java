package fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import tps_hr.Project;

public class EditSalesController {
	 @FXML
	 private TextField codeTfield;

	 @FXML
	 private Button backBtn;

	 @FXML
	 private Button searchBtn;

	 @FXML
	 private Label label;
	    
	 @FXML
	 void setOnActionSearchBtn(ActionEvent event) {
		 Main.stopThread();
		 if(codeTfield.getText()==null) {
	    		Alert alert = new Alert(AlertType.ERROR);
	    		alert.setContentText("Please fill Project Code");
	    		alert.show();
	    		Main.startThread();
	    	}else {
	    		int prjCode = Integer.parseInt(codeTfield.getText());
	        	if(prjCode>Main.tps.getLatestProjectCode()) {
	        		Alert alert = new Alert(AlertType.ERROR);
	        		alert.setContentText("Invalid Project Code");
	        		alert.show();
	        		Main.startThread();
	        	}
	        	Project prj = Main.tps.projectCodeToProject(prjCode);
	        	label.setText(prj.toString());
	        	Main.startThread();
	    	}
	 }
	 
	 @FXML
	 void setOnActionBackBtn(ActionEvent event) {
		 Main.stopThread();
		 Main.switchScene("Home.fxml");
		 Main.startThread();
	 }

}

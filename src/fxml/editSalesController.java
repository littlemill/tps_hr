package fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import tps_hr.Project;

public class editSalesController extends newMain {
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
		 if(codeTfield.getText()==null) {
	    		Alert alert = new Alert(AlertType.ERROR);
	    		alert.setContentText("Please fill Project Code");
	    		alert.show();
	    	}else {
	    		int prjCode = Integer.parseInt(codeTfield.getText());
	        	if(prjCode>newMain.tps.getLatestProjectCode()) {
	        		Alert alert = new Alert(AlertType.ERROR);
	        		alert.setContentText("Invalid Project Code");
	        		alert.show();
	        	}
	        	Project prj = newMain.tps.projectCodeToProject(prjCode);
	        	label.setText(prj.toString());
	    	}
	 }
	 
	 @FXML
	 void setOnActionBackBtn(ActionEvent event) {
		 switchScene("Home.fxml");
	 }

}

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
	    		String prjCode = codeTfield.getText();
	    		Project prj = Main.tps.projectCodeToProject(prjCode);
	    		Project checkProject = Main.tps.getProjectList().get(Main.tps.getProjectList().size()-1);
	        	if(Main.tps.projectCodeToProject(prjCode).equals(checkProject) && !(checkProject.getProjectCode().equals(prj.getProjectCode()))){
	        		Alert alert = new Alert(AlertType.ERROR);
	        		alert.setContentText("Invalid Project Code");
	        		alert.show();
	        		Main.startThread();
	        	}
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

package fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import tps_hr.*;

public class editOperationController {
	@FXML
    private TextField codeTfield;

    @FXML
    private TextField expenseTfield;

    @FXML
    private Button backBtn;

    @FXML
    private Button searchBtn;

    @FXML
    private Label label;

    @FXML
    private CheckBox implementCheck;

    @FXML
    private Button addBtn;

    @FXML
    private Button saveBtn;
    
 
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
    void setOnActionAddBtn(ActionEvent event) {
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
        	prj.setTravelExpenses(Integer.parseInt(expenseTfield.getText()));
        	prj.getEngineer().setAnnualTravelExpense(prj.getEngineer().getAnnualTravelExpense()+Integer.parseInt(expenseTfield.getText()));
        	expenseTfield.setDisable(true);
        	addBtn.setDisable(true);
    	}
    }
    
    @FXML
    void setOnActionSaveBtn(ActionEvent event) {
    	if(!implementCheck.isSelected()) {
    		Alert alert = new Alert(AlertType.ERROR);
    		alert.setContentText("Please make sure this project has already been implemented.");
    		alert.show();
    	}else {
		if(codeTfield.getText()==null || !addBtn.isDisable() ) {
        		Alert alert = new Alert(AlertType.ERROR);
        		alert.setContentText("Please fill in every details to complete the task");
        		alert.show();
        	}else {
        		int prjCode = Integer.parseInt(codeTfield.getText());
            	if(prjCode>newMain.tps.getLatestProjectCode()) {
            		Alert alert = new Alert(AlertType.ERROR);
            		alert.setContentText("Invalid Project Code");
            		alert.show();
            	}
            	Project prj = newMain.tps.projectCodeToProject(prjCode);
            	prj.setImplemented(true);
        	}
    	}
    }
    
    @FXML
    void setOnActionBackBtn(ActionEvent event) {
    	newMain.switchScene("Home.fxml");
    }
}


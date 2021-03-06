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

public class EditOperationController {
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
    void setOnActionAddBtn(ActionEvent event) {
    	Main.stopThread();
    	if(codeTfield.getText().equals("")) {
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
        	//System.out.println("hello");
        	int expenses = Integer.parseInt(expenseTfield.getText());
        	prj.setTravelExpenses(expenses);
        	prj.getEngineer().setAnnualTravelExpense(prj.getEngineer().getAnnualTravelExpense()+Integer.parseInt(expenseTfield.getText()));
        	expenseTfield.setDisable(true);
        	addBtn.setDisable(true);
        	Main.startThread();
    	}
    }
    
    
    @FXML
    void setOnActionSaveBtn(ActionEvent event) {
    	Main.stopThread();
    	if(!implementCheck.isSelected()) {
    		Alert alert = new Alert(AlertType.ERROR);
    		alert.setContentText("Please make sure this project has already been implemented.");
    		alert.show();
    		Main.startThread();
    	}else {
		if(codeTfield.getText().equals("") || !addBtn.isDisable() ) {
        		Alert alert = new Alert(AlertType.ERROR);
        		alert.setContentText("Please fill in every details to complete the task");
        		alert.show();
        		Main.startThread();
        	}else {
            	Project prj = Main.tps.projectCodeToProject(codeTfield.getText());
            	prj.setImplemented(true);
            	Main.startThread();
        	}
    	}
    }
    
    @FXML
    void setOnActionBackBtn(ActionEvent event) {
    	Main.stopThread();
    	Main.switchScene("Home.fxml");
    	Main.startThread();
    }
}


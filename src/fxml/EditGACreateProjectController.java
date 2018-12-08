package fxml;

import tps_hr.*;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EditGACreateProjectController {
	@FXML
    private TextField codeTfield;

    @FXML
    private TextField costTfield;

    @FXML
    private TextArea note;

    @FXML
    private TextField orgTfield;

    @FXML
    private Button announceBtn;

    @FXML
    private Button clearBtn;

    @FXML
    private Button createProjBtn;

    @FXML
    private TextField saleTfield;

    @FXML
    private Button backBtn;

    @FXML
    private Button createBtn;

    @FXML
    private TextField engTfield;
    
    @FXML
    private CheckBox ceoCheck;
    
    @FXML 
    private CheckBox evpCheck;
    
    @FXML
    private Button genBtn;
    
    @FXML
    private TextField nameTfield;
    
    @FXML
    void setOnActionAddAnnoucement(ActionEvent event) {
    	Main.stopThread();
    	Main.switchScene("EditGAannounce.fxml");
    	Main.startThread();
    }
    
    @FXML
    void setOnActionBackBtn(ActionEvent event) {
    	Main.stopThread();
    	Main.switchScene("Home.fxml");
    	Main.startThread();
    }
    
    @FXML
    void setOnActionGenBtn(ActionEvent event) {
    	Main.stopThread();
    	codeTfield.setText(Integer.toString(Main.tps.getLatestProjectCode()));
    	Main.startThread();
    }
    
    @FXML
    void setOnActionClearBtn(ActionEvent event) {
    	Main.stopThread();
    	codeTfield.setText(null);
    	costTfield.setText(null);
    	note.setText(null);
    	orgTfield.setText(null);
    	saleTfield.setText(null);
    	engTfield.setText(null);
    	Main.startThread();
    }
    @FXML
    void setOnActionCreatebutton(ActionEvent event) {
    	Main.stopThread();
    	if(!ceoCheck.isSelected()&&!evpCheck.isSelected()) {
    		Alert alert = new Alert(AlertType.WARNING);
    		alert.setContentText("Please get the project approved by CEO and EVP");
    		alert.show();
    		Main.startThread();
    	}
    	if(!evpCheck.isSelected()) {
    		Alert alert = new Alert(AlertType.WARNING);
    		alert.setContentText("Please get the project approved by EVP");
    		alert.show();
    		Main.startThread();
    	}
    	if(!ceoCheck.isSelected()) {
    		Alert alert = new Alert(AlertType.WARNING);
    		alert.setContentText("Please get the project approved by CEO");
    		alert.show();
    		Main.startThread();
    	}else {
    		boolean findsale = false;
    		boolean findeng = false;
    		Sales sales = new Sales();
    		Operation engineer = new Operation();
    		for(Sales s:Main.tps.getSalesList()) {
    			if(s.getName().equals(saleTfield.getText())) {
    				sales = s;
    				findsale = true;
    				break;
    			}
    		}
    		if(!findsale) {
    			Alert alert = new Alert(AlertType.ERROR);
    			alert.setContentText("Sales name :"+saleTfield.getText()+" doesn't exist.\n"+"Please fill the correct name.");
    			alert.show();
    			Main.startThread();
    		}
    		for(Operation e: Main.tps.getOperationList()) {
    			if(e.getName().equals(engTfield.getText())) {
    				engineer = e;
    				findeng = true;
    				break;
    			}
    		}
    		if(!findeng) {
    			Alert alert = new Alert(AlertType.ERROR);
    			alert.setContentText("Engineer name :"+engTfield.getText()+" doesn't exist.\n"+"Please fill the correct name.");
    			alert.show();
    			Main.startThread();
    		}
    		GA ga = (GA) Main.user;
    		Project prj = new Project(nameTfield.getText(),sales,engineer);
    		prj.setProjectCode(ga.generateProjectCode());
    		Main.tps.getCeoList().get(0).approveProject(prj.getProjectCode());
    		Main.tps.getEvpList().get(0).approveProject(prj.getProjectCode());
    		prj.setOrganization(orgTfield.getText());
    		prj.setApprovedbyCEO(true);
    		prj.setApprovedbyEVP(true);
    		Main.tps.addProject(prj);
    		Main.startThread();
    	}
    }

}



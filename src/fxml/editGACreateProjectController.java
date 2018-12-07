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

public class editGACreateProjectController extends newMain {
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
    	newMain.sceneManager.switchScene("EditGAannounce.fxml");
    }
    
    @FXML
    void setOnActionBackBtn(ActionEvent event) {
    	newMain.sceneManager.switchScene("Home.fxml");
    }
    
    @FXML
    void setOnActionGenBtn(ActionEvent event) {
    	codeTfield.setText(Integer.toString(newMain.tps.getLatestProjectCode()));
    }
    
    @FXML
    void setOnActionClearBtn(ActionEvent event) {
    	codeTfield.setText(null);
    	costTfield.setText(null);
    	note.setText(null);
    	orgTfield.setText(null);
    	saleTfield.setText(null);
    	engTfield.setText(null);
    }
    @FXML
    void setOnActionCreatebutton(ActionEvent event) {
    	if(!ceoCheck.isSelected()&&!evpCheck.isSelected()) {
    		Alert alert = new Alert(AlertType.WARNING);
    		alert.setContentText("Please get the project approved by CEO and EVP");
    		alert.show();
    	}
    	if(!evpCheck.isSelected()) {
    		Alert alert = new Alert(AlertType.WARNING);
    		alert.setContentText("Please get the project approved by EVP");
    		alert.show();
    	}
    	if(!ceoCheck.isSelected()) {
    		Alert alert = new Alert(AlertType.WARNING);
    		alert.setContentText("Please get the project approved by CEO");
    		alert.show();
    	}else {
    		boolean findsale = false;
    		boolean findeng = false;
    		Sales sales = new Sales();
    		Operation engineer = new Operation();
    		for(Sales s:newMain.tps.getSalesList()) {
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
    		}
    		for(Operation e: newMain.tps.getOperationList()) {
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
    		}
    		GA ga = (GA) newMain.user;
    		Project prj = new Project(nameTfield.getText(),sales,engineer);
    		prj.setProjectCode(ga.generateProjectCode());
    		newMain.tps.getCeoList().get(0).approveProject(prj.getProjectCode());
    		newMain.tps.getEvpList().get(0).approveProject(prj.getProjectCode());
    		prj.setOrganization(orgTfield.getText());
    		prj.setApprovedbyCEO(true);
    		prj.setApprovedbyEVP(true);
    		newMain.tps.addProject(prj);
    	}
    }

}



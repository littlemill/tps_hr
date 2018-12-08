package fxml;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import tps_hr.*;

public class TimeSheetController {
	@FXML
    private Button backBtn;

    @FXML
    private Button createBtn;

    @FXML
    private Label label;
    
    @FXML
    private Button showTimeBtn;
    
    @FXML
    void setOnActionCreateNewTimeSheet(ActionEvent event) {
    	Main.startThread();
    	Main.switchScene("CreateTimeSheet.fxml");
    	Main.stopThread();
    }
    
    @FXML
    void setOnActionBackBtn(ActionEvent event) {
    	Main.startThread();
    	Main.switchScene("Home.fxml");
    	Main.stopThread();
    }
    
    @FXML
    void setOnActionShowTimeBtn(ActionEvent event) {
    	Main.startThread();
    	String data = "TimeSheet: "+Main.user.getName()+" "+Main.user.getSurname()+"\n";
    	if(Main.user.getTimeSheetList().isEmpty()) {
    		data += "No Timesheet to be shown.";
    	}else {
    		for(TimeSheet ts: Main.user.getTimeSheetList()) {
    			data+=ts.toString()+"\n";
    		}
    	}
    	label.setText(data);
    	Main.stopThread();
    }
}

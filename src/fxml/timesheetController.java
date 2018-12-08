package fxml;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import tps_hr.*;

public class timesheetController {
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
    	//newMain.switchScene("createTimeSheet.fxml");
    	System.out.println("createTimeSheets");
    }
    
    @FXML
    void setOnActionBackBtn(ActionEvent event) {
    	newMain.switchScene("Home.fxml");
    }
    
    @FXML
    void setOnActionShowTimeBtn(ActionEvent event) {
    	System.out.println(newMain.user.getName());
    	String data = "TimeSheet: "+newMain.user.getName()+" "+newMain.user.getSurname()+"\n";
    	if(newMain.user.getTimeSheetList().isEmpty()) {
    		data += "No Timesheet to be shown.";
    	}else {
    		for(TimeSheet ts: newMain.user.getTimeSheetList()) {
    			data+=ts.toString()+"\n";
    		}
    	}
    	label.setText(data);
    }
}

package fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import tps_hr.*;

public class timesheetController extends newMain {
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
    	switchScene("createTimeSheet.fxml");
    }
    
    @FXML
    void setOnActionBackBtn(ActionEvent event) {
    	switchScene("Home.fxml");
    }
    
    @FXML
    void setOnActionShowTimeBtn(ActionEvent event) {
    	String data = "TimeSheet: " +newMain.user.getName()+" "+newMain.user.getSurname()+"\n";
    	for(TimeSheet ts:newMain.user.getTimeSheetList()) {
    		data+=ts.toString()+"\n";
    	}
    	label.setText(data);
    }
}

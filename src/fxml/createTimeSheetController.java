package fxml;

import java.util.Calendar;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import tps_hr.Employee;
import tps_hr.TimeSheet;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class createTimeSheetController {
	@FXML
    private Button submitBtn;

    @FXML
    private Button backBtn;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TextField endTimeTfield;

    @FXML
    private TextArea noteTarea;

    @FXML
    private TextField startTimeTfield;
    
    @FXML
    void setOnActionSubmitBtn(ActionEvent event) {
    	if(datePicker.getPromptText() == "pick the date") {
    		Alert alert = new Alert(AlertType.ERROR);
    		alert.setContentText("Please pick the date");
    		alert.show();
    	}
    	if(startTimeTfield.getText() == null) {
    		Alert alert = new Alert(AlertType.ERROR);
    		alert.setContentText("Please fill Start time");
    		alert.show();
    	}
    	if(endTimeTfield.getText() ==  null) {
    		Alert alert = new Alert(AlertType.ERROR);
    		alert.setContentText("Please fill End time");
    		alert.show();
    	}
    	else {
    		if(noteTarea.getText() == null) noteTarea.setText("-");
    		TimeSheet TS = new TimeSheet(startTimeTfield.getText(),endTimeTfield.getText(),noteTarea.getText(),newMain.user);
    		newMain.user.getTimeSheetList().add(TS);    		
    		
    		Alert alert = new Alert(AlertType.CONFIRMATION);
    		alert.setTitle("Your Time Sheet has been confirmed");
    		alert.setContentText("TimeSheet was created at"+Calendar.getInstance().getTime().toString());
    		ButtonType okButton = new ButtonType("OK", ButtonData.YES);
        	alert.getButtonTypes().setAll(okButton);
        	alert.showAndWait().ifPresent(type -> {
       	       	alert.close();
        		newMain.switchScene("TimeSheet.fxml");
        	});
    		
    	}
    }
    @FXML
    void setOnActionBackBtn(ActionEvent event) {
    	newMain.switchScene("TimeSheet.fxml");
    }
}

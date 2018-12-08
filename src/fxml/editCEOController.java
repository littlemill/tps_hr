package fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import tps_hr.CEO;


public class editCEOController {
	@FXML
    private Label label;

    @FXML
    private Button backBtn;

    @FXML
    private Button showAllMemberBtn;
    
    @FXML
    void setOnActionShowAllMemberBtn(ActionEvent event) {
    	CEO ceo = (CEO) newMain.user;
    	label.setText(ceo.printAllMembers());
    }
    
    @FXML
    void setOnActionBackBtn(ActionEvent event) {
    	newMain.switchScene("Home.fxml");
    }
}

package fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import tps_hr.CEO;


public class editCEOController extends newMain {
	@FXML
    private Label Label;

    @FXML
    private Button backBtn;

    @FXML
    private Button showAllMemberBtn;
    
    @FXML
    void setOnActionShowAllMemberBtn(ActionEvent event) {
    	CEO ceo = (CEO) newMain.user;
    	Label.setText(ceo.printAllMembers());
    }
    
    @FXML
    void setOnActionBackBtn(ActionEvent event) {
    	newMain.sceneManager.switchScene("Home.fxml");
    }
}

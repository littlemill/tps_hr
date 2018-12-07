package fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import tps_hr.EVP;

public class editEVPController extends newMain {
	@FXML
    private Label Label;

    @FXML
    private Button backBtn;

    @FXML
    private Button showAllMemberBtn;
    
    @FXML
    void setOnActionShowAllMemberBtn(ActionEvent event) {
    	EVP evp = (EVP) newMain.user;
    	Label.setText(evp.printOperationMembers());
    }
    
    @FXML
    void setOnActionBackBtn(ActionEvent event) {
    	newMain.sceneManager.switchScene("Home.fxml");
    }
}

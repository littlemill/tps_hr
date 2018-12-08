package fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import tps_hr.EVP;

public class EditEVPController {
	@FXML
    private Text text;

    @FXML
    private Button backBtn;

    @FXML
    private Button showAllMemberBtn;
    
    @FXML
    void setOnActionShowAllMemberBtn(ActionEvent event) {
    	Main.stopThread();
    	EVP evp = (EVP) Main.user;
    	text.setText(evp.printOperationMembers());
    	Main.startThread();
    }
    
    @FXML
    void setOnActionBackBtn(ActionEvent event) {
    	Main.stopThread();
    	Main.switchScene("Home.fxml");
    	Main.startThread();
    }
}

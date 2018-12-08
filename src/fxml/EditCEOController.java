package fxml;

import javafx.event.ActionEvent;
import javafx.scene.text.Text;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import tps_hr.CEO;


public class EditCEOController {

    @FXML
    private Button backBtn;

    @FXML
    private Button showAllMemberBtn;
    
    @FXML
    private Text text;
    
    @FXML
    void setOnActionShowAllMemberBtn(ActionEvent event) {
    	Main.stopThread();
    	CEO ceo = (CEO) Main.user;
    	text.setText(ceo.printAllMembers());
    	Main.startThread();
    }
    
    @FXML
    void setOnActionBackBtn(ActionEvent event) {
    	Main.stopThread();
    	Main.switchScene("Home.fxml");
    	Main.startThread();
    }
}

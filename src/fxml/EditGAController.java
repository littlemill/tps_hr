package fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class EditGAController {
	@FXML
    private Button announceBtn;

    @FXML
    private Button createProjBtn;

    @FXML
    private Button backBtn;
    
    @FXML
    void setOnActionAnnounceBtn(ActionEvent event) {
    	Main.stopThread();
    	Main.switchScene("EditGAannounce.fxml");
    	Main.startThread();
    }
    
    @FXML
    void setOnActionCreatePrj(ActionEvent event) {
    	Main.stopThread();
    	Main.switchScene("EditGAcreateProj.fxml");
    	Main.startThread();
    }
    
    @FXML
    void setOnActionBackBtn(ActionEvent event) {
    	Main.stopThread();
    	Main.switchScene("Home.fxml");
    	Main.startThread();
    }
}

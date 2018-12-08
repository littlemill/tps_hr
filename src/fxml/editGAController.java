package fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class editGAController {
	@FXML
    private Button announceBtn;

    @FXML
    private Button createProjBtn;

    @FXML
    private Button backBtn;
    
    @FXML
    void setOnActionAnnounceBtn(ActionEvent event) {
    	newMain.switchScene("EditGAannounce.fxml");
    }
    
    @FXML
    void setOnActionCreatePrj(ActionEvent event) {
    	newMain.switchScene("EditGAcreateProj.fxml");
    }
    
    @FXML
    void setOnActionBackBtn(ActionEvent event) {
    	newMain.switchScene("Home.fxml");
    }
}

package fxml;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import tps_hr.GA;
import javafx.scene.control.Alert.AlertType;

public class EditGAanounceController {

    @FXML
    private Button announceBtn;

    @FXML
    private Button createProjBtn;

    @FXML
    private Button cancelBtn;

    @FXML
    private Button backBtn;

    @FXML
    private TextField authorTfield;

    @FXML
    private TextField headerTfield;

    @FXML
    private Button addBtn;

    @FXML
    private TextArea announcement;
    
    @FXML
    void setOnActionAddAnnouncement(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setContentText("You are already in 'Add Annoucement' page.");
    	alert.show();
    }
    @FXML
    void setOnActionCreateProject(ActionEvent event) {
    	Main.stopThread();
    	Main.startThread();
    	Main.switchScene("EditGAcreateProj.fxml");
    }
    
    @FXML
    void setOnActionBackBtn(ActionEvent event) {
    	Main.stopThread();
    	Main.switchScene("Home.fxml");
    	Main.startThread();
    }
    
    @FXML
    void setOnActionAddBtn(ActionEvent event) {
    	Main.stopThread();
    	if (headerTfield.getText().equals("") || announcement.getText().equals("") || authorTfield.getText().equals("")) {
    		Alert alert = new Alert(AlertType.WARNING);
    		alert.setContentText("In order to complete the task, Please fill in all the details.");
    		alert.show();
    		Main.startThread();
    	}
    	else {
    		GA ga = (GA) Main.user;
    		ga.addNotification(headerTfield.getText(), announcement.getText());
    		Main.startThread();
    	}
    }
    
    @FXML
    void setOnActionCancelBtn(ActionEvent event) {
    	Main.stopThread();
    	Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
    	alert.setTitle("Cancel the task");
    	alert.setHeaderText("Your announcement wil not be added");
    	alert.setContentText("Are you sure to cancel this announcement?");
    	alert.showAndWait().filter(ButtonType.OK::equals).ifPresent(type -> {
    	    headerTfield.setText("");
    	    announcement.setText("");
    	    authorTfield.setText("");
    	    Main.startThread();
    	});
    }

}

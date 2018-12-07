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

public class editGAanounceController extends newMain {

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
    	switchScene("EditGAcreateProj.fxml");
    }
    
    @FXML
    void setOnActionBackBtn(ActionEvent event) {
    	switchScene("Home.fxml");
    }
    
    @FXML
    void setOnActionAddBtn(ActionEvent event) {
    	if (headerTfield.getText().equals(null) || announcement.getText().equals(null) || authorTfield.getText().equals(null)) {
    		Alert alert = new Alert(AlertType.WARNING);
    		alert.setContentText("In order to complete the task, Please fill in all the details.");
    		alert.show();
    	}
    	else {
    		GA ga = (GA) newMain.user;
    		ga.addNotification(headerTfield.getText(), announcement.getText());
    	}
    }
    
    @FXML
    void setOnActionCancelBtn(ActionEvent event) {
    	Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
    	alert.setTitle("Cancel the task");
    	alert.setHeaderText("Your announcement wil not be added");
    	alert.setContentText("Are you sure to cancel this announcement?");
    	ButtonType okButton = new ButtonType("Yes", ButtonData.YES);
    	ButtonType noButton = new ButtonType("No", ButtonData.NO);
    	alert.getButtonTypes().setAll(okButton, noButton);
    	alert.showAndWait().ifPresent(type -> {
    	        if (type == ButtonType.OK) {
    	        	headerTfield.setText(null);
    	        	announcement.setText(null);
    	        	authorTfield.setText(null);
    	        }
    	        else {
    	        	alert.close();
    	        }
    	});
    }

}

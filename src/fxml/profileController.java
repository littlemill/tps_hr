package fxml;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class profileController extends newMain {
	@FXML
	private TextArea profileTextArea;

	@FXML
	private ImageView userImage;

	@FXML
	private Button showProfileBtn;

	@FXML
	private Button backBtn;
	
	private Image image;
	
	@FXML
	void setOnActionShowProfile(ActionEvent event) {
		image = new Image(newMain.user.getPhotourl());
		userImage.setImage(image);
		profileTextArea.setText(newMain.user.toString());
	}
	
	@FXML
	void setOnActionBackBtn(ActionEvent event) {
		switchScene("Home.fxml");
	}
}


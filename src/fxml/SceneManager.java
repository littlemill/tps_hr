package fxml;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class SceneManager {
	
	public SceneManager() {
		super();
	}
	
	public void switchScene(String fxmlFile) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
        Parent root;
        try {
            root = (Parent)loader.load();
            newMain.stage.setScene(new Scene(root));
            newMain.stage.show();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

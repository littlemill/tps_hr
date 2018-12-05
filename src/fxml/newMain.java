package fxml;

import tps_hr.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class newMain extends Application{
	@Override
    public void start(Stage primaryStage) throws Exception{
        try {
        	Parent root = FXMLLoader.load(getClass().getResource("/src/fxml/Login.fxml"));
        	primaryStage.setTitle("The Practical Solution Co.,Ltd");
            primaryStage.setScene(new Scene(root, 600, 400));
            primaryStage.show();
        }catch(Exception e) {
        	e.printStackTrace();
        }
        
    }


    public static void main(String[] args) {
        launch(args);
    }
}

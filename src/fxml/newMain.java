package fxml;

import tps_hr.*;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class newMain extends Application{
	public static Stage stage;
	public static Employee user;
	public static TPS tps = new TPS();
	
	public static Login login = new Login();
	
	@Override
    public void start(Stage primaryStage) throws Exception{
		newMain.stage = primaryStage;
        try {
        	Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        	newMain.stage.setTitle("The Practical Solution Co.,Ltd");
            newMain.stage.setScene(new Scene(root, 600, 400));
            newMain.stage.show();
        }catch(Exception e) {
        	e.printStackTrace();
        }
        
    }


    public static void main(String[] args) {
        launch(args);
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

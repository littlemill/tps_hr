package fxml;

import tps_hr.*;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class Main extends Application{
	public static Stage stage;
	public static Employee user;
	public static TPS tps = new TPS();
	public static Login login = new Login();
	private static Thread thread;
	public static boolean alertcheck = false;
	
	@Override
    public void start(Stage primaryStage) throws Exception{
		Main.stage = primaryStage;
        try {
        	Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        	Main.stage.setTitle("The Practical Solution Co.,Ltd");
            Main.stage.setScene(new Scene(root, 600, 400));
            Main.stage.show();
        }catch(Exception e) {
        	e.printStackTrace();
        }
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    public static void switchScene(String fxmlFile)
    {

        FXMLLoader loader = new FXMLLoader(Main.class.getResource(fxmlFile));
        Parent root;
        try {
            root = (Parent)loader.load();
            Main.stage.setScene(new Scene(root));
            Main.stage.show();
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    
    public static void startThread() {
		thread = new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(600000);
					Platform.runLater(new Runnable() {
					    @Override
					    public void run() {
					    	try {
					    		if(!Main.alertcheck) {
					    			Alert alert = new Alert(AlertType.ERROR);
					    			alert.setTitle("Out of Time");
					    			alert.setContentText("You have stayed in the page for 10 minutes with out doing anything."+"\n"+"Please login again.");
					    			alert.showAndWait().ifPresent(type->{
					    				Main.switchScene("Login.fxml");
					    			});
								Main.alertcheck = true;
					    		}
					    	}catch (Exception e){
					    		e.printStackTrace();
					    	}
					}
					});
				} catch (Exception e) {
					e.printStackTrace();
	
				}
			}
			
		});
		thread.start();
	}
    
    public static void stopThread() {
    	thread.interrupt();
    }
    
}

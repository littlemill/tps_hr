package fxml;
import tps_hr.*;




import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.*;

public class HomeController {
	 
		@FXML
	    private Button timeSheetBtn;

	    @FXML
	    private Button profileBtn;

	    @FXML
	    private Button payrollBtn;

	    @FXML
	    private Button editBtn;

	    @FXML
	    private Button holidayBtn;

	    @FXML
	    private Button logOutBtn;

	    @FXML
	    private ListView<String> notificationList;
	    
	    public static ObservableList<String> notificationData = FXCollections.observableArrayList();
	    
	    @FXML
	    void setOnActionforTimeSheet(ActionEvent event) {
	    	Main.switchScene("TimeSheet.fxml");
	    	Main.stopThread();
	    	Main.startThread();
	    }

	    @FXML
	    void setOnActionforProfile(ActionEvent event) {
	    	Main.switchScene("Profile.fxml");
	    	Main.stopThread();
	    	Main.startThread();
	    }

	    @FXML
	    void setOnActionforPayroll(ActionEvent event) {
	    	Main.switchScene("Payroll.fxml");
	    	Main.stopThread();
	    	Main.startThread();
	    }

	    @FXML
	    void setOnActionforEdit(ActionEvent event){
	    	try{
	    		Main.stopThread();
	    		String id = Main.user.getId();
	    		String path = "";
    			char checkid = id.charAt(0);
    			if(checkid == '0') { //0-ceo
    				path = "EditCEO.fxml";
    			}
    			if(checkid == '1') { //1-evp
    				path = "EditEVP.fxml";
    			}
    			if(checkid == '2') { //2-sale
    				path = "EditSales.fxml";
    			}
    			if(checkid == '3') { //3-engineer
    				path = "EditOperation.fxml";
    			}
    			if(checkid == '4') { //4-ga
    				path = "EditGA.fxml";
    			}
    			if(checkid == '5') {
    				path = "EditFinance.fxml";
    			}
    			Main.switchScene(path);
    			Main.startThread();
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
	    }

	    @FXML
	    void setOnActionforHoliday(ActionEvent event) {
	    	Main.switchScene("HolidayEntitlement.fxml");
	    	Main.stopThread();
	    	Main.startThread();
	    }
	    @FXML
	    void setOnActionforLogOut(ActionEvent event) {
	    	System.exit(0);
	    }
	    
	    @FXML 
	    public void showNotification() {
	    	Main.stopThread();
	    	Main.startThread();
	    	if(Main.tps.getNotification().isEmpty()) {
	    		notificationData.add("No updated news");
	    	}
	    	else {
	    		for(Notification noti : Main.tps.getNotification()) {
		    		notificationData.add(noti.toString());
		    	}
	    	}
	    	notificationList.setItems(notificationData);
	    }

}
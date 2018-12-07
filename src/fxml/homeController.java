package fxml;
import tps_hr.*;




import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.*;

public class homeController extends newMain {
	 
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
	    
	    private ObservableList<String> notificationData = FXCollections.observableArrayList();
	    
	    @FXML
	    void setOnActionforTimeSheet(ActionEvent event) {
	    	switchScene("TimeSheet.fxml");
	    }

	    @FXML
	    void setOnActionforProfile(ActionEvent event) {
	    	switchScene("Profile.fxml");
	    }

	    @FXML
	    void setOnActionforPayroll(ActionEvent event) {
	    	switchScene("Payroll.fxml");
	    }

	    @FXML
	    void setOnActionforEdit(ActionEvent event){
	    	try{
	    		String id = newMain.user.getId();
    			char checkid = id.charAt(0);
    			if(checkid == '0') { //0-ceo
    				switchScene("editCEO.fxml");
    			}
    			if(checkid == '1') { //1-evp
    				switchScene("editEVP.fxml");
    			}
    			if(checkid == '2') { //2-sale
    				switchScene("editSales.fxml");
    			}
    			if(checkid == '3') { //3-engineer
    				switchScene("editOperation.fxml");
    			}
    			if(checkid == '4') { //4-ga
    	    		switchScene("EditGA.fxml");
    			}
    			if(checkid == '5') {
    				switchScene("editFinance.fxml");
    			}
    			switchScene("Home.fxml");
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
	    }

	    @FXML
	    void setOnActionforHoliday(ActionEvent event) {
	    	switchScene("HolidayEntitilement.fxml");
	    }
	    @FXML
	    void setOnActionforLogOut(ActionEvent event) {
	    	System.exit(0);
	    }
	    
	    @FXML 
	    void showNotification() {
	    	if(newMain.tps.getNotification().isEmpty()) notificationData.add("No updated news");
	    	else {
	    		for(Notification noti : newMain.tps.getNotification()) {
		    		notificationData.add(noti.toString());
		    	}
	    	}
	    	notificationList.setItems(notificationData);
	    }

}
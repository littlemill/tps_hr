package fxml;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;


import java.util.Map;

import tps_hr.*;


public class LoginController {
	    @FXML
	    private TextField idTfield;

	    @FXML
	    private PasswordField password;

	    @FXML
	    private Button loginBtn;

	    @FXML
	    private AnchorPane mainLayout;
	    
	    Login lgin;
	    @FXML
	    void setOnAction(ActionEvent event) {
	    	lgin = Main.login;
	    	Map<String,String> check = lgin.getLoginInfo();
	    	String id = idTfield.getText();
	    	String pass = password.getText();
	    	
	    	if(!check.containsKey(id)) {
	    		Alert alert = new Alert(AlertType.ERROR);
				alert.setContentText("Login fail");
				alert.show();
	    	}else {
	    		if(!check.get(id).equals(pass)) {
		    		Alert alert = new Alert(AlertType.ERROR);
					alert.setContentText("Login fail");
					alert.show();
		    	}else {
		    		try{
		    			char checkid = id.charAt(0);
		    			if(checkid == '0') { //0-ceo
		    				for(CEO e: Main.tps.getCeoList()) {
		    					if(id.equals(e.getId())) {
		    						Main.user = (Employee) e;
		    						break;
		    					}
		    				}
		    			}
		    			if(checkid == '1') { //1-evp
		    				for(EVP e:Main.tps.getEvpList()) {
		    					if(id.equals(e.getId())) {
		    						Main.user = (Employee) e;
		    						break;
		    					}
		    				}
		    			}
		    			if(checkid == '2') { //2-sale
		    				for(Sales s:Main.tps.getSalesList()) {
		    					if(id.equals(s.getId())) {
		    						Main.user = (Employee) s;
		    						break;
		    					}
		    				}
		    			}
		    			if(checkid == '3') { //3-engineer
		    				for(Operation o:Main.tps.getOperationList()) {
		    					if(id.equals(o.getId())) {
		    						Main.user = (Employee) o;
		    						break;
		    					}
		    				}
		    			}
		    			if(checkid == '4') { //4-ga
		    				for(GA g:Main.tps.getGaList()) {
		    					if(id.equals(g.getId())) {
		    						Main.user = (Employee) g;
		    						break;
		    					}
		    				}
		    			}
		    			if(checkid == '5') {
		    				for(Finance f:Main.tps.getFinanceList()) {
		    					if(id.equals(f.getId())) {
		    						Main.user = (Employee) f;
		    						break;
		    					}
		    				}
		    			}
		    			Main.startThread();
		    			Main.switchScene("Home.fxml");
		    		}catch(Exception e) {
		    			e.printStackTrace();
		    		}
		    	}
	    
	    	}
	    }
}

	


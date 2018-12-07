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


public class loginController extends newMain{
	    @FXML
	    private TextField idTfield;

	    @FXML
	    private PasswordField password;

	    @FXML
	    private Button loginBtn;

	    @FXML
	    private AnchorPane mainLayout;
	    
	    @FXML
	    void setOnAction(ActionEvent event) {
	    	login lgin = new login();
	    	Map<String,String> check = lgin.getLoginInfo();
	    	String id = idTfield.getText();
	    	String pass = password.getText();
	    	if(check.get(id) == null ||check.get(id) == pass) {
	    		Alert alert = new Alert(AlertType.ERROR);
				alert.setContentText("Login fail");
				alert.show();
	    	}else {
	    		try{
	    			char checkid = id.charAt(0);
	    			if(checkid == '0') { //0-ceo
	    				for(CEO e: tps.getCeoList()) {
	    					if( id == e.getId()) {
	    						newMain.user = (Employee) e;
	    						break;
	    					}
	    				}
	    			}
	    			if(checkid == '1') { //1-evp
	    				for(EVP e:tps.getEvpList()) {
	    					if(id == e.getId()) {
	    						newMain.user = (Employee) e;
	    						break;
	    					}
	    				}
	    			}
	    			if(checkid == '2') { //2-sale
	    				for(Sales s:tps.getSalesList()) {
	    					if(id == s.getId()) {
	    						newMain.user = (Employee) s;
	    						break;
	    					}
	    				}
	    			}
	    			if(checkid == '3') { //3-engineer
	    				for(Operation o:tps.getOperationList()) {
	    					if(id == o.getId()) {
	    						newMain.user = (Employee) o;
	    						break;
	    					}
	    				}
	    			}
	    			if(checkid == '4') { //4-ga
	    				for(GA g:tps.getGaList()) {
	    					if(id == g.getId()) {
	    						newMain.user = (Employee) g;
	    						break;
	    					}
	    				}
	    			}
	    			if(checkid == '5') {
	    				for(Finance f:tps.getFinanceList()) {
	    					if(id == f.getId()) {
	    						newMain.user = (Employee) f;
	    						break;
	    					}
	    				}
	    			}
	    			switchScene("Home.fxml");
	    		}catch(Exception e) {
	    			e.printStackTrace();
	    		}
	    	}
	    
	    }

}

	


package fxml;

import javafx.fxml.FXML;


import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.event.*;

import tps_hr.*;

public class EditFinanceController {
	@FXML
	private TextField yearTfield;
	@FXML
	private Button searchBtn;
	@FXML
	private Button backBtn;
	@FXML
	private TextField monthTfield;
	@FXML
	private ListView<String> financeList;
	
	private int year1;
	private String month;
	private int month1;
	
	@FXML
	void setOnActionBackBtn(ActionEvent event) {
		Main.stopThread();
		Main.switchScene("Home.fxml");
		Main.startThread();
	}
	
	@FXML
	void setOnActionSearchBtn(ActionEvent event) {
		Main.stopThread();
		if(monthTfield.getText().equals("")||yearTfield.getText().equals("")){
			Alert alert = new Alert(AlertType.ERROR);
			alert.setContentText("Please fill in all fields.");
			alert.show();
		}else {
			month = this.monthTfield.getText().toLowerCase();
			if(month.equals("january")) {
				month1 = 1;
			}
			else if(month.equals("febuary")) {
				month1 = 2;
			}
			else if(month.equals("march")) {
				month1 = 3;
			}
			else if(month.equals("april")) {
				month1 = 4;
			}
			else if(month.equals("may")) {
				month1 = 5;
			}
			else if(month.equals("june")) {
				month1 = 6;
			}
			else if(month.equals("july")) {
				month1 = 7;
			}
			else if(month.equals("august")) {
				month1 = 8;
			}
			else if(month.equals("september")) {		
				month1 = 9;
			}
			else if(month.equals("october")) {
				month1 = 10;
			}
			else if(month.equals("november")) {
				month1 = 11;
			}
			else if(month.equals("december")) {
				month1 = 12;
			}
			else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setContentText("Please input correct month.");	
				alert.show();
			}
		
			int year = Integer.parseInt(yearTfield.getText());
		
			Finance user = (Finance) Main.user;
			financeList.setItems(user.printAllPayroll(month1,year));
			Main.startThread();
		}
	}
}



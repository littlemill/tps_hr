package fxml;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.event.*;

import tps_hr.*;

public class EditFinanceController {
	@FXML
	private MenuButton yearMenu;
	@FXML
	private Button searchBtn;
	@FXML
	private Button backBtn;
	@FXML
	private MenuButton monthMenu;
	@FXML
	private ListView<String> financeList;
	
	private String year;
	private int year1;
	private String month;
	private int month1;
	
	@FXML
	void setOnActionYearMenu(ActionEvent event) {
		Main.startThread();
		year = this.yearMenu.getText();
		year1 = Integer.parseInt(year);
		yearMenu.setText(year);
		Main.stopThread();
	}
	
	@FXML
	void setOnActionMonthMenu(ActionEvent event) {
		Main.stopThread();
		month = this.monthMenu.getText();
		if(month.equals("January")) {
			month1 = 1;
		}
		if(month.equals("Febuary")) {
			month1 = 2;
		}
		if(month.equals("March")) {
			month1 = 3;
		}
		if(month.equals("April")) {
			month1 = 4;
		}
		if(month.equals("May")) {
			month1 = 5;
		}
		if(month.equals("June")) {
			month1 = 6;
		}
		if(month.equals("July")) {
			month1 = 7;
		}
		if(month.equals("August")) {
			month1 = 8;
		}
		if(month.equals("September")) {
			month1 = 9;
		}
		if(month.equals("October")) {
			month1 = 10;
		}
		if(month.equals("November")) {
			month1 = 11;
		}
		else month1 = 12;
		monthMenu.setText(month);
		Main.stopThread();
	}
	
	@FXML
	void setOnActionBackBtn(ActionEvent event) {
		Main.stopThread();
		Main.switchScene("Home.fxml");
		Main.startThread();
	}
	
	@FXML
	void setOnActionSearchBtn(ActionEvent event) {
		Main.stopThread();
		Finance user = (Finance) Main.user;
		financeList.setItems(user.printAllPayroll(month1,year1));
		Main.startThread();
	}
	
}



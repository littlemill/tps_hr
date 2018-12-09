package fxml;

import java.util.ArrayList;


import tps_hr.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PayrollController {
	@FXML
    private Button backBtn;
	@FXML
	private TableView<Payroll> table = new TableView<Payroll>();
	@FXML
	private TableColumn<Payroll,String> month;
	@FXML 
	private TableColumn<Payroll,String> year;
	@FXML
	private TableColumn<Payroll,String> salary;
	@FXML
	private TableColumn<Payroll,String> commission;
	@FXML
	private TableColumn<Payroll,String> total;
	@FXML
	private Button showBtn;
	@FXML
	public void show() {
		ArrayList<Payroll> payrollList = Main.user.getPayrollList();
		ObservableList<Payroll> data = FXCollections.observableArrayList();
		table.setEditable(true);
		for(Payroll p :payrollList) {
			data.add(p);
			
		}
		table.setItems(data);
		
		month.setCellValueFactory(new PropertyValueFactory("month"));
		year.setCellValueFactory(new PropertyValueFactory("year"));
		salary.setCellValueFactory(new PropertyValueFactory("salary"));
		commission.setCellValueFactory(new PropertyValueFactory("commission"));
		total.setCellValueFactory(new PropertyValueFactory("total"));
		
		table.getColumns().setAll(month,year,salary,commission,total);
	}
	@FXML
	void setOnActionShowBtn(ActionEvent event) {
		Main.stopThread();
		show();
		Main.startThread();
	}
	@FXML
	void setOnActionBackBtn(ActionEvent event) {
		Main.stopThread();
		Main.switchScene("Home.fxml");
		Main.startThread();
	}
}
	
	


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
	private TableView<Payroll> table;
	@FXML
	private TableColumn Month;
	@FXML 
	private TableColumn Year;
	@FXML
	private TableColumn Salary;
	@FXML
	private TableColumn Commission;
	@FXML
	private TableColumn Total;
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
		/*Month.setCellValueFactory(new PropertyValueFactory<Payroll,String>("month"));
		Year.setCellValueFactory(new PropertyValueFactory<Payroll,String>("year"));
		Salary.setCellValueFactory(new PropertyValueFactory<Payroll,String>("Salary"));
		Commission.setCellValueFactory(new PropertyValueFactory<Payroll,String>("Commission"));
		Total.setCellValueFactory(new PropertyValueFactory<Payroll,String>("Total"));
		table.setItems(data);
		table.getColumns().addAll(Month,Year,Salary,Commission,Total);*/
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
	
	


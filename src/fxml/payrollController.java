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

public class payrollController extends newMain{
	@FXML
    private Button backBtn;
	@FXML
	private TableView<Payroll> table;
	@FXML
	private TableColumn<Payroll,String> Month;
	@FXML 
	private TableColumn<Payroll,String> Year;
	@FXML
	private TableColumn<Payroll,String> Salary;
	@FXML
	private TableColumn<Payroll,String> Commission;
	@FXML
	private TableColumn<Payroll,String> Total;
	@FXML
	private Button showBtn;
	@FXML
	public void show() {
		ArrayList<Payroll> payrollList = newMain.user.getPayrollList();
		ObservableList<Payroll> data = FXCollections.observableArrayList();
		table.setEditable(false);
		for(Payroll p :payrollList) {
			data.add(p);
		}
		Month.setCellValueFactory(new PropertyValueFactory<Payroll,String>("Month"));
		Year.setCellValueFactory(new PropertyValueFactory<Payroll,String>("Year"));
		Salary.setCellValueFactory(new PropertyValueFactory<Payroll,String>("Salary"));
		Commission.setCellValueFactory(new PropertyValueFactory<Payroll,String>("Commission"));
		Total.setCellValueFactory(new PropertyValueFactory<Payroll,String>("Total"));
		table.setItems(data);
		table.getColumns().addAll(Month,Year,Salary,Commission,Total);
	}
	@FXML
	void setOnActionshowBtn(ActionEvent event) {
		show();
	}
	void setOnActionBackBtn(ActionEvent event) {
		newMain.sceneManager.switchScene("Home.fxml");
	}
}
	
	


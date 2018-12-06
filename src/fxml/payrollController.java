package fxml;

import java.util.ArrayList;

import tps_hr.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class payrollController extends newMain{
	@FXML
    private Button backBtn;
	@FXML
	private TableView table;
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
		ArrayList<Payroll> payrollList = this.user.getPayrollList();
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
		switchScene("Home.fxml");
	}
}
	
	


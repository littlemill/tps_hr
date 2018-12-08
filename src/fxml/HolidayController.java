package fxml;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Calendar;

public class HolidayController {
	@FXML
    private Button backBtn;

    @FXML
    private Label updateLbl;

    @FXML
    private Label maxLbl;

    @FXML
    private Label usedLbl;

    @FXML
    private Button refreshBtn;
    
    @FXML
    private PieChart pieChart;
    
    private ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList();
    @FXML    
    void update() {
    	int used,max;
    	
    	Calendar rightnow = Calendar.getInstance();
    	updateLbl.setText(updateLbl.getText()+ rightnow.getTime().toString());
    	used = Main.user.getHoliday().getUsedHolidays();
    	max =  Main.user.getHoliday().getmaxHolidays();
    	usedLbl.setText(Integer.toString(used));
    	maxLbl.setText(Integer.toString(max));
    	pieChartData.add(new PieChart.Data("Available Holidays", max-used));
    	pieChartData.add(new PieChart.Data("Used Holidays",used));
    	//pieChartData = FXCollections.observableArrayList(new PieChart.Data("max",max),new PieChart.Data("used",used));
    	pieChart = new PieChart(pieChartData);
    }
    @FXML
    void setOnActionBackBtn(ActionEvent event) {
    	Main.stopThread();
    	Main.switchScene("Home.fxml");
    	Main.startThread();
    }

    @FXML
    void setOnActionRefreshBtn(ActionEvent event) {
    	Main.stopThread();
    	update();
    	Main.startThread();
    }
}


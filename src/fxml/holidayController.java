package fxml;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Calendar;

public class holidayController {
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
    
    private ObservableList<PieChart.Data> pieChartData;
    @FXML    
    void update() {
    	int used,max;
    	
    	Calendar rightnow = Calendar.getInstance();
    	updateLbl.setText(updateLbl.getText()+ rightnow.toString());
    	used = newMain.user.getHoliday().getUsedHolidays();
    	max =  newMain.user.getHoliday().getmaxHolidays();
    	usedLbl.setText(Integer.toString(used));
    	maxLbl.setText(Integer.toString(max));
    	pieChartData = FXCollections.observableArrayList(new PieChart.Data("max",max),new PieChart.Data("used",used));
    	pieChart = new PieChart(pieChartData);
    }
    @FXML
    void setOnActionBackBtn(ActionEvent event) {
    	newMain.switchScene("Home.fxml");
    }

    @FXML
    void setOnActionRefreshBtn(ActionEvent event) {
    	update();
    }
}


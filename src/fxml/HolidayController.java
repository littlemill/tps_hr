package fxml;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

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
    private Pane pieChartPane;
    
    @FXML
    private AnchorPane pane;
    
    private PieChart pieChart;
    private ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList();
    @FXML    
    void update() {
    	try {
    		int used,max;
    		if(!pieChartData.isEmpty()) {
    			pieChartData.clear();
    			pieChartPane.getChildren().clear();
    		}
    		Calendar rightnow = Calendar.getInstance();
    		updateLbl.setText("Last updated : "+ rightnow.getTime().toString());
    		used = Main.user.getHoliday().getUsedHolidays();
    		max =  Main.user.getHoliday().getmaxHolidays();
    		usedLbl.setText(Integer.toString(used));
    		maxLbl.setText(Integer.toString(max));
    		pieChartData.add(new PieChart.Data("Available Holidays", max-used));
    		pieChartData.add(new PieChart.Data("Used Holidays",used));
    		pieChart = new PieChart(pieChartData);
    		pieChart.setTitle("Proportion of your used holidays and left holidays");
    		pieChart.setPrefWidth(460);
    		pieChart.setPrefHeight(242);
    		pieChartPane.getChildren().add(pieChart);
    	}catch(Exception e) {
    		System.out.println("refreshed");
    	}
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


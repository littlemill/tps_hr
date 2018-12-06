package fxml;

import tps_hr.*;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;

public class EditCEO extends ScrollPane {
	private Label label;
	private CEO ceo;
	
	public EditCEO() {
		this.setPadding(new Insets(15));
		this.setPrefWidth(600);
		this.setPrefHeight(400);
		
		label = new Label(this.ceo.printAllMembers());
		this.getChildren().add(label);
	}
}

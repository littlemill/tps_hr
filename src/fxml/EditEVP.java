package fxml;

import tps_hr.*;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;

public class EditEVP extends ScrollPane {
	private Label label;
	private EVP evp;
	
	public EditEVP() {
		this.setPadding(new Insets(15));
		this.setPrefWidth(600);
		this.setPrefHeight(400);
		
		label = new Label(this.evp.printOperationMembers());
		this.getChildren().add(label);
	}
}

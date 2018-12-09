package fxml;

import javafx.collections.ObservableList;

@SuppressWarnings("serial")
public class NotificationException extends Exception {
	
	public NotificationException(ObservableList<String> l) {
		l.add("Welcome to TPS Apllication.");
	}
}

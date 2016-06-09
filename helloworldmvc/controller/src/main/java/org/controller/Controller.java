package org.controller;

import java.sql.SQLException;

import org.contract.IModel;
import org.contract.IView;

public class Controller {
	private final IView view;
	private final IModel model;
	public Controller(final IView view, final IModel model) {
		this.view = view;
		this.model = model;
	}
	
	public void run() throws SQLException {
		this.view.displayMessage(this.model.getHelloWorld());
	}
} 

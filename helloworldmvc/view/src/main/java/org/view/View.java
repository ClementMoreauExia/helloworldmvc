package org.view;

import java.sql.SQLException;
import java.util.Observable;
import java.util.Observer;

import org.contract.IModel;
import org.contract.IView;



public class View implements IView, IModel{

	public void displayMessage(String message) {
		System.out.println(message);
	}

	public String getHelloWorld() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
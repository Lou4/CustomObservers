package com.lou.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.lou.observable.Model;

public class TurnListener implements ActionListener{

	private Model model;
	
	public TurnListener(Model model) {
		this.model = model;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		model.setTurn(model.getTurn()+1);
	}

}

package com.lou.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.lou.observable.Model;

public class ScoreListener implements ActionListener{

	private Model model;
	
	public ScoreListener(Model model) {
		this.model = model;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		model.setScore(model.getScore()+1);
	}

}

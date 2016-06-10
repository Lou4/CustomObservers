package com.lou.observer;

import javax.swing.JButton;
import javax.swing.JLabel;

import com.lou.controller.TurnListener;
import com.lou.observable.CustomObservervable;
import com.lou.observable.Model;

public class TurnView implements TurnObserver{

	
	private JLabel label;
	private JButton btn;
	
	public TurnView(JLabel label, JButton btn, Model model) {
		this.label = label;
		model.addTurnObserver(this);
		this.btn = btn;
		this.btn.setText("TURN");
		this.btn.addActionListener(new TurnListener(model));
	}
	
	@Override
	public void updateTurn(CustomObservervable o, Object arg) {
		label.setText("Turn left: " + arg);
	}


}

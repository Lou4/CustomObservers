package com.lou.observer;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.lou.controller.ScoreListener;
import com.lou.observable.CustomObservervable;
import com.lou.observable.Model;

public class ScoreView extends JPanel implements ScoreObserver {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label;
	private JButton btn;

	public ScoreView(JLabel label, JButton btn, Model model) {
		this.label = label;
		model.addScoreObserver(this);
		this.btn = btn;
		this.btn.setText("SCORE");
		this.btn.addActionListener(new ScoreListener(model));
	}
	
	@Override
	public void updateScore(CustomObservervable o, Object arg) {
		label.setText("Score: " + arg);
	}


}

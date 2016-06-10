package com.lou.main;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.lou.observable.Model;
import com.lou.observer.ScoreView;
import com.lou.observer.TurnView;


public class Main extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		
		Model model = new Model();
		JButton btnScore = new JButton();
		JButton btnTurn = new JButton();
		
		ScoreView score = new ScoreView(label1, btnScore, model);
		TurnView turn = new TurnView(label2, btnTurn, model);
		
		panel.add(label1);
		panel.add(label2);
		panel.add(btnScore);
		panel.add(btnTurn);
		
		frame.add(panel);
		frame.setPreferredSize(new Dimension(600, 800));
		frame.pack();
		frame.setVisible(true);
	}
}

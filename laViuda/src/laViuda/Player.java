package laViuda;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Player extends JFrame {
	
	public Hand hand;
	private JPanel playerPanelHand;
	private JPanel playerPanel;
	
	
	public Player(Hand hand) {
	
	this.hand = hand;	
	
	this.setLayout(new BorderLayout());
	
	playerPanel = new JPanel();
	playerPanel.setLayout(new GridLayout(2,1));
	
	playerPanelHand = new JPanel();
	playerPanelHand.setLayout(new GridLayout(1,5));
	
	ArrayList<String> randomCards = hand.getRandomCards(5);
	
	for (String card : randomCards) {
        JButton button = new JButton(card);
		playerPanelHand.add(button);
		
		playerPanel.add(playerPanelHand);
		
		add(playerPanel, BorderLayout.SOUTH);
			
		}
       
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	pack();
	setVisible(false);
	}


	public void makeVisible() {
		setVisible(true);
		
	}



}

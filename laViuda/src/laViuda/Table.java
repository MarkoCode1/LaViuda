package laViuda;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Table extends JFrame{

	
	public Hand hand;
	public JPanel tablePanelHand;
	public JPanel tablePanel;

	public Table(Hand hand) {
			
			this.hand = hand;

	        tablePanel = new JPanel();
	        tablePanel.setLayout(new GridLayout(2, 1));

	        tablePanelHand = new JPanel();
	        tablePanelHand.setLayout(new GridLayout(1, 5));

	        ArrayList<String> randomCards = Hand.getRandomCards(5);

	        for (String card : randomCards) {
	            JButton tableButton = new JButton(card);
	            tablePanelHand.add(tableButton);
	        }

	        tablePanel.add(tablePanelHand);
	    }

	    public JPanel getTablePanel() {
	        return tablePanel;
	    }
	}


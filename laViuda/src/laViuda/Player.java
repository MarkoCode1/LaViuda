package laViuda;


import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Player extends JFrame {
	public static Table table;
	public static Hand hand;
	private JPanel playerPanelHand;
	private JPanel playerPanel;
	private String playerName;
	private JLabel nameLabel;
	private JPanel playPanel;
	private JButton swapButton;
	private JPanel tablePanelHand;
	
	
	public Player(Hand hand, String playerName, JPanel tablePanelHand) {
		  this.tablePanelHand = tablePanelHand;
	      this.hand = hand;
	      this.playerName = playerName;

	        playerPanel = new JPanel();
	        playerPanel.setLayout(new GridLayout(3, 1));

	        nameLabel = new JLabel("Player: " + playerName);
	       
	        playerPanelHand = new JPanel();
	        playerPanelHand.setLayout(new GridLayout(1, 5));
	        
	        playPanel = new JPanel();
	        playPanel.setLayout(new GridLayout(1,4));
	       
	        swapButton = new JButton("Swap Hand");

	        swapButton.addActionListener(new SwapButtonListener(playerPanelHand, tablePanelHand));
	        
	        JButton SwapCard = new JButton("Swap Card");
	        
	        JButton Skip = new JButton("Skip Turn");
	        
	        JButton Knock = new JButton("End Round");
	        
	        playPanel.add(swapButton);
	        playPanel.add(SwapCard);
	        playPanel.add(Skip);
	        playPanel.add(Knock);
	        
	        

	        ArrayList<String> randomCards = Hand.getRandomCards(5);

	        for (String card : randomCards) {
	            JButton playerButton = new JButton(card);
	            playerPanelHand.add(playerButton);
	        }
	       
	        playerPanel.add(nameLabel);
	        playerPanel.add(playerPanelHand);
	        playerPanel.add(playPanel);
	    }

	public class SwapButtonListener implements ActionListener {
		private JPanel playerPanelHand;
	    private JPanel tablePanelHand;
		private String playerName;

	    public SwapButtonListener(JPanel playerPanelHand, JPanel tablePanelHand) {
	        this.playerPanelHand = playerPanelHand;
	        this.tablePanelHand = tablePanelHand;
	    }

	public void actionPerformed(ActionEvent e) {
		 if (playerPanelHand.getComponentCount() >= 5 && tablePanelHand.getComponentCount() >= 5) {
	            Component[] playerButtons = new Component[5];
	            Component[] tableButtons = new Component[5];

	            // Get the first 5 buttons from each panel
	            for (int i = 0; i < 5; i++) {
	                playerButtons[i] = playerPanelHand.getComponent(i);
	                tableButtons[i] = tablePanelHand.getComponent(i);
	            }

	            // Remove all buttons from panels
	            playerPanelHand.removeAll();
	            tablePanelHand.removeAll();

	            // Add buttons from tablePanelHand to playerPanelHand and vice versa
	            for (Component button : tableButtons) {
	                playerPanelHand.add(button);
	            }
	            for (Component button : playerButtons) {
	                tablePanelHand.add(button);
	            }

	            playerPanelHand.revalidate();
	            tablePanelHand.revalidate();
	        }
	    }
	
	
	
	 public JButton getSwapButton() {
	        return swapButton;
	    }
	
	    
	    public void setPlayerName(String playerName) {
	    	this.playerName = playerName;
	    }  
}

	public Component getPlayerPanel() {
		return playerPanel;
	}
}

package laViuda;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameGui extends JFrame  {
	  
	public GameGui(String playerName) {
			Table table = new Table(null);
			Player player = new Player(null, playerName, null);

	        setTitle("Combined Table and Player GUI");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        setLayout(new BorderLayout());
	        
	        JPanel gamePanel = new JPanel();
	        gamePanel.setLayout(new GridLayout(2,1));
	        
	        gamePanel.add(table.getTablePanel());
	        gamePanel.add(player.getPlayerPanel());
	        
	        add(gamePanel, BorderLayout.CENTER);

	        pack();
	        setLocationRelativeTo(null);
	        setVisible(false);
	    }
	
	public void makeVisible() {
		setVisible(true);
		
	}

	    public static void main(String[] args) {
	        new GameGui(null);
	        Game startGui = new Game();
	    }
	}
// THis is another test ahhh
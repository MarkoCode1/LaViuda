package laViuda;

import javax.swing.*;
import java.awt.*;

public class GameGui extends JFrame {

    private Table table;
    private Player player;

    public GameGui(String playerName) {
        // Initialize Hand
        Hand hand = new Hand(new String[]{"Hearts", "Diamonds", "Clubs", "Spades"}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13});

        // Initialize Table with Hand
        table = new Table(hand);

        // Initialize Player with Hand and Table
        player = new Player(hand, playerName, table);

        setTitle("Combined Table and Player GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel gamePanel = new JPanel();
        gamePanel.setLayout(new GridLayout(2, 1));

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
        // Start GUI (assuming Game is another part of the application)
        Game startGui = new Game();
    }
}
package laViuda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class Player extends JFrame {
    public Table table;
    public Hand hand;
    private JPanel playerPanelHand;
    private JPanel playerPanel;
    private String playerName;
    private JLabel nameLabel;
    private JPanel playPanel;
    private JButton swapButton;
    private BufferedImage backgroundImage;
    public ArrayList<JButton> playerButtons = new ArrayList<>();

    public Player(Hand hand, String playerName, Table table) {
        this.table = table;
        this.hand = hand;
        this.playerName = playerName;

        try {
            backgroundImage = ImageIO.read(new File("C:\\Users\\Marko Yovanovich\\OneDrive\\Desktop\\La Viuda Work\\360_F_322485076_wuZ8D5R9biTRNSGJMWZBor9uUcO1Md59.jpg"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        playerPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (backgroundImage != null) {
                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };
        playerPanel.setLayout(new GridLayout(3, 1));

        nameLabel = new JLabel("Player: " + playerName);
        Font font = new Font("Times New Roman", Font.BOLD, 25);
        nameLabel.setFont(font);
        nameLabel.setForeground(Color.WHITE);

        playerPanelHand = new JPanel();
        playerPanelHand.setLayout(new GridLayout(1, 5));
        playerPanelHand.setOpaque(false);

        playPanel = new JPanel();
        playPanel.setLayout(new GridLayout(1, 4));
        playPanel.setOpaque(false);

        swapButton = new JButton("Swap Hand");
        swapButton.addActionListener(new SwapButtonListener());

        JButton swapCardButton = new JButton("Swap Card");
        JButton skipButton = new JButton("Skip Turn");
        JButton knockButton = new JButton("End Round");

        playPanel.add(swapButton);
        playPanel.add(swapCardButton);
        playPanel.add(skipButton);
        playPanel.add(knockButton);

        ArrayList<String> randomCards = Hand.getRandomCards(5);

        if (randomCards == null) {
            throw new IllegalStateException("Random cards cannot be null");
        }

        for (String card : randomCards) {
            JButton playerButton = new JButton(card);
            playerButtons.add(playerButton);
            playerPanelHand.add(playerButton);
        }

        playerPanel.add(nameLabel);
        playerPanel.add(playerPanelHand);
        playerPanel.add(playPanel);
    }

    public Component getPlayerPanel() {
        return playerPanel;
    }

    private class SwapButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (table == null) {
                throw new IllegalStateException("Table is not initialized");
            }

            for (int i = 0; i < playerButtons.size(); i++) {
                String playerCard = playerButtons.get(i).getText();
                String tableCard = table.tableButtons.get(i).getText();

                playerButtons.get(i).setText(tableCard);
                table.tableButtons.get(i).setText(playerCard);
            }
        }
    }
}
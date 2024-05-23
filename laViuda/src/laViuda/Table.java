package laViuda;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class Table extends JFrame {

    public Hand hand;
    public JPanel tablePanelHand;
    public JPanel tablePanel;
    public JLabel tableTitle;
    private BufferedImage backgroundImage;
    public ArrayList<JButton> tableButtons = new ArrayList<>();

    public Table(Hand hand) {
        this.hand = hand;

        try {
            backgroundImage = ImageIO.read(new File("C:\\Users\\Marko Yovanovich\\OneDrive\\Desktop\\La Viuda Work\\360_F_322485076_wuZ8D5R9biTRNSGJMWZBor9uUcO1Md59.jpg"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        tablePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (backgroundImage != null) {
                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };
        tablePanel.setLayout(new GridLayout(3, 1));

        tableTitle = new JLabel("Table Hand");
        Font font = new Font("Times New Roman", Font.BOLD, 25);
        tableTitle.setFont(font);
        tableTitle.setForeground(Color.WHITE);

        tablePanel.add(tableTitle);

        tablePanelHand = new JPanel();
        tablePanelHand.setLayout(new GridLayout(1, 5));
        tablePanelHand.setOpaque(false);

        ArrayList<String> randomCards = Hand.getRandomCards(5);

        if (randomCards == null) {
            throw new IllegalStateException("Random cards cannot be null");
        }
        
        for (String card : randomCards) {
            JButton tableButton = new JButton(card);
            tableButtons.add(tableButton);
            tablePanelHand.add(tableButton);
        }

        tablePanel.add(tablePanelHand);
    }

    public Component getTablePanel() {
        return tablePanel;
    }
}
package laViuda;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Game extends JFrame {
    private JPanel startPanel;
    private JButton start;
    private JLabel name;
    
    private JPanel title;
    private JLabel viuda;
    
    public JTextField inputName;
    private final int WINDOW_WIDTH = 500;
    private final int WINDOW_HEIGHT = 200;
    private BufferedImage backgroundImage; // For holding the background image

    public Game() {
        setTitle("Le Viuda");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout());
        
        // Load the background image
        try {
            backgroundImage = ImageIO.read(new File("C:\\Users\\Marko Yovanovich\\OneDrive\\Desktop\\La Viuda Work\\pngtree-gaming-black-gold-playing-cards-background-image_336962.jpg"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        buildPanel();
        
        add(startPanel, BorderLayout.CENTER);
        add(title, BorderLayout.NORTH);
        
        setVisible(true);
    }

    private void buildPanel() {
        title = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Draw the background image
                if (backgroundImage != null) {
                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };
        
        viuda = new JLabel("La Viuda! ");
        Font font = new Font("Caveat", Font.BOLD, 90);
        viuda.setFont(font);
        viuda.setForeground(Color.WHITE);
        title.add(viuda);
        
        name = new JLabel("Enter Your Name: ");        
        Font font2 = new Font("Times New Roman", font.BOLD, 20);
        name.setFont(font2);    
        inputName = new JTextField(10);
        start = new JButton("Start");
        start.addActionListener(new StartButtonListener());
        startPanel = new JPanel();
        startPanel.add(name);
        startPanel.add(inputName);
        startPanel.add(start);
    }

    public class StartButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String playerName = inputName.getText();
            GameGui gameGui = new GameGui(playerName);
            gameGui.makeVisible(); 
        }
    }
}
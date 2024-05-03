package laViuda;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {
    private JPanel startPanel;
    private JButton start;
    private JLabel name;
    private JTextField inputName;
    private JPanel namePanel;
    private final int WINDOW_WIDTH = 400;
    private final int WINDOW_HEIGHT = 300;

    public Game() {
        setTitle("Le Viuda");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
        add(startPanel);
        setVisible(true);
    }

    private void buildPanel() {
        name = new JLabel("Enter Your Name: ");
        inputName = new JTextField(10);
        start = new JButton("Start");
        start.addActionListener(new StartButtonListener());
        startPanel = new JPanel();
        startPanel.add(name);
        startPanel.add(inputName);
        startPanel.add(start);
    }

    private class StartButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           
            Player player = new Player(null);
            player.makeVisible(); // Make the player window visible
        }
    }
}

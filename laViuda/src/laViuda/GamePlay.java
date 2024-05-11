package laViuda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class GamePlay implements ActionListener {

    private JPanel playerPanelHand;
    private JPanel tablePanelHand;

    public GamePlay(JPanel playerPanelHand, JPanel tablePanelHand) {
        this.playerPanelHand = playerPanelHand;
        this.tablePanelHand = tablePanelHand;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (playerPanelHand.getComponentCount() > 0 && tablePanelHand.getComponentCount() > 0) {

        	JButton playerButton = (JButton) playerPanelHand.getComponent(0);
            JButton tableButton = (JButton) tablePanelHand.getComponent(0);

            playerPanelHand.remove(playerButton);
            tablePanelHand.remove(tableButton);

            playerPanelHand.add(tableButton);
            tablePanelHand.add(playerButton);

            playerPanelHand.revalidate();
            tablePanelHand.revalidate();
        }
    }
}
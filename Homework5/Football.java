package HomeWork5;

import java.awt.*;
import javax.swing.*;
public class Football extends JFrame{
    private final String MILAN = "AC Milan";
    private final String REAL_MADRID = "Real Madrid";
    private final String DRAW = "DRAW";

    private int milanScore;
    private int madridScore;
    private String lastScorerName = "N/A";

    private final JLabel resultLabel = new JLabel("Result: "+ milanScore+" X "+ madridScore);
    private final JLabel lastScorerLabel = new JLabel("Last Scorer: N/A");
    private final JLabel winnerLabel = new JLabel("Winner: DRAW");

    public Football()
    {
        super("Football match");

        setSize(750,500);
        setLayout(new GridLayout(3, 3));
        setResizable(false);
        setVisible(true);

        JPanel[] panel = new JPanel[9];
        for (int i = 0; i< panel.length; i++)
        {
            panel[i] = new JPanel();
            panel[i].setLayout(new BorderLayout());
            add(panel[i]);
        }

        JButton milanButton = new JButton(MILAN);
        milanButton.setPreferredSize(new Dimension(150, 100));

        JButton realMadridButton = new JButton(REAL_MADRID);
        realMadridButton.setPreferredSize(new Dimension(150, 100));

        panel[1].add(resultLabel, BorderLayout.CENTER);
        panel[3].add(milanButton, BorderLayout.WEST);
        panel[4].add(winnerLabel, BorderLayout.CENTER);
        panel[5].add(realMadridButton, BorderLayout.EAST);
        panel[7].add(lastScorerLabel, BorderLayout.CENTER);

        milanButton.addActionListener(e -> {
            milanScore++;
            lastScorerName = MILAN;
            UpdateView();
        });

        realMadridButton.addActionListener(e -> {
            madridScore++;
            lastScorerName = REAL_MADRID;
            UpdateView();
        });
    }

    private void UpdateView(){
        resultLabel.setText("Result: " + milanScore + " X "+ madridScore);
        lastScorerLabel.setText("Last Scorer: " + lastScorerName);
        winnerLabel.setText("Winner: " + getWinner());
    }

    private String getWinner(){
        if(milanScore == madridScore){
            return DRAW;
        }
        if(milanScore > madridScore){
            return MILAN;
        }
        return REAL_MADRID;
    }
    public static void main(String[] args) {
        new Football();
    }
}


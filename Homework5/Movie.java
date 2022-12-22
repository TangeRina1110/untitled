package HomeWork5;

import javax.swing.*;

public class Movie extends JFrame {
    private JLabel image;
    private int number = 0;
    private Movie(){
        image = new JLabel("", new ImageIcon("C:/Users/Екатерина/Downloads/1.png"), SwingConstants.CENTER);
        JPanel panel = new JPanel();
        panel.add (image);
        getContentPane().add(panel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        Timer timer = new Timer(300, e -> nextImg());
        timer.start();
    }
    private void nextImg(){
        image.setIcon(new ImageIcon("C:/Users/Екатерина/Downloads/"+(++number)+".png"));
        if(number == 5) number = 1;

    }
    public static void main (String[] args) {
        Movie frame = new Movie();


    }


}

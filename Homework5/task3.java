package HomeWork5;

import javax.swing.*;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("Введите путь к файлу:");
        Scanner in = new Scanner(System.in);
        String way = in.nextLine();
        ImageIcon icon = new ImageIcon(way);
        JLabel label = new JLabel("", icon, SwingConstants.CENTER);
        JPanel panel = new JPanel();
        panel.add(label);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);

    }
}

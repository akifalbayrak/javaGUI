package panel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("panel//hazardd.gif", "ragnar baba");
        JLabel label = new JLabel();
        label.setText("akif albayrak always baba");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(125, 100, 50, 50);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(new BorderLayout());
        
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(new BorderLayout());
        
        JPanel greePanel = new JPanel();
        greePanel.setBackground(Color.green);
        greePanel.setBounds(0,250,500,250);
        greePanel.setLayout(new BorderLayout());

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        frame.setLayout(null);

        greePanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greePanel);
    }
}
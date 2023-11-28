package label;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("babayim");

        Border border = BorderFactory.createLineBorder(Color.green, 3, true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(400, 400);
        frame.setVisible(true);
        // frame.setResizable(false);

        JLabel label = new JLabel();
        ImageIcon image = new ImageIcon("label//v.jpg", "babaya biat");
        label.setText("mesleginiz nedir");
        label.setIcon(image);

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.CYAN);
        label.setFont(new Font("MV Boli", Font.PLAIN, 50));
        label.setIconTextGap(25);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);

        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.LEFT);

        // label.setBounds(0, 0, 400, 400);
        // frame.setLayout(null);
        frame.add(label);
        frame.pack();
    }
}

package frames;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;


public class MyFrame extends JFrame {
    MyFrame() {
        // Jthis frame = new JFrame();
        this.setSize(420, 420);
        this.setVisible(true);
        this.setTitle("JFrame title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        ImageIcon imageIcon = new ImageIcon("cr.jpg");
        this.setIconImage(imageIcon.getImage());
        // frame.getContentPane().setBackground(Color.yellow);
        // frame.getContentPane().setBackground(new Color(123, 50, 250));
        this.getContentPane().setBackground(new Color(0x123456));
    }
}

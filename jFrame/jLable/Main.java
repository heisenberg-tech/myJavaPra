import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class Main {
    public static void main(String[] args) {
        
        ImageIcon cat = new ImageIcon("cat.png");// create a new image icon
        Border border = BorderFactory.createLineBorder(Color.RED,3);// create border

        JLabel label = new JLabel(); // create a label
        label.setText("Hello Java!"); //set text
        label.setIcon(cat); //set image icon

        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);

        label.setHorizontalAlignment(JLabel.CENTER);//set label to the center horizontally
        label.setVerticalAlignment(JLabel.CENTER);//set label to the center vertically

        label.setForeground(Color.BLUE);//set font color
        label.setFont(new Font("MV Boli", Font.ITALIC, 18));
        label.setIconTextGap(20);
        label.setBackground(Color.GREEN);
        label.setOpaque(true);//background color wont be applied if opaque not set to true




        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setTitle("label practice");

        frame.add(label);//add label to the frame made
    }
}

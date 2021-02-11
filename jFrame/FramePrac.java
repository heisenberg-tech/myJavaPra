import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;
public class FramePrac extends JFrame{
    FramePrac() {
        this.setTitle("My title");//set title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when close the window terminate that program
        //default is jFrame.HIDE_ON_CLOSE
        //jFrame.DO_NOTHING_ON_CLOSE : this will do thing even if you click on the close button up right
        this.setSize(300, 300);//set size
        this.setResizable(false);// prevent resizing
        this.setVisible(true);//set the window to be visible


        ImageIcon mylogo = new ImageIcon("logo.jpg");
        this.setIconImage(mylogo.getImage());
        //this.getContentPane().setBackground(Color.yellow);
        this.getContentPane().setBackground(new Color(255,255,0));//change gui background color rgb

    }
    
}

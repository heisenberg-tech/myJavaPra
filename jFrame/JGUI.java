import javax.swing.JFrame;

public class JGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame();//new frame
        frame.setTitle("My title");//set title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when close the window terminate that program
        //default is jFrame.HIDE_ON_CLOSE
        //jFrame.DO_NOTHING_ON_CLOSE : this will do thing even if you click on the close button up right
        frame.setSize(420, 420);//set size
        frame.setVisible(true);//set the window to be visible
    }
    
}

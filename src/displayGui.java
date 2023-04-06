import javax.swing.*;

public class displayGui extends JFrame{
    final int windowWidth = 350;
    final int windowHeight = 350;

    public displayGui(){
        //JFrame window = new JFrame();
        setTitle("display");
        setSize(windowWidth,windowHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {



        System.out.println("this is the display gui");
}
}

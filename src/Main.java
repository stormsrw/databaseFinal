import javax.swing.*;

public class Main extends JFrame {

        final int windowWidth = 350;
        final int windowHeight = 350;

        public Main(){
            //JFrame window = new JFrame();
            setTitle("booking");
            setSize(windowWidth,windowHeight);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }

    public static void main(String[] args) {
            Main gui = new Main();

        displayGui x = new displayGui();
        loginPage lp= new loginPage();
        System.out.println("this is the right repository");
    }
}
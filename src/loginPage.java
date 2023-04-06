import javax.swing.*;

public class loginPage extends JFrame {

    final int windowWidth = 350;
    final int windowHeight = 350;

     public loginPage(){
         //JFrame window = new JFrame();
         setTitle("login page");
         setSize(windowWidth,windowHeight);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setVisible(true);
     }
    public static void main(String[] args) {
         loginPage lp= new loginPage();
        System.out.println("this is the login gui");
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginPage extends JFrame {

    final int windowWidth = 350;
    final int windowHeight = 350;
    private JPanel loginPanel;
    private JButton loginButton;

     public loginPage(){
         //JFrame window = new JFrame();
         setTitle("login page");
         setSize(windowWidth,windowHeight);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         buildPanel();
         add(loginPanel);
         setVisible(true);
     }

    private void buildPanel() {
         loginPanel = new JPanel();
         loginButton = new JButton("login");
         loginButton.addActionListener(new loginListener());
         loginPanel.add(loginButton);

    }
    private class loginListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            System.out.println("this is the login button");

        }
    }
    public static void main(String[] args) {
         loginPage lp= new loginPage();
        System.out.println("this is the login gui");
    }
}

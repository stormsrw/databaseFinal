import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.Scanner;

public class loginPage extends JFrame {
    final int windowWidth = 350;
    final int windowHeight = 350;
    private JPanel loginPanel;
    private JButton loginButton;
    private JTextField username;
    private JPasswordField password;

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
         username = new JTextField(25);
         password = new JPasswordField(25);
        loginPanel.add(username);
        loginPanel.add(password);
         loginPanel.add(loginButton);

    }
    private class loginListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
           // System.out.println("this is the login button");
            PreparedStatement pstmt;
            ResultSet rs;
            String userName = username.getText();
            String Password = password.getText();

            try {
                //String dbURL = "jdbc:sqlite:C:/Users/Ryan Storms/Desktop/programming2/database/workplace.db";
                String dbURL = "jdbc:sqlite:C:/Users/ryns8/OneDrive/Desktop/code/database/databaseFinal/workplace.db";
                Connection conn = null;
                conn = DriverManager.getConnection(dbURL);
                String access = "SELECT * FROM Users WHERE Username = ? AND Password = ?";
                pstmt = conn.prepareStatement(access);
                pstmt.setString(1,userName);
                pstmt.setString(2,Password);
                rs = pstmt.executeQuery();
                if (rs.next()) {
                    System.out.println("Username and password exist in the database.");
                } else {
                    System.out.println("Username and password do not exist in the database.");
                }

                conn.close();

            }
            catch (SQLException ex)
            {
                System.out.println(ex.getMessage());

            }



        }
    }
    public static void main(String[] args) {
         try{
             String dbURL = "jdbc:sqlite:C:/Users/ryns8/OneDrive/Desktop/code/database/databaseFinal/workplace.db";
             Connection conn = null;
             conn = DriverManager.getConnection(dbURL);
             Statement st = conn.createStatement();
//create and execute a query what will make a table in the specific database
             String sql = "CREATE TABLE IF NOT EXISTS Users (\n" + " Username text NOT NULL ,\n" + " Password text NOT NULL ,\n" + " capacity real\n" + ");";
             st.execute(sql);
             String insertQuery = "INSERT INTO Users (Username, Password) VALUES ('admin', 'admin')";
             st.execute(insertQuery);
            // System.out.println("this is the login gui");
         }
         catch (SQLException e)
         {
             System.out.println(e.getMessage());

         }
         loginPage lp= new loginPage();

    }
}

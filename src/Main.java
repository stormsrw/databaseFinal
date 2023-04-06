import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

        final int windowWidth = 350;
        final int windowHeight = 350;
        private int currentCard =1;
        JFrame window = new JFrame();
        private  CardLayout card;
        private JPanel cardPanel;
        private JPanel loginPanel;
        private JPanel displayPanel;
        private JLabel loginLabel;
        private JLabel dispalyLabel;
        private JButton loginButton;
        public Main(){
            //JFrame window = new JFrame();
            setTitle("main");
            setSize(windowWidth,windowHeight);


            //cardPanel
            cardPanel = new JPanel();
            card = new CardLayout();
            cardPanel.setLayout(card);
            //make login panel
            loginPanel = new JPanel();
            //make display panel
            displayPanel = new JPanel();
           //make login label
            loginLabel = new JLabel("login panel");
            //make display label
            dispalyLabel= new JLabel("display pabel");

            //add labels to appropriate panel
            loginPanel.add(loginLabel);
            loginPanel.add(loginButton);
            displayPanel.add(dispalyLabel);
            //add panels to cardpanel
            cardPanel.add(loginLabel,1);
            cardPanel.add(displayPanel,2);

            loginButton.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                {

                    // used first c1 CardLayout
                    card.first(cardPanel);

                    // value of currentcard is 1
                    currentCard = 2;
                }
            });



            //displayGui x = new displayGui();
            getContentPane().add(cardPanel, BorderLayout.CENTER);
           // getContentPane().add(displayPanel,BorderLayout.CENTER);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);

        }


    public static void main(String[] args) {
            //Main gui = new Main();
        Main cl = new Main();
        System.out.println("this is the right repository");
    }
}
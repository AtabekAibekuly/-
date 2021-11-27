package kz.iitu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Locale;

public class FirstPage extends JFrame {
    private JLabel jLabel;
    private JButton jButton;
    private JButton jButton1;


    static ArrayList<User> users=new ArrayList<>();

    static {
        users.add(new User("Atabek", "A.", 29800,18,"123"));
        users.add(new User("Dastan", "K.", 29801,19,"321"));
        users.add(new User("Nurbaqyt", "N.", 29802,20,"1234"));
        users.add(new User("Kamoliddin", "T.", 29803,21,"12345"));
        Main.saveGoodItems(users);
    }

    public FirstPage() {
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("My App");


        jLabel = new JLabel("Converter online");
        jLabel.setBounds(10, 17, 180, 15);
        add(jLabel);




        jButton=new JButton("Authentication");
        jButton.setBounds(140,10,120,50);
        add(jButton);
        jButton1=new JButton("Registration");
        jButton1.setBounds(260,10,120,50);
        add(jButton1);




        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Registration registration=new Registration();
                registration.setVisible(true);
            }
        });
        jButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Authentication authentication=new Authentication();
                authentication.setVisible(true);

            }
        });


    }

}

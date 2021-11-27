package kz.iitu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Registration extends JFrame {
    private JLabel label;
    private JButton jButton;
    private JButton jButton1;
    private JTextField name;
    private JTextField surname;
    private JTextField Id;
    private JTextField PN;
    private JTextField Pass;




    public Registration() {
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        setTitle("Registration");

        ArrayList<User> users=new ArrayList<>();


        label = new JLabel("Enter your name:");
        label.setBounds(10, 10, 180, 15);
        add(label);
        name = new JTextField();
        name.setBounds(10, 30, 200, 20);
        add(name);


        label = new JLabel("Enter your Surname:");
        label.setBounds(10, 60, 180, 15);
        add(label);


        surname = new JTextField();
        surname.setBounds(10, 90, 200, 20);
        add(surname);

        label = new JLabel("Enter your ID number:");
        label.setBounds(10, 120, 180, 15);
        add(label);

        Id = new JTextField();
        Id.setBounds(10, 150, 200, 20);
        add(Id);

        label = new JLabel("Enter your age:");
        label.setBounds(10, 180, 180, 15);
        add(label);

        PN = new JTextField();
        PN.setBounds(10, 210, 200, 20);
        add(PN);

        label = new JLabel("Enter your Password:");
        label.setBounds(10, 240, 180, 15);
        add(label);

        Pass = new JTextField();
        Pass.setBounds(10, 270, 200, 20);
        add(Pass);


        jButton=new JButton("Enter");
        jButton.setBounds(220,300,80,30);
        add(jButton);
        jButton1=new JButton("Back");
        jButton1.setBounds(300,300,80,30);
        add(jButton1);



        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int id = Integer.parseInt(Id.getText());
                int Pn=Integer.parseInt((PN.getText()));
                String Name=String.valueOf(name.getText());
                String Surname=String.valueOf(surname.getText());
                String pass=String.valueOf(Pass.getText());
                User s=new User(Name,Surname,id,Pn,pass);
                FirstPage.users.add(s);
                Authentication.users.add(s);
                users.add(s);
                Main.saveGoodItems(users);

                Authentication authentication=new Authentication();
                authentication.setVisible(true);

            }
        });
        jButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                FirstPage firstPage=new FirstPage();
                firstPage.setVisible(true);
            }
        });


    }
}

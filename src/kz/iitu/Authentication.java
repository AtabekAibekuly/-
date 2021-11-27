package kz.iitu;

import javax.swing.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Authentication extends JFrame {

    static ArrayList<User> users=new ArrayList<>();
    User citizen=new User();
    private JLabel label;
    private JTextField Id;
    private JTextField pass;
    private JButton enter;
    private JButton jButton1;

    static {

        users.add(new User(29800, "123"));
        users.add(new User(29801, "321"));
        users.add(new User(29802, "1234"));
        users.add(new User(29803, "12345"));
        Main.saveGoodItems(users);

    }
    public Authentication(){
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        setTitle("Citizen Authentication");

        label = new JLabel("Enter your Id number:");
        label.setBounds(10, 10, 180, 15);
        add(label);
        Id = new JTextField();
        Id.setBounds(10, 40, 200, 20);
        add(Id);


        label = new JLabel("Enter your password:");
        label.setBounds(10, 70, 180, 15);
        add(label);
        pass = new JTextField();
        pass.setBounds(10, 100, 200, 20);
        add(pass);
        enter=new JButton("Enter");
        enter.setBounds(220,300,80,30);
        add(enter);
        jButton1=new JButton("Back");
        jButton1.setBounds(300,300,80,30);
        add(jButton1);

        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Integer id = Integer.parseInt(Id.getText()); // int
                String pas = pass.getText();

                for (User citizenss : users) {

                    if (citizenss.getId() == id && citizenss.getPass().equals(pas)){
                        System.out.println("123");
                        Converter converter=new Converter();
                        converter.setVisible(true);
                        break;
                    } else {
                        Authentication authentication=new Authentication();
                        authentication.setVisible(true);
                    }
                }
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

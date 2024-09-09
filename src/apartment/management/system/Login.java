package apartment.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import static java.awt.Color.WHITE;

public class Login extends JFrame implements ActionListener {
    JLabel label1, label2;
    JTextField textfield1;
    JPasswordField passwordField1;
    JButton button1, button2;
    Login() {
        super("Apartment Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/apartment.png"));
        Image i2 = i1.getImage().getScaledInstance(255,270, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(318, 0, 255,270);
        add(image);



        label1 = new JLabel("Username:");
        label1.setFont(new Font("Tahoma", Font.BOLD, 15));
        label1.setForeground(Color.WHITE);
        label1.setBounds(40, 20, 100, 30);
        add(label1);

        textfield1 = new JTextField(15);
        textfield1.setBounds(150, 20, 150,30);
        textfield1.setForeground(WHITE);
        textfield1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textfield1.setBackground(new Color(135, 158, 161));
        add(textfield1);

        label2 = new JLabel("Password:");
        label2.setFont(new Font("Tahoma", Font.BOLD, 15));
        label2.setForeground(Color.WHITE);
        label2.setBounds(40, 70, 100, 30);
        add(label2);

        passwordField1 = new JPasswordField(15);
        passwordField1.setBounds(150, 70, 150, 30);
        passwordField1.setForeground(Color.WHITE);
        passwordField1.setBackground(new Color(135, 158, 161));
        add(passwordField1);

        button1 = new JButton("Login");
        button1.setFont(new Font("serif", Font.BOLD,15));
        button1.setForeground(Color.BLACK);
        button1.setBounds(40,140,120, 30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("Cancel");
        button2.setFont(new Font("serif", Font.BOLD,15));
        button2.setForeground(Color.BLACK);
        button2.setBounds(180,140,120, 30);
        button2.addActionListener(this);
        add(button2);


        getContentPane().setBackground(new Color(21, 20, 20));
        setLayout(null);
        setSize(600, 300);
        setLocation(400, 270);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            try {
                Con c = new Con();
                String user = textfield1.getText();
                String pass = passwordField1.getText();

                String q = "SELECT*FROM login WHERE username = '"+user+"' and password = '"+pass+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()){
                    new Overview();
                    setVisible(false);
                }else {
                    JOptionPane.showMessageDialog(null, "Invalid");
                }

            } catch (Exception E){
                E.printStackTrace();
            }

        }else {
            System.exit(102);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}

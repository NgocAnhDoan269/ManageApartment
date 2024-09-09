package apartment.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Overview extends JFrame {
    JButton b1, b2, b3, b4, b5, b6;
    Overview() {
        super("APARTMENT MANAGEMENT SYSTEM");

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(280, 5, 1238, 820);
        panel.setBackground(new Color(3, 45, 48));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5, 5, 270, 820);
        panel1.setBackground(new Color(3, 45, 48));
        add(panel1);

        b1 = new JButton("Dashboard");
        b1.setFont(new Font("Tahoma", Font.TRUETYPE_FONT, 20));
        b1.setBounds(30,30,200,40);
        b1.setForeground(Color.BLACK);
        panel1.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        b2 = new JButton("Manage Apartment");
        b2.setFont(new Font("Tahoma", Font.TRUETYPE_FONT, 20));
        b2.setBounds(30,80,200,40);
        b2.setForeground(Color.BLACK);
        panel1.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Manage();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });


        b3 = new JButton("Payments");
        b3.setFont(new Font("Tahoma", Font.TRUETYPE_FONT, 20));
        b3.setBounds(30,130,200,40);
        b3.setForeground(Color.BLACK);
        panel1.add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        b4 = new JButton("Resident Info");
        b4.setFont(new Font("Tahoma", Font.TRUETYPE_FONT, 20));
        b4.setBounds(30,230,200,40);
        b4.setForeground(Color.BLACK);
        panel1.add(b4);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        b5 = new JButton("Search");
        b5.setFont(new Font("Tahoma", Font.TRUETYPE_FONT, 20));
        b5.setBounds(30,180,200,40);
        b5.setForeground(Color.BLACK);
        panel1.add(b5);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        b6 = new JButton("Log Out");
        b6.setFont(new Font("Tahoma", Font.TRUETYPE_FONT, 20));
        b6.setBounds(30,280,200,40);
        b6.setForeground(Color.BLACK);
        panel1.add(b6);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });



        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1950,870);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Overview();
    }
}

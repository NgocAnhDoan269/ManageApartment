package apartment.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddApt extends JFrame implements ActionListener {
     JTextField t2, t4, t6, t7, t8,t9, t11;
     JComboBox t10;
     JButton b1, b2;
    AddApt(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890, 590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);


        JLabel l1 = new JLabel("Resident Information");
        l1.setBounds(194,10,350,22);
        l1.setFont(new Font("Tahoma",Font.BOLD, 22));
        l1.setForeground(Color.WHITE);
        panel.add(l1);

        JLabel l12 = new JLabel("Apartment Information");
        l12.setBounds(556,10,350,22);
        l12.setFont(new Font("Tahoma",Font.BOLD, 22));
        l12.setForeground(Color.WHITE);
        panel.add(l12);



        JLabel l2 = new JLabel("Apartment No:");
        l2.setBounds(476,70,152,22);
        l2.setFont(new Font("Tahoma",Font.BOLD, 14));
        l2.setForeground(Color.WHITE);
        panel.add(l2);
        t2 = new JTextField();
        t2.setBounds(612,70,156,20);
        t2.setFont(new Font("Tahoma",Font.PLAIN, 14));
        t2.setForeground(Color.BLACK);
        panel.add(t2);



        JLabel l4 = new JLabel("Area (m2):");
        l4.setBounds(476,110,152,22);
        l4.setFont(new Font("Tahoma",Font.BOLD, 14));
        l4.setForeground(Color.WHITE);
        panel.add(l4);
        t4 = new JTextField();
        t4.setBounds(612,110,156,20);
        t4.setFont(new Font("Tahoma",Font.PLAIN, 14));
        t4.setForeground(Color.BLACK);
        panel.add(t4);


        JLabel l6 = new JLabel("Owner:");
        l6.setBounds(64,70,152,22);
        l6.setFont(new Font("Tahoma",Font.BOLD, 14));
        l6.setForeground(Color.WHITE);
        panel.add(l6);
        t6 = new JTextField();
        t6.setBounds(200,70,240,20);
        t6.setFont(new Font("Tahoma",Font.PLAIN, 14));
        t6.setForeground(Color.BLACK);
        panel.add(t6);

        JLabel l7 = new JLabel("Email:");
        l7.setBounds(64,110,152,22);
        l7.setFont(new Font("Tahoma",Font.BOLD, 14));
        l7.setForeground(Color.WHITE);
        panel.add(l7);
        t7 = new JTextField();
        t7.setBounds(200,110,240,20);
        t7.setFont(new Font("Tahoma",Font.PLAIN, 14));
        t7.setForeground(Color.BLACK);
        panel.add(t7);


        JLabel l8 = new JLabel("Phone Number");
        l8.setBounds(64,150,152,22);
        l8.setFont(new Font("Tahoma",Font.BOLD, 14));
        l8.setForeground(Color.WHITE);
        panel.add(l8);
        t8 = new JTextField();
        t8.setBounds(200,150,240,20);
        t8.setFont(new Font("Tahoma",Font.PLAIN, 14));
        t8.setForeground(Color.BLACK);
        panel.add(t8);


        JLabel l9 = new JLabel("Personal ID:");
        l9.setBounds(64,190,152,22);
        l9.setFont(new Font("Tahoma",Font.BOLD, 14));
        l9.setForeground(Color.WHITE);
        panel.add(l9);
        t9 = new JTextField();
        t9.setBounds(200,190,240,20);
        t9.setFont(new Font("Tahoma",Font.PLAIN, 14));
        t9.setForeground(Color.BLACK);
        panel.add(t9);


        JLabel l10 = new JLabel("Gender:");
        l10.setBounds(64,230,152,22);
        l10.setFont(new Font("Tahoma",Font.BOLD, 14));
        l10.setForeground(Color.WHITE);
        panel.add(l10);
        t10 = new JComboBox(new String[] {"Male", "Female", "Others"});
        t10.setBounds(200,230,240,20);
        t10.setFont(new Font("Tahoma",Font.PLAIN, 14));
        t10.setForeground(Color.BLACK);
        t10.setBackground(new Color(16,108,115));
        panel.add(t10);


        JLabel l11 = new JLabel("Year of Birth:");
        l11.setBounds(64,270,152,22);
        l11.setFont(new Font("Tahoma",Font.BOLD, 14));
        l11.setForeground(Color.WHITE);
        panel.add(l11);
        t11 = new JTextField();
        t11.setBounds(200,270,240,20);
        t11.setFont(new Font("Tahoma",Font.PLAIN, 14));
        t11.setForeground(Color.BLACK);
        panel.add(t11);


        b1 = new JButton("<Back");
        b1.setBounds(556,270,111,33);
        b1.setForeground(Color.BLACK);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        panel.add(b1);

        b2 = new JButton("Add Info.");
        b2.setBounds(690,270,111,33);
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        panel.add(b2);




        setUndecorated(true);
        setLocation(330, 58);
        setLayout(null);
        setSize(900,600);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b2) {
           Con c = new Con();
            if (c.statement != null) {
                    String apartmentNo = t2.getText();
                    String area = t4.getText();
                    String owner = t6.getText();
                    String mail = t7.getText();
                    String phoneNo = t8.getText();
                    String perId = t9.getText();
                    String gender = (String) t10.getSelectedItem();
                    String birthYear = t11.getText();


                    // Kiểm tra xem tất cả các trường có được nhập đầy đủ không
                    if (apartmentNo.isEmpty() || area.isEmpty() || owner.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Error");
                        return;
                    }

                    // Nếu tất cả các trường đều được nhập đầy đủ, mới tiến hành thêm vào CSDL
                    String sql = "INSERT INTO manage (perId, owner, gender, birthYear, phoneNo, mail, apartmentNo, area ) VALUES (?, ?, ?, ?, ?,?,?,?)";
                    try (PreparedStatement stmt = c.connection.prepareStatement(sql)) {
                        stmt.setString(1, perId);
                        stmt.setString(2, owner);
                        stmt.setString(3, gender);
                        stmt.setString(4, birthYear);
                        stmt.setString(5, phoneNo);
                        stmt.setString(6, mail);
                        stmt.setString(7, apartmentNo);
                        stmt.setString(8, area);
                        stmt.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Apartment Successfully Added!");                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error.");
                    }
                } else {
                    System.out.println("Unable to connect to database.");
                }
        }
    }

    public static void main(String[] args) {
        new AddApt();
    }
}

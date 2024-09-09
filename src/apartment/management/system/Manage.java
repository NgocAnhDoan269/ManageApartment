package apartment.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Manage extends JFrame {

    JTable table;
    JButton back, add;

    Manage(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890, 590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        table = new JTable();
        table.setBounds(10,40,890,400);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
            Con c = new Con();
            String ApartmentInfo = "select*from manage";
            ResultSet resultSet = c.statement.executeQuery(ApartmentInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch(Exception e){
            e.printStackTrace();
        }

        back = new JButton("BACK");
        back.setForeground(Color.BLACK);
        back.setBounds(260, 500, 120, 30);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        panel.add(back);

        add = new JButton("ADD APT.");
        add.setForeground(Color.BLACK);
        add.setBounds(100, 500, 120, 30);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new AddApt();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });
        panel.add(add);

        JLabel No = new JLabel("No.");
        No.setBounds(15,15,80,19);
        No.setForeground(Color.WHITE);
        No.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(No);

        JLabel perId = new JLabel("Per ID");
        perId.setBounds(110,15,80,19);
        perId.setForeground(Color.WHITE);
        perId.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(perId);

        JLabel owner = new JLabel("Owner");
        owner.setBounds(210,15,80,19);
        owner.setForeground(Color.WHITE);
        owner.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(owner);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(310,15,80,19);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(gender);

        JLabel year = new JLabel("YOB");
        year.setBounds(408,15,80,19);
        year.setForeground(Color.WHITE);
        year.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(year);

        JLabel phoneNo = new JLabel("PhoneNo.");
        phoneNo.setBounds(510,15,80,19);
        phoneNo.setForeground(Color.WHITE);
        phoneNo.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(phoneNo);

        JLabel mail = new JLabel("Mail");
        mail.setBounds(610,15,80,19);
        mail.setForeground(Color.WHITE);
        mail.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(mail);

        JLabel aptNo = new JLabel("Apt. No.");
        aptNo.setBounds(710,15,80,19);
        aptNo.setForeground(Color.WHITE);
        aptNo.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(aptNo);

        JLabel area = new JLabel("Area(m2)");
        area.setBounds(810,15,80,19);
        area.setForeground(Color.WHITE);
        area.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(area);







        setUndecorated(true);
        setLocation(330, 58);
        setLayout(null);
        setSize(900,600);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Manage();
    }
}

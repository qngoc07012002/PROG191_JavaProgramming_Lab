import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("My application");
        myFrame.setVisible(true); //display Frame
        myFrame.setSize(900,600);
        myFrame.setLocation(600,200);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Nhan X tu dong tat chuong trinh

        // Tao tung panel  trong Frame
        JPanel myPanel = new JPanel();
        JLabel mystudentLabel = new JLabel("Student Name");
        JTextField studentName = new JTextField();
        studentName.setSize(50,10);
        myPanel.setLayout(new FlowLayout());
        myPanel.add(mystudentLabel);
        myPanel.add(studentName);
        myFrame.add(myPanel);

        String[][] data = {
                { "Kundan Kumar Jha", "4031", "CSE" },
                { "Anand Jha", "6014", "IT" }
        };
        // Column Names
        String[] columnNames = { "Name", "Roll Number", "Department" };
        // Initializing the JTable
        JTable jTable = new JTable(data, columnNames);
        jTable.setBounds(30, 40, 200, 300);
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(jTable);
        myFrame.add(sp);
        // Frame Size
        myFrame.setSize(500, 200);
        myFrame.setLocationRelativeTo(null);
        myFrame.setVisible(true);
    }
}
package bank.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
JButton loginButton,closeButton,logout;
JTextField cardNoField;
JPasswordField pinField;

    Login() {
        // Set size, layout, and visibility
        setSize(800, 480);
        setLayout(null);
        setLocation(350, 200);
        setTitle("AUTOMATED TELLER MACHINE");

        // Set the close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load the logo image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));

        // Check if the image was loaded correctly
        if (i1 == null) {
            JOptionPane.showMessageDialog(this, "Image not found! Ensure the image path is correct.");
            return;
        }

        // Scale the image to fit the label size (optional)
        Image img = i1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        i1 = new ImageIcon(img);

        // Create label and set bounds for position and size
        JLabel label = new JLabel(i1);
        label.setBounds(70, 10, 100, 100);  // Adjust the position and size based on your needs
        add(label);

        // Welcome label
        JLabel l1 = new JLabel("Welcome to ATM");
        l1.setBounds(200, 40, 400, 40);
        l1.setFont(new Font("Osward", Font.BOLD, 38));
        add(l1);

        // Card number label and input field
        JLabel l2 = new JLabel("Card No: ");
        l2.setBounds(120, 150, 200, 40);
        l2.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l2);

        cardNoField = new JTextField();
        cardNoField.setBounds(300, 150, 250, 30);
        cardNoField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardNoField);

        // PIN label and input field
        JLabel l3 = new JLabel("PIN: ");
        l3.setBounds(120, 220, 200, 40);
        l3.setFont(new Font("Osward", Font.BOLD, 20));
        add(l3);

        pinField = new JPasswordField();
        pinField.setBounds(300, 220, 250, 30);
        pinField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinField);

        // Login button
        loginButton = new JButton("Login");
        loginButton.setBounds(300, 280, 100, 40);
        loginButton.setFont(new Font("Arial", Font.BOLD, 18));
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.WHITE);
        add(loginButton);
        loginButton.addActionListener(this);

        // Clear button
         closeButton = new JButton("Clear");
        closeButton.setBounds(430, 280, 100, 40); // Set correct bounds for Clear button
        closeButton.setFont(new Font("Arial", Font.BOLD, 18));
        closeButton.setBackground(Color.BLACK);
        closeButton.setForeground(Color.WHITE);
        closeButton.addActionListener(this);

        add(closeButton);

        logout = new JButton("Sign Up");
        logout.setBounds(300, 350, 230, 40);
        logout.setFont(new Font("Arial", Font.BOLD, 18));
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.addActionListener(this);

        add(logout);

        // Set background color
        getContentPane().setBackground(Color.WHITE);

        // Center the window on the screen
        setLocationRelativeTo(null);

        // Make the frame visible
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==closeButton){
            cardNoField.setText("");
            pinField.setText("");
            
        }
        else if(ae.getSource()== logout){
            
        }
        else if(ae.getSource()== loginButton){
            
        }

    }

    public static void main(String[] args) {
        // Create the login window
        new Login();
    }
}

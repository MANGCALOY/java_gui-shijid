package jwindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class loginform extends JFrame implements ActionListener {
    private JLabel Header, labelFooter, Body;
    private JLabel Username, Password;
    private JTextField fieldUsername;
    private JPasswordField fieldPassword;
    private JButton buttonLogin, buttonSignUp;
    
    public loginform() {

        setSize(400, 500 );
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // title
        Header = new JLabel("LOGIN!");
        Header.setBounds(120,10, 175, 100);
        Header.setFont(new Font("ARIAL", Font.BOLD, 40));
        Header.setForeground(new Color(102, 102, 102));
        
        // body
        Body = new JLabel("Please signin to continue");
        Body.setBounds(1, 1, 250, 60);
        Body.setFont(new Font("ARIAL", Font.BOLD, 10));
        Body.setForeground(new Color(102, 102, 102));

        // username  //fieludername
        Username = new JLabel("Username:");
        Username.setFont(new Font("ARIAL", Font.PLAIN, 15));
        Username.setBounds(20, 170, 300, 30);

        fieldUsername = new JTextField(20); 
        fieldUsername.setBounds(95, 170, 200, 33);
        fieldUsername.setForeground(new Color(102, 102, 102));
        fieldUsername.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        //password  //fieldpassword
        Password = new JLabel("Password:");
        Password.setFont(new Font("ARIAL", Font.PLAIN, 15));
        Password.setBounds(20, 220, 280, 30);
        
        fieldPassword = new JPasswordField();
        fieldPassword.setBounds(95, 220, 200, 33);
        fieldPassword.setForeground(new Color(102, 102, 102));
        fieldPassword.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        
        //button login & signup
        buttonLogin = new JButton("Login");
        buttonLogin.setBounds(95, 270, 200, 40);
        buttonLogin.setFont(new Font("ARIAL", Font.PLAIN, 14));
        buttonLogin.setForeground(Color.WHITE);
        buttonLogin.setBackground(new Color(102, 102, 102));
        buttonLogin.setBorder(BorderFactory.createEmptyBorder());
        buttonLogin.setBorder(null);


        buttonSignUp = new JButton("Sign up");
        buttonSignUp.setBounds(230, 320, 50, 20);
        buttonSignUp.setFont(new Font("ARIAL", Font.PLAIN, 10));
        buttonSignUp.setForeground(new Color(102, 102, 102));
        buttonSignUp.setBackground(new Color(238, 238, 238));
        buttonSignUp.setBorder(BorderFactory.createEmptyBorder());

        //footer
        labelFooter = new JLabel("Don't have a account?");
        labelFooter.setBounds(110, 320, 200, 20);
        labelFooter.setFont(new Font("ARIAL", Font.BOLD, 12));
        labelFooter.setBackground(new Color(102, 102, 102));
        labelFooter.setBorder(BorderFactory.createEmptyBorder());

        Container container = getContentPane();
        container.setBackground(new Color(238, 238, 238));
        container.setLayout(null);
        
        container.add(Header);
        container.add(Body);
        container.add(labelFooter);
        container.add(Username);
        container.add(fieldUsername);
        container.add(Password);
        container.add(fieldPassword);
        container.add(buttonLogin);
        container.add(buttonSignUp);
        
        buttonLogin.addActionListener(this);
        buttonSignUp.addActionListener(this);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
            String username = fieldUsername.getText();
            String password = new String(fieldPassword.getPassword());

            if (e.getSource().equals(buttonSignUp)){
                new signupform();
                dispose();
                
            }else if (username.equals("admin") && password.equals("password")) {
                JOptionPane.showMessageDialog(null, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password.");
            }
        }
    
    
    public static void main(String[] args) {
        new loginform();
    }
}

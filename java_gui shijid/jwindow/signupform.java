package jwindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class signupform extends JFrame implements ActionListener {
    private JLabel Header, labelFooter, labelConfirmPassword;
    private JLabel Username, Password , Fullname;
    private JTextField fieldUsername;
    private JTextField fieldFullname;
    private JPasswordField fieldPassword;
    private JPasswordField fieldConfirmPassword;
    private JButton buttonLogin, buttonSignUp;
    
    public signupform() {

        setSize(400, 500 );
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // title
        Header = new JLabel("SIGN UP!");
        Header.setBounds(100,10, 175, 100);
        Header.setFont(new Font("ARIAL", Font.BOLD, 40));
        Header.setForeground(new Color(102, 102, 102));

        // fullname
        Fullname = new JLabel("Fullname:");
        Fullname.setFont(new Font("ARIAL", Font.PLAIN, 15));
        Fullname.setBounds(20, 120, 200, 30);

        // fieldfullname
        fieldFullname = new JTextField(20); 
        fieldFullname.setBounds(150, 120, 200, 33);
        fieldFullname.setForeground(new Color(102, 102, 102));
        fieldFullname.setBorder(BorderFactory.createEmptyBorder(7,7,7,7));
        

        // username  //fielusername
        Username = new JLabel("Username:");
        Username.setFont(new Font("ARIAL", Font.PLAIN, 15));
        Username.setBounds(20, 170, 300, 30);

        fieldUsername = new JTextField(20); 
        fieldUsername.setBounds(150, 170, 200, 33);
        fieldUsername.setForeground(new Color(102, 102, 102));
        fieldUsername.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        //password  //fieldpassword
        Password = new JLabel("Password:");
        Password.setFont(new Font("ARIAL", Font.PLAIN, 15));
        Password.setBounds(20, 220, 280, 30);
        
        fieldPassword = new JPasswordField();
        fieldPassword.setBounds(150, 220, 200, 33);
        fieldPassword.setForeground(new Color(102, 102, 102));
        fieldPassword.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        // confirmpassword
        labelConfirmPassword = new JLabel("Confirm Password:");
        labelConfirmPassword.setFont(new Font("ARIAL", Font.PLAIN, 15));
        labelConfirmPassword.setBounds(20, 270, 280, 30);

        // fieldconfirmpassword
        fieldConfirmPassword = new JPasswordField();
        fieldConfirmPassword.setBounds(150, 270, 200, 33);
        fieldConfirmPassword.setForeground(new Color(102, 102, 102));
        fieldConfirmPassword.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        
        //button login & signup
        buttonSignUp = new JButton("SignUp");
        buttonSignUp.setBounds(150, 320, 200, 40);
        buttonSignUp.setFont(new Font("Arial", Font.PLAIN, 14));
        buttonSignUp.setForeground(Color.WHITE);
        buttonSignUp.setBackground(new Color(102, 102, 102));
        buttonSignUp.setBorder(BorderFactory.createEmptyBorder());
        buttonSignUp.setBorder(null);


        buttonLogin = new JButton("Login");
        buttonLogin.setBounds(290, 370, 50, 20);
        buttonLogin.setFont(new Font("ARIAL", Font.PLAIN, 15));
        buttonLogin.setForeground(new Color(102, 102, 102));
        buttonLogin.setBackground(new Color(238, 238, 238));
        buttonLogin.setBorder(BorderFactory.createEmptyBorder());

        //footer
        labelFooter = new JLabel("Already have an account?");
        labelFooter.setBounds(150, 370, 200, 20);
        labelFooter.setFont(new Font("ARIAL", Font.BOLD, 12));
        labelFooter.setBackground(new Color(102, 102, 102));
        labelFooter.setBorder(BorderFactory.createEmptyBorder());

        Container container = getContentPane();
        container.setBackground(new Color(238, 238, 238));
        container.setLayout(null);
        
        container.add(Header);
        container.add(labelFooter);
        container.add(Fullname);
        container.add(fieldFullname);
        container.add(Username);
        container.add(fieldUsername);
        container.add(Password);
        container.add(fieldPassword);
        container.add(labelConfirmPassword);
        container.add(fieldConfirmPassword);
        container.add(buttonLogin);
        container.add(buttonSignUp);
        
        buttonLogin.addActionListener(this);
        buttonSignUp.addActionListener(this);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
            String username = fieldUsername.getText();
            String password = new String(fieldPassword.getPassword());

            if (e.getSource().equals(buttonLogin)){
                new loginform();
                dispose();
                
            }else if (username.equals("admin") && password.equals("password")) {
                JOptionPane.showMessageDialog(null, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password.");
            }
        }
    
    
    public static void main(String[] args) {
        new signupform();
    }
}

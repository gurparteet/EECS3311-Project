package login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;





public class loginUI extends JFrame implements ActionListener{
	
	private static JLabel usernameLabel , passwordLabel , messageLabel;
	private static JTextField usernameText;
	private static JPasswordField passwordText;
	private static JButton loginButton;
	private static JButton resetButton;
	private static JPanel loginPanel;
	private static String username , password ;

	
	
	// Calling the constructor
	 
	//public static String getUsername() {return username;}
   //	public static String getPassword() {return password;}



	loginUI(){
		
		
		usernameLabel = new JLabel("Username");
		usernameText= new JTextField(26);  // Setting length of user to be 26 character
		
		passwordLabel=new JLabel("Password");
		passwordText= new JPasswordField();
		
		messageLabel=new JLabel();
		messageLabel.setFont(new Font(null, Font.ITALIC,25));
		
		
		
		loginButton= new JButton("Login");
		resetButton=new JButton("Reset") ;
		
		
		//Creating Panel
		
		//
		loginPanel =new JPanel(new GridLayout(4, 1));
		
		loginPanel.add(usernameLabel);
		loginPanel.add(usernameText);
		
		loginPanel.add(passwordLabel);
		loginPanel.add(passwordText);	
		
		loginPanel.add(loginButton);
		loginPanel.add(resetButton);
		
		loginPanel.add(messageLabel);
		
		
		add(loginPanel, BorderLayout.CENTER);
		setTitle("Login Page") ;
		
		//Action when click login  button 
		loginButton.addActionListener(this);
		
		//Action when click   button 
		resetButton.addActionListener(this);
		
	}
	

	
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==resetButton) {
			usernameText.setText("");
			passwordText.setText("");
		}
		
		if(e.getSource()==loginButton) {
			
			username= usernameText.getText().toUpperCase();
			password=String.valueOf(passwordText.getPassword());
		
			
		}
		

		
		System.out.println(username);
	    System.out.println(password);
		
		proxyLogin checkLogin=new proxyLogin(username,password);
		
		if(checkLogin.loginStatus){
			messageLabel.setForeground(Color.green);
			messageLabel.setText(checkLogin.loginMessage);
		}
		else {
		messageLabel.setForeground(Color.red);
		messageLabel.setText(checkLogin.loginMessage);
			
		}
		
		System.out.println(checkLogin.loginStatus);
		System.out.println(checkLogin.loginMessage);

		
	}
	
	
	
	
	public static void  main(String[] args) {
		
		UserData newDatabase = new UserData();
		loginUI login1 = new loginUI();
		
	
		try {
		
			
			
			login1.setSize(500, 130);;
			login1.setVisible(true);
	
		}
		
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
				
		
	
		
	}










	
}



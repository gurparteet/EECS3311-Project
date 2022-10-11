package login;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;





public class loginUI extends JFrame implements ActionListener{
	
	private static JLabel usernameLabel , passwordLabel;
	private static JTextField usernameText;
	private static JPasswordField passwordText;
	private static JButton loginButton;
	private static JPanel loginPanel;
	private static String username , password ;
	
	
	// Calling the constructor
	 
	public static String getUsername() {
		return username;
	}



	public static String getPassword() {
		return password;
	}



	loginUI(){
		
		usernameLabel= new JLabel();
		usernameLabel = new JLabel("Username");
		usernameText= new JTextField(26);  // Setting length of user to be 26 character
		
		passwordLabel=new JLabel();
		passwordLabel=new JLabel("Password");
		passwordText= new JPasswordField();
		
		
		loginButton= new JButton("Login");
		
		
		//Creating Panel
		
		//
		loginPanel =new JPanel(new GridLayout(3, 1));
		
		loginPanel.add(usernameLabel);
		loginPanel.add(usernameText);
		
		loginPanel.add(passwordLabel);
		loginPanel.add(passwordText);	
		
		loginPanel.add(loginButton);
		
		
		add(loginPanel, BorderLayout.CENTER);
		
		
		//Action when click login  button 
		loginButton.addActionListener(this);
		setTitle("Login Page") ;
	}
	

	
	public void actionPerformed(ActionEvent e) {

		username= usernameText.getText();
		password= passwordText.getText(); 
		
		System.out.println(username);
		System.out.println(password);
		
		proxyLogin checkLogin=new proxyLogin(username,password);
		
		
		
		
		 
		
		
		
		
		
		
	}
	
	
	
	
	
	




	public static void  main(String[] args) {
		
		
		try {
			
			loginUI login1 = new loginUI();
			login1.setSize(450, 130);;
			login1.setVisible(true);
	
		}
		
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
				
		
		
	}










	
}



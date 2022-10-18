package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;  
import org.w3c.dom.NodeList;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import netscape.javascript.JSObject;

import org.w3c.dom.Node;  
import org.w3c.dom.Element;  
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;





public class proxyLogin extends UserData{
	String incomingUsername, incomingPassword ;
	static boolean loginStatus=false ;
	static String loginMessage;

	
	
	
	
	/**
	 *  This is a constructor for ProxyLogin with parameters username and password
	 *  
	 * @param username - String coming form user
	 * @param password- String coming from user 
	 */
	
	proxyLogin(String username , String password ){
		username=this.incomingUsername ;
		password=this.incomingPassword ;		
	
		
		
	/**
	 * This method invokes ProxyLogin to validate 
	 */
		loginStatus= doValidate(incomingUsername, incomingPassword,loginMessage);
		
		
					
		
	}
	
	
	
	public boolean doValidate(String username, String password ,String loginMessage )   {
		boolean flag=false ;
		UserData uData=new UserData();
		HashMap<String,String> loginData = uData.getUserData(); 
			
		
				
		if(loginData.containsKey(username)) {
			if(loginData.get(username).equals(password)) {
				flag=true;
				loginMessage="Login Successful" ;
			}else {
				loginMessage="Invalid Password- Login Unsuccessful" ;
			}
		
		}else {
			loginMessage="Username doesnot exist" ;
			
		}
		
		
		
		
		return flag;
		
		
	}
	
}		
		

package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;  
import org.w3c.dom.Document;  
import org.w3c.dom.NodeList;  
import org.w3c.dom.Node;  
import org.w3c.dom.Element;  
import java.io.File;





public class ProxyLogin {
	String incomingUsername, incomingPassword ;
	static boolean loginStatus=false ;
	static String loginMessage;
	
	ProxyLogin(String username , String password){
		username=this.incomingUsername ;
		password=this.incomingPassword ;
		
		
		loginStatus= doValidate(incomingUsername, incomingPassword,loginMessage);
		
			
		
		// Read user.xml file  and validate username and password // and launch main GUI
		
	}
	
	public boolean doValidate(String username, String password ,String loginMessage) {
		boolean flag=false ;
		
		return flag;
		
		
		//-----------Parsing XML file ----------
//	try {	
//		File file =new File("/Users/gurparteetsinghpurbe/Desktop/Document/Studies/YORK STUDIES/3rd Year/Fall 2022/EECS 3311 - Software Design/Project/src/login/userDatabase.xml");
//		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); 
//		
//		DocumentBuilder db = dbf.newDocumentBuilder();    
//		Document parseDoc = db.parse(file) ;
//		parseDoc.getDocumentElement().normalize();
//		
//		System.out.println("Root Element" + parseDoc.getDocumentElement().getNodeName());
//		NodeList nodeList= parseDoc.getElementsByTagName("credentials");
//		
//		for(int temp= 0; temp < nodeList.getLength(); temp++ ) {
//			Node node= nodeList.item(temp);
//			
//		}
//		
//		
//		
//		
//		NodeList nodeList= parseDoc.getElementByTagName("credentials") ;
//		
//		
//		
//		
//
//		
//	}
//	catch(Exception e){
//		
//	}


	
		
		
		
		
		
		
		
		//---------------------
		
		
		
		return flag;
		
	}
	


	
	
	

}
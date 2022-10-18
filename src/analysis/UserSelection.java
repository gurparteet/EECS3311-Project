package analysis;

import java.util.Scanner;
import java.util.*;

public class UserSelection  {
	
	public static String countryCode ;
	public static int startDate ;
	public static int endDate;
	public static String indicatorType;
	public String[] availableAnalysis= {"Analysis1" ,"Analysis2" ,"Analysis3" ,"Analysis4" } ;
	
	
	/*
	 * 
	 */
//This class will be used for user selection
	//Start Year 
	//End  year 
	//Type of analysis 

	


public String buildUrl() {
	 String urlString;
	urlString = String.format("http://api.worldbank.org/v2/country/%s/indicator/"+indicatorType+ "?date="+ startDate+":"+endDate+"&format=json", countryCode);

	return urlString ; 
}

	
	
public static void main(String args[]) {
	Scanner askUser=new Scanner(System.in);
	System.out.println("Enter Country Code");
	countryCode=askUser.next() ;
	System.out.println("Enter start date");
	startDate=askUser.nextInt() ;
	System.out.println("Enter end date");
	endDate=askUser.nextInt();
	
	System.out.println("Enter Analysis Type-Options  Analysis1...Analysis4");
	String analyse = askUser.next();
	
	
}
	

}

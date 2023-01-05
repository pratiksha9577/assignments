package assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class reverselist {

	public static void main(String[] args) {
		
		 ArrayList<String> tools = new ArrayList<String>();
		 tools.add("Java");
		 tools.add("Selenium");
		 tools.add("TestNG");
		 tools.add("Git");
		 tools.add("Github");
		 
		  System.out.println("Before Reversing");  
	      System.out.println(tools);  
	      Collections.reverse(tools);  
	      System.out.println("After Reversing");  
	      System.out.println(tools);  
	}

}

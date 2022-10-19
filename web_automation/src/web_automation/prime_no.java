package web_automation;

public class prime_no {

	public static void main(String[] args) {
	double r = 1;
	System.out.print( "prime number from 1 to 100 is :");
	   for (int i=2 ;i<=100;i++)
	   { 
		   for (int j=2 ;j<i;j++) {
			  r=i%j;
			  if(r==0) {
				  break;
			  }
	   } 
		   
		   if(r!=0) {
		   System.out.print( i + " ");
		  }
				
				
			}
		
	  
		 
   	

	}

}

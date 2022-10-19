package web_automation;

public class average_of_number {

	public static void main(String[] args) {
		 double sum=0;
		 double [] array = { 110,90.78,111,8989,7876} ;
		 for (double number : array) {
				sum =sum+number;
				}
			double average = sum/5;
			 System.out.println("average of the number is = " + average );
	}

}

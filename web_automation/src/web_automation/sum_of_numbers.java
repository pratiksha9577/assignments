package web_automation;

public class sum_of_numbers {

    public static void main(String[] arg) {
    double sum=0;
	double [] array = { 10,90.78,111,8989,7876} ;
	for (double number : array) {
		sum =sum+number;
		}
	 System.out.println("sum of the number is = " + sum  );

}
}
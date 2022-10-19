package web_automation;

public class stringmethods {

	public static void main(String[] args) {
	int[][] myNumbers = { {1, 2, 3}, {5, 6, 7} };
	for(int i=0; i<2; i++) {
		
		for(int j=0; j<3; j++) 
		{ 
			 if(myNumbers[i][j]>6) {
			System.out.println(myNumbers[i][j]);
			 }
		}
		}
}

}

package assignment4;

import java.util.Collections;
import java.util.LinkedList;

public class printnumber {

	public static void main(String[] args) {
		LinkedList<Integer> number = new LinkedList<Integer>();
		number.add(10);
		number.add(45);
		number.add(90);
		number.add(45);
		number.add(23);
		number.add(90);
		number.add(40);

		int a = number.get((number.size() - 2));
		Collections.reverse(number);
		int b = number.get((number.size() - 2));
		System.out.print(b +","+a);


	}

}

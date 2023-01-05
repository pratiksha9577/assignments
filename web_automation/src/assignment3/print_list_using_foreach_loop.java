package assignment3;

import java.util.ArrayList;

public class print_list_using_foreach_loop {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(33);
		al.add(44);
		al.add(55);
		al.add(66);
		al.add(77);
		al.add(88);

		for (Integer x : al)
			
	    System.out.print(x + " ");

	}

}

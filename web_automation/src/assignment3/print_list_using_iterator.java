package assignment3;

import java.util.ArrayList;
import java.util.Iterator;

public class print_list_using_iterator {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(33);
		al.add(44);
		al.add(55);
		al.add(66);
		al.add(77);
		al.add(88);

		Iterator<Integer> iterator = al.iterator();
		while (iterator.hasNext())
			System.out.print(iterator.next() + " ");
	}

}

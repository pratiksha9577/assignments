package assignment4;

import java.util.ArrayList;

public class listaselement {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(11);
		list1.add(22);
		list1.add(33);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(9);
		list2.add(19);
		list2.add(29);
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(7);
		list3.add(17);
		list3.add(27);
		ArrayList<ArrayList<Integer>> list4 = new ArrayList<ArrayList<Integer>>();
		list4.add(list3);
		list4.add(list2);
		list4.add(list1);

		System.out.println(list4);

	}

}

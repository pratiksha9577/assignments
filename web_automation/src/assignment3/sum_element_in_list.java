package assignment3;

import java.util.ArrayList;

public class sum_element_in_list {

	public static void main(String[] args) {
		int add = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(33);
		al.add(44);
		al.add(55);
		al.add(66);
		al.add(77);
		al.add(88);
		for (int i = 0; i < al.size(); i++) {
			add = add + al.get(i);
		}

		System.out.println(add);
	}

}
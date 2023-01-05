package assignment3;

import java.util.ArrayList;

public class addarray_element_to_list {

	public static void main(String[] args) {
		int arr[] = { 78, 12, 89, 55, 35 };
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int number : arr) {
			al.add(number);

		}
		System.out.println(al);
	}
}

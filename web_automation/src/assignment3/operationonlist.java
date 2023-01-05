package assignment3;

import java.util.ArrayList;


public class operationonlist {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(33);
		al.add(44);
		al.add(55);
		al.add(66);
		al.add(77);
		al.add(88);
		System.out.println("1st operation removing secondelement by using index");
		al.remove(1);
		System.out.println(al);
		al.add(1, 44);

		System.out.println("--------------------------------------------------------");

		System.out.println("2nd operation removing second element by using value");
        al.remove(Integer.valueOf(44));
		System.out.println(al);
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Add 90 at index 3");
		al.add(3, 90);
		System.out.println(al);
		
		System.out.println("--------------------------------------------------------");
		
		System.out.print("Get the length of list is:");
		System.out.println(al.size());
		
		System.out.println("--------------------------------------------------------");
		
		
		System.out.println("Get the element in list ");
		
		for (int i = 0; i < 6; i++)
	      {
	         System.out.println(al.get(i)+" ");
	      }
		
		System.out.println("--------------------------------------------------------");

		System.out.println("convert list to array ");
		Integer[] arr = al.toArray(new Integer[al.size()]);
	       
	        for (Integer x : arr)
	            System.out.print(x + " ");
	}
}
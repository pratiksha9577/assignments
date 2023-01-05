package assignment4;

import java.util.LinkedList;

public class duplicateremove {

	public static void main(String[] args) {

		String myStr = "Java";
		LinkedList<String> tools = new LinkedList<String>();
		tools.add("Java");
		tools.add("Selenium");
		tools.add("Maven");
		tools.add("Java");

		System.out.println(tools);

		for (int i = 0; i < tools.size(); i++) {

			if (tools.get(i).contains(myStr)) {
				tools.removeLastOccurrence(tools.get(i));

			}

		}
		System.out.println(tools);
	}

}

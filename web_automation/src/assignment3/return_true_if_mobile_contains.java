package assignment3;

import java.util.ArrayList;

public class return_true_if_mobile_contains {

	public static void main(String[] args) {

		String myStr = "Mobile";
		
		ArrayList<String> tools = new ArrayList<String>();
		tools.add("Web Automation");
		tools.add(" API Automation");
		tools.add("Mobile Automation");

		System.out.println(tools.get(0));
		for (int i = 0; i < tools.size(); i++) {

			if (tools.get(i).contains(myStr)) {
				System.out.println("True");

			}

		}

	}

}

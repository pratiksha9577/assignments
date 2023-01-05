package assignment4;

import java.util.ArrayList;


public class newlist {

	public static void main(String[] args) {
		ArrayList<String> tools2 = new ArrayList<String>();
		
		String myStr = "Git";
		ArrayList<String> tools = new ArrayList<String>();
		tools.add("Java");
		tools.add("Selenium");
		tools.add("Maven");
		tools.add("Git");
		tools.add("Github");
		tools.add("GitBash");
		tools.add(" GitLab");
		System.out.println(tools);

		for (int i = 0; i < tools.size(); i++) {

			if (tools.get(i).contains(myStr)) {

				tools2.add(tools.get(i));

			}

		}
		System.out.println(tools2);
	}

}

package ass2;

import java.util.Scanner;

public class studentinfo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("please enter number of student:");
		int studentcount = sc.nextInt();
	
		String[] name = new String[3];
		String[] email = new String[3];
		for (int i = 0; i < studentcount; i++) {
			System.out.println("please enter name:");
			name[i] = sc.nextLine();
			System.out.println("please enter email:");
			email[i] = sc.nextLine();
		}
		System.out.print("please enter which student information you are looking for :");
		int studentno = sc.nextInt();
		if (studentno == 0) {
			System.out.println(name[studentno]);
			System.out.println(email[studentno]);

		} else if (studentno == 1) {
			System.out.println(name[studentno]);
			System.out.println(email[studentno]);
		} else if (studentno == 2) {
			System.out.println(name[studentno]);
			System.out.println(email[studentno]);
		}

	}

}

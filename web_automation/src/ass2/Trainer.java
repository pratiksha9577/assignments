package ass2;

public class Trainer {

	static String email;
	static String name;
	static String Department;
	static int id;

	public Trainer(String mail, String name1, String Department1, int id1) {

		email = mail;
		name = name1;
		Department = Department1;
		id = id1;
		System.out.println("This is the  trainer" + id);
		
	}
	
	public static void showinfo(String departmentdetails) {
		System.out.println("This is the email :" + email);
		System.out.println("This is the name :" + name);
		System.out.println("This is the department :" + Department);
		System.out.println("This is the id :" + id);
		System.out.println("Trainer " +id+ " can teach:" +departmentdetails );
		
		System.out.println("------------------------------------------");
	}

	public static void main(String[] args) {
		Trainer Trainer1 = new Trainer("mukesh@gmail.com", "Mukesh", "Testing", 1);
		Trainer.showinfo("selenium");
		
		Trainer Trainer2 = new Trainer("mukesh@gmail.com", "Hitesh", "Dev", 2);
		Trainer.showinfo("Web Development");
		Trainer Trainer3 = new Trainer("mukesh@gmail.com", "Mukesh", "DevOps", 3);
		Trainer.showinfo("DevOps");
	}

}

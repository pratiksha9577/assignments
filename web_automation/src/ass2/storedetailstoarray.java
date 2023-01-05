package ass2;

public class storedetailstoarray {

	public static void main(String[] args) {
		Trainer[] arr = new Trainer[3];
		arr[0] = new Trainer("mukesh@gmail.com", "Mukesh", "Testing", 1);
		arr[1] = new Trainer("mukesh@gmail.com", "Hitesh", "Dev", 2);

		arr[2] = new Trainer("mukesh@gmail.com", "Mukesh", "DevOps", 3);
		arr[0].showinfo("selenium");
		arr[1].showinfo("Dev");
		arr[2].showinfo("DevOps");
	
	}

}

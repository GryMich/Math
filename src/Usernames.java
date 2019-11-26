import java.util.Scanner;
public class Usernames {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		System.out.print("Insert your username:");
		String username = reader.nextLine();
		System.out.print("Insert your password:");
		String password = reader.nextLine();
		
		if (username.equals("GryMich") && password.equals("bober")) {
			System.out.println("You are now logged into the system!");
		} else if (username.equals("Sylwia") && password.equals("Cycek")){
			System.out.println("You are now logged into the system!");
		} else  {
				System.out.println("Wrong login or password");
		}
	}

}

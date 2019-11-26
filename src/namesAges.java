import java.util.Scanner;
public class namesAges {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
	
		
		System.out.print("Type your name: ");
		String userName = reader.nextLine();
		
		System.out.print("Type your age: ");
		int userAge = Integer.parseInt(reader.nextLine());
		
		System.out.print("Type your name: ");
		String userName1 = reader.nextLine();
		
		System.out.print("Type your age: ");
		int userAge1 = Integer.parseInt(reader.nextLine());
		
		int ageSum = userAge + userAge1;
		
		System.out.print(userName + " and " + userName1 +" are " + ageSum + " years old in total.");
			
	}
}

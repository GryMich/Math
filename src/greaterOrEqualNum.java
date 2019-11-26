import java.util.Scanner;
public class greaterOrEqualNum {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Type first number: ");
		int a = Integer.parseInt(reader.nextLine());
		
		System.out.print("Type second number: ");
		int b = Integer.parseInt(reader.nextLine());

		if (a > b) {
		System.out.print("Greater number: " + a);
		} else if (b > a) {
			System.out.print("Greater number: " + b);
		} else if (a == b) {
			System.out.print("Numbers are equal");
		}
		
		
	}

}

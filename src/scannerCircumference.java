import java.util.Scanner;
public class scannerCircumference {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("What radius circle have? ");
		int circleRadius = Integer.parseInt(reader.nextLine());
		
		double circumference = 2 * Math.PI * circleRadius;
		
		System.out.print(circumference);
	}

}

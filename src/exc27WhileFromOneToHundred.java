import java.util.Scanner;

public class exc27WhileFromOneToHundred {
	
// tutaj by³y zadania od 27 do 31
	
	public static void main(String[] args) {
	
	Scanner reader = new Scanner (System.in);
			
	int number = 0;
	int read1 = 0;
	int read2 = 0;
		
	System.out.println("First number: ");
	
	read1 = Integer.parseInt(reader.nextLine());
	
	System.out.println("Second number: ");
	
	read2 = Integer.parseInt(reader.nextLine());
	
	while (read1<read2) {
	
	number = read1++;
	
	System.out.println(number);
	
	}
	}
}
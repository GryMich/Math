import java.util.Scanner;

public class exc42hangmanGame {

	public static void main(String[] args) {
		
		 Scanner reader = new Scanner(System.in);
	        //Hangman hangman = new Hangman();

	        System.out.println("************");
	        System.out.println("* Hangman *");
	        System.out.println("************");
	        System.out.println("");
	        printMenu();
	        System.out.println("");

	        // ADD YOUR IMPLEMENTATION HERE

	    System.out.println("Thank you for playing!");

	}

    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
        
        
        
    }
}

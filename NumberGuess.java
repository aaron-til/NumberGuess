/*
 * Aaron Tilson
 */
package numberguess;

public class NumberGuess {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	/*
	 * Create a guessing game that allows three attempts 
	 * The guessing should take place between 1-10  
	 */
	
	// Define program variables
	int randNum, guessNum, attemptNum;

	// Generate a random number between 1 and 10
	randNum = new java.util.Random().nextInt(10) + 1;
	
	// Display a message
	System.out.println
	("I am thinking of a random number between 1 and 10");

	// Ask for a guess and check the input
	//For loop to limint the number of attempts to three using attemptNum for the counter
	for ( attemptNum=0; attemptNum<3; attemptNum++ ) {
	    //Ask user for to guess the number and take user input equal guessNum
	    System.out.print("Guess what it is?");
	    java.util.Scanner scan = new java.util.Scanner(System.in);
	    guessNum = scan.nextInt();
	    System.out.println("You guessed " + guessNum);
	    //Use if statement to check if the number was correct and break loop if so
	    if ( randNum == guessNum ) {
	        System.out.println("You guessed it!");
	        break;
	    }
	    System.out.println("Sorry, try again!");
	}
	}

    private static Object attemptNum(int i, int j) {
	// TODO Auto-generated method stub
	return null;

    }

}

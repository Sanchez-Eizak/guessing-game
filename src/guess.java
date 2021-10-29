import java.util.Scanner;
import java.util.Random;


public class guess {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		int userGuess = 0;
		int continuePlaying = 1;
		
		int randNum = r.nextInt(100)+1;
		
		while (continuePlaying != 0) {
			int guessCount = 0;
			System.out.println("Enter your guess 1-100: ");
			userGuess = s.nextInt();
			
			
			while (guessCount <= 10 && userGuess != randNum) {
				
				if (userGuess > randNum) {
					System.out.println("Too high");
					guessCount++;
					userGuess = s.nextInt();
				} else if (userGuess < randNum) {
					System.out.println("Too low");
					guessCount++;
					userGuess = s.nextInt();
				} else {
					System.out.println("You are correct!");
					break;
				}
				
			}
			
			if (guessCount > 10) {
				System.out.println("You ran out of guesses");
			} 
			
			if (userGuess == randNum) {
				System.out.println("You are correct");
			}
			
			System.out.println("To exit, type 0. To continue type 1");
			continuePlaying = s.nextInt();
		}
		
	}

}

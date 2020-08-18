import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
  public static final int NUMBER_CEILING = 10;
  public static int getRandom() {
    Random random = new Random();
    return random.nextInt(NUMBER_CEILING);
  }

  public static void main(String[] args) {
    int randomNum = getRandom();
    boolean continuePlaying = true;

    do {
      System.out.println("Enter a number between 0 and 9 foo!");
      int guesses = 0;
      Scanner scanner = new Scanner(System.in);
      String userInput = scanner.next();
      int userNum = Integer.parseInt(userInput);
      while (userNum < 0 || userNum > 9) {
        System.out.println("I am on to your schemes treacherous fool! Please enter a number between 0-9!");
        userNum = scanner.nextInt();
      }
      if (userNum == randomNum) {
        guesses++;
        System.out.println("You have won! It took " + guesses + " guesses.");
      } else {
        guesses++;
        System.out.println("Womp womp you lose, the number was " + randomNum + "!");
      }

      System.out.println("Would you like to get yelled at... I mean play another game?");
      String playAgainAnswer = scanner.next();

      while(!playAgainAnswer.equals("Y") && !playAgainAnswer.equals("N")) {
        System.out.println("LEARN TO TYPE!");
        playAgainAnswer = scanner.next();
      }
      continuePlaying = isContinuePlaying(continuePlaying, playAgainAnswer);
    } while (continuePlaying == true);
  }

  private static boolean isContinuePlaying(boolean continuePlaying, String playAgainAnswer) {
    if(playAgainAnswer.equals("N")){
      continuePlaying = false;
      System.out.println("Bye bye");
    } else if (playAgainAnswer.equals("Y")){
      System.out.println("Lets go again!");
    }
    return continuePlaying;
  }

}

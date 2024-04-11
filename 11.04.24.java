11.04.24

//the triangle teamwork with teacher with comments

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    //1. Get user input - x
    //2. Create a loop that runs x amount of times
    //3. Inside the loop, print _ symbol i times
    String result = "";
    for(int i = 1; i <= number; i++){
      result = result + "_";
      System.out.println(result);
    }

    scanner.close();
  }
}

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); //opening a channel for user input
    System.out.println("Please write your number: ");
    int number = scanner.nextInt(); // waiting for a number
    //1. Get user input - x
    //2. Create a loop that runs x amount of times
    //3. Inside the loop, print _ symbol i times
    String result = ""; //an empty string
                      // we compare is 1 is less or equal to 5
    for(int i = 1; i <= number; i++){
      result = result + "_";
      System.out.println(result);
    }

    scanner.close();
  }
}

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Opening a channel for user input
    System.out.println("Please write a number!");
    int number = scanner.nextInt(); // Waiting for a number

    String result = "";
    //Number = 5
    //result = "";
    for (int i = 1; i <= number; i++) { 
      result = result + "_";// result = "" + "_"; ---- result = "_" + "_";
      System.out.println(result); //Print out result -> "_" ---- print out result -> "__"
    }

    scanner.close();
  }
}

TRIANGLE THE OTHER WAY AROUND
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    /*
        _ // 4 spaces and one underscore
       __ // 3 spaces and two underscores
      ___ // 2 spaces and three underscores
     ____ // 1 space and four underscores
    _____ // 0 spaces and five underscores
    // X = 5
    // spaces = X - i;
    // underscores = i;
    */
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please write a number!");
    int number = scanner.nextInt();

    String space = " ";
    String underScore = "_";
    for (int i = 1; i <= number; i++) { 
      int spacesCount = number - i;
      String lineResult = space.repeat(spacesCount); // Just 4 spaces
      String underscoresResult = underScore.repeat(i); // Just 1 underscore
      lineResult = lineResult + underscoresResult; // Combining 4 spaces and 1 underscore
      System.out.println(lineResult);
    }

    scanner.close();
  }
}

GUESSING GAME WITH TEACHER
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int number = 58;

    // 1. We have a number

    // 2. We ask for the user to guess the number
    // 3. If the guessed number is bigger, then we say "Too big"
    // 4. If the guessed number is smaller, then we say "Too small"
    // 5. If the guessed number is correct, then we say "Correct"
    // 2-5 line a loop, we stop the loop, when the user is correct

    while (true) {
      System.out.println("Please guess a number!");
      int guess = scanner.nextInt(); // A number that user provides

      if (number == guess) {
        System.out.println("Good job, you guessed correctly");
        break;
      } 
      if (number < guess) {
        System.out.println("Sorry, the number is too big");
        continue;
      }
      System.out.println("Sorry, the number is too small");
    }
    System.out.println("Guessing game is over!");
    scanner.close();
  }
}

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int number = 58;

    // 1. We have a number

    // 2. We ask for the user to guess the number
    // 3. If the guessed number is bigger, then we say "Too big"
    // 4. If the guessed number is smaller, then we say "Too small"
    // 5. If the guessed number is correct, then we say "Correct"
    // 2-5 line a loop, we stop the loop, when the user is correct
    boolean userGuessedCorrectly = false;
    while (!userGuessedCorrectly) {
      System.out.println("Please guess a number!");
      int guess = scanner.nextInt(); // A number that user provides

      if (number == guess) {
        System.out.println("Good job, you guessed correctly");
        userGuessedCorrectly = true;
      } 
      else if (number < guess) {
        System.out.println("Sorry, the number is too big");
      }
      else {
        System.out.println("Sorry, the number is too small");
      }
    }
    System.out.println("Guessing game is over!");
    scanner.close();
  }
}
==================================================================

//Teamwork: Develop a program, that iterates through numbers from 0 till X amount of times (X is user provided)
//For numbers that are divided by 3: print out "Wo" .
//For numbers that are divided by 5: print out "Tech". 
//For numbers divided by 3 and 5: print out "WoTech".

 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // Ask the user for the number of iterations
    System.out.print("Enter the number of iterations: ");
    int iterations = scanner.nextInt();

    // Iterate through numbers from 0 to iterations
    for (int i = 0; i <= iterations; i++) {
        // Check if the number is divisible by both 3 and 5
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("WoTech");
        }
        // Check if the number is divisible by 3 only
        else if (i % 3 == 0) {
            System.out.println("Wo");
        }
        // Check if the number is divisible by 5 only
        else if (i % 5 == 0) {
            System.out.println("Tech");
        }
        // If the number is not divisible by 3 or 5
        else {
            System.out.println(i);
        }
    }

    scanner.close();
  }
}

SECOND TEAMWORK
//User provides a text, and then the program puts it in a square
//for example, if user provides "WoTech"
//==============
//|            |
//|   WoTech   |
//|            |
//==============
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  System.out.print("Enter the text: ");
  String text = scanner.nextLine();

  int width = text.length() + 4;

  System.out.println(" "+"=".repeat(width));
  System.out.println("|  " + text + "  |");
  System.out.println(" "+"=".repeat(width));

  scanner.close();
 }
}

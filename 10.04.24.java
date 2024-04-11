```java

loop 10.04.24


import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in); // opening a channel to the console where we can actually write stuff
    System.out.println("Hello!");
    int age; // number = 7
    System.out.println("What is your age?");
    age = scanner.nextInt(); // Waits for us to provide an integer
    System.out.println("The users age is: " + age);
    
    scanner.close(); // closes the channel so it doesnt use more rss
    //scanner.nextLine(); // Waits for us to provide a string until pressed enter 
  }
}


import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in); // opening a channel to the console where we can actually write stuff
    System.out.println("Write a number:");
    int a =  scanner.nextInt();
    System.out.println("Write another number:");
    int b  = scanner.nextInt(); // Waits for us to provide an integer
    System.out.println(" The sum of A and B is " + (a+b));
    
    scanner.close(); // closes the channel so it doesnt use more rss
    //scanner.nextLine(); // Waits for us to provide a string until pressed enter 
  }
}

public class Main {
  public static void main(String[] args) {

    System.out.println("Hello world!");

    int amountOfTimesToDuck = 10;
    //10 !=0
    //9 !=0
    //8 !+=0
    //... !=0 it stops when it gets to 1
    while (amountOfTimesToDuck != 0) { //if (true) works the same. 
      System.out.println(amountOfTimesToDuck);
      amountOfTimesToDuck = amountOfTimesToDuck - 1;
    }

  }
}

public class Main {
  public static void main(String[] args) {

    System.out.println("Hello world!");

    int i = 0;
    
    while (i < 10) { 
      System.out.println(i);
      i = i + 1; // the loop stops when it the value of i is 10
      
    }

  }
}

public class Main {
  public static void main(String[] args) {

    System.out.println("Hello world!");

    int i = 1; //first number is always 1
    boolean isEven = false; // first number is always odd
    //isEven is true for second number
    //counts from 0 to 10
    //provides whether or not the nmber is even or odd
    
    while (i <= 10) { 
      String evenOrOdd = "";
      if(isEven == true){
        evenOrOdd = "even";
      }else {
        evenOrOdd = "odd";
      }
      System.out.println(i + " " + evenOrOdd);
      i = i + 1;
      isEven = !isEven; 
      //isEven ==true-> isEven = false
      //iseven == false-> isEven = true
    }

    }
  }
}

public class Main {
  public static void main(String[] args) {

    System.out.println("Hello world!");

    int i = 1; //value is 1
    
    while (i <= 10) {  //checking if value is less than 10
      String result = ""; // result
      if(i % 2 == 0){ // odd or even
        result = "even";
      }else {
        result = "odd";
      }
                        // 1 odd
                      // 2 EVEN
      System.out.println(i + " " + result);    
      System.out.println(i + " is " + result); //printing        
      System.out.println(i + " " + result); // i = +1
      //i = 1+1
      // i = 2+1
      // i = 3+1
      i = i + 1;
    }

    }
  }

public class Main {
  public static void main(String[] args) {
    int i = 1;
    while (i <= 10) {
      // Start action

      System.out.println(i);
      // End action
      i = i + 1;
    }
  }
}

public class Main {
  public static void main(String[] args) {
    /*int i = 1;
    while (i <= 10) {
      // Start action

      System.out.println(i);
      // End action
      i = i + 1;
    }*/

    // The "for" loop is typically used when you know the exact number of iterations/loops or when you need to iterate over a range of values.
    //The "while" loop is typically used when you need to repeatedly execute a block of code until a specific condition becomes false or true.

    for (int i = 1; i <= 10; i = i + 1){
      System.out.println(i);
    }
  }
}
```

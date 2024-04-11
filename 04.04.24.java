```Java
public class Main {
  public static void main(String[] args) {

    double temp = 22.12;
    String message = "the weather is good outside";

    if (temp <= 5) {
       
      System.out.println(message);
    } else if (temp <= 15) {
      System.out.println(message);
    } else if (temp <= 30) {
      System.out.println(message);
    } else {
      System.out.println(message);
    }
    
    System.out.println("Let's go and check out what is in the fridge!");
    var isFridgeOpen = true;
    String result;

    if (isFridgeOpen) {
      var item1 = "Cheese ";
      var item2 = "Milk ";
      var item3 = "Eggs ";
      result = item1 + item2 + item3;
    } else {
      result = "Fridge is closed, open the fridge";
    }

    System.out.println(result);
    // ERROR System.out.println(item1);

public class Main {

  static int sharedValue = 200;
  
  public static void main(String[] args) {
 int mainValue = 14;
    System.out.println(mainValue);
    firstMethod();
    secondMethod();
  }
  
public static void firstMethod() {
  int firstValue = 50;
  System.out.println(firstValue);
   secondMethod();
}

  public static void secondMethod() {
   int secondValue = 120;
    
    
  }
}

//homework


    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask the user questions
            System.out.print("What is your name? ");
            String name = scanner.nextLine();

            System.out.print("How old are you? ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Where do you live? ");
            String city = scanner.nextLine();

            System.out.print("What is your favorite hobby? ");
            String hobby = scanner.nextLine();

            System.out.print("Name an animal: ");
            String animal = scanner.nextLine();

            System.out.print("What is your favorite color? ");
            String color = scanner.nextLine();

            // Generate the story based on user input
            String story = "Once upon a time, there was a person named " + name + ", who lived in " + city + ". ";
            story += name + " was " + age + " years old and loved to " + hobby + ". ";
            story += "One day, while " + hobby + ", " + name + " encountered a " + color + " " + animal + ". ";
            story += "The " + animal + " stared at " + name + " with its big eyes, and " + name + " felt a sense of wonder. ";
            story += name + " decided to adopt the " + animal + " and they became best friends. ";
            story += "They went on many adventures together, exploring the world and enjoying each other's company. ";
            story += "And they lived happily ever after.";

            // Print the story
            System.out.println("\nHere's your story:\n");
            System.out.println(story);

            scanner.close();
        }
    }
  
```

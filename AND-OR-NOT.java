public class Main {
    public static void main(String[] args) {

      {  //logical AND operator
        int a = 10, b = 20, c= 30, d=0;
      System.out.println("var1 = " + a);
      System.out.println("var2 = " + b);
      System.out.println("var3 = " + c); 
      
        
        // if a is smaller than b and b is not equal to c then the d is a+b+c. 
        
      if ((a < b) && (b != c))  { 
        d = a + b + c;

      System.out.println("the sum is: " + d);
      }
        else
       System.out.println("false conditions");
        System.out.println();
        
        }
      // logical OR operator
      // atleast one of the conditions has to be true
      { 
        int a = 10, b = 1, c= 10, d=30;
        System.out.println("var1 = " + a);
        System.out.println("var2 = " + b);
        System.out.println("var3 = " + c);
        System.out.println("var4 = " + d);
      

        if (a > b || c < d)
        
          System.out.println( "One or both + conditions are true");
          
       else 
        System.out.println("both the + conditions are false");
        System.out.println();
        
        }
      //logical NOT operator
        int a = 10, b = 1;
      System.out.println("var1 = " + a);
      System.out.println("var2 = " + b);

      System.out.println("the result is:" + !(a < b ));
      System.out.println("the result is:" + !(a > b));
      
      
    }
  
}
public class Main {
  public static void main(String[] args) {
    String studentName = "Anna";
    int yearOfSchool = 12;
    double studentAge = 17;
    double grade = 7;
    boolean olympicsWinner = false;
    
    boolean isAgeEligible = studentAge >= 18;
    boolean isGradeEligible = grade >= 8;

    if (isAgeEligible && (isGradeEligible || olympicsWinner)) {
      System.out.println("You are accepted!");
    } else {
      System.out.println("You are not accepted. Reasons:");

      if (!isAgeEligible) {
        System.out.println("- You are not eligible due to age.");
      }
      if (!isGradeEligible && !olympicsWinner) {
        System.out.println("- You are not eligible due to insufficient grade.");
      }
      
      if (!olympicsWinner && isAgeEligible && isGradeEligible) {
        System.out.println("- You're not eligible due to not having sufficient grades nor having won an olympics."); //this code is not correct because olympic win alone cant determine alone if you will be accepted. it comes as a bonus if your grades arent as good as they should
      }
    }
  }
}

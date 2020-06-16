import java.util.Scanner;

public class ValidNumberExample {
  
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    
    System.out.println("Please enter an integer between 1 and 100");
    int number = myScanner.nextInt();
    if (number >= 1 && number <=100) {
      System.out.println("Valid");
    }else{
      System.out.print("Invalid! Please re-enter value");
      number = myScanner.nextInt();
    }
  }
}

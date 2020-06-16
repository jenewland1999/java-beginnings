import java.util.Scanner;

public class ValidationExample {
  
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    
    System.out.println("Enter a username (5 to 10 characters)");
    
    String name = myScanner.next();
    while (name.length() < 5 || name.length() > 10) {
      System.out.println("That name is invalid! It's too " + (name.length() < 5 ? "short" : "long"));
      System.out.println("Enter a valid username (5 to 10 characters)");
      
      name = myScanner.next();
    }
      System.out.println("Correct username");
  }
}

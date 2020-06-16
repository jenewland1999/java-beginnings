import java.util.Scanner;

public class PostponeExample {
  
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    
    //the amount of hours left to shutdown
    int timeleft = 0;
    do {
      System.out.println("There are " + timeleft + " hours left until shutdown");
      
      int postpone = 0;
      do {
        System.out.println("How many hours would you like to postpone shutdown for?");
        postpone = myScanner.nextInt();
      }while (postpone <0);
      
      timeleft += postpone;
      
      //One hour is passing by
      timeleft--;
    }while (timeleft > 0);
    System.out.println("Restarting PC now..");
  }
}

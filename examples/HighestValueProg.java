import java.util.Scanner;

public class HighestValueProg {
  
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    
    System.out.println("Enter 3 seperate integers");
    int x = myScanner.nextInt();
    int y = myScanner.nextInt();
    int z = myScanner.nextInt();
    
    if (x > y && x > z) {
      System.out.println("X is the greatest number");
    }else if (y > x && y > z){
      System.out.println("Y is the greatest number");
    }else if (z > x && z > y) {
      System.out.println("Z is the greatest number");
    }else{
      //There are multiple numbers that have an equal value
      System.out.println("There is no greatest value :(");
    }
  }
}

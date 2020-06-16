import java.util.Scanner;
public class CalcProg {
  
  public static void main(String[] args) {
    System.out.println("Enter two intergers");
    /*Multi-Line comment
     * here
     * here
     * and
     * here
     */
    Scanner CalculatorMan = new Scanner(System.in);
    
    int numberOne = CalculatorMan.nextInt();
    int numberTwo = CalculatorMan.nextInt();
    int sum = numberOne + numberTwo;
    
    System.out.println("The Sum is... " + sum);
    //Using comments to explain bellow code is a good habbit to have
  }
}

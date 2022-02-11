import java.util.Scanner;

public class Objective9Lab5 {
  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
    double num1, num2;
    boolean keepGoing = true;
    int choice;
    double answer = 0.0;
     System.out.println("Please enter a number");
     num1 = kb.nextDouble();
     System.out.println("Please enter another number");
     num2 = kb.nextDouble();




  while (keepGoing) {

         System.out.print("Which would you like to do? ");
         choice = kb.nextInt();

         switch (choice) {
           case 1:
           double sum = num1 + num2;
           System.out.println(sum);

  }

         kb.close();
 }
}








}

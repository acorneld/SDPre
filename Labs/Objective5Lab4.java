public class Objective5Lab4 {
  public static void main(String[] args) {
  java.util.Scanner scanner = new java.util.Scanner(System.in);

  System.out.println("Please enter a number.");
  int num1 = scanner.nextInt();

  if(num1 % 2 == 0){
    System.out.println(num1 + " the numer is even");

  }
  if(num1 % 2 == 1) {
    System.out.println(num1 + " the number is odd");
}
    scanner.close();



  }
}

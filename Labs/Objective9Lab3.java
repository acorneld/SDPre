public class Objective9Lab3 {
  public static void main(String[] args) {
  java.util.Scanner scanner = new java.util.Scanner(System.in);

    while(true){
     printMenu();

 }




}

public static void printMenu() {
  System.out.println("_____Menu_____");
  System.out.println("1: Say Hello");
  System.out.println("2: List my favorite foods");
  System.out.println("3: Exit");
  System.out.println();
  java.util.Scanner scanner = new java.util.Scanner(System.in);


  int selection;
  selection = scanner.nextInt();


  if(selection == 1){
    System.out.println("Hello World");
}
  else if(selection == 2){
    System.out.println("Thai, Steak, Shakes");
}
  else if(selection == 3){
    System.out.println("Goodbye!");

  }

 }


}

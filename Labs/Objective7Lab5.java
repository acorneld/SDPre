public class Objective7Lab5 {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);


    while(true) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My Favorite Foods");
      System.out.println("3: Exit");
      System.out.println();

      int selection;
      selection = scanner.nextInt();

      if(selection == 1) {
        System.out.println("Hello World");
      }
      else if(selection == 2){
        System.out.println("Pad Thai, Steak, Taters");
      }
      else if(selection == 3){
        System.out.println("Goodbye");
        }


    }
  }
}

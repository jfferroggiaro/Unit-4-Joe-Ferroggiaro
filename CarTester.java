import java.util.Scanner;

public class CarTester{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to Car Simulator!");
    System.out.println("What make is your car?");
    String make = scan.nextLn();
    System.out.println("What model is your car?");
    String model = scan.nextLn();
    System.out.println("What is the MPG? (one decimal)");
    double mpg = scan.nextDouble();
    System.out.println("What is the tank size? (one decimal)");
    double tank = scan.nextDouble();
    System.out.println("How many miles? (no decimals)");
    int miles = scan.nextInt();

    Car myCar = new Car(make, model, mpg, tank, miles);
    System.out.println("Your car is a " + "\n" + myCar);

    System.out.println("What would you like to do? (enter number)");
    System.out.println("1. Drive\n2. Refuel\n3. Check Status\n4. Stop");
    int choice = scan.nextInt();
    if(choice == 1){
      System.out.println("How far would you like to drive?");
        int distChoice = scan.nextInt();
        myCar.drive(distChoice);
    }

  }
}

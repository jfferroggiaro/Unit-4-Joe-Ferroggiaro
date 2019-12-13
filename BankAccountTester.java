import java.util.Scanner;

public class BankAccountTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Joe Bank!\nPlease Sign In");
        System.out.println("Enter your name:");
        String newName = scan.nextLine();
        System.out.println("Enter your account PIN");
        String newPin = scan.nextLine();
        BankAccount acc1 = new BankAccount(newName, newPin, 100.0);

        System.out.println("Welcome " + acc1.getName() + "\nAccount Statement:\n" + acc1);
        System.out.println("Enter an amount to change");



    }
}

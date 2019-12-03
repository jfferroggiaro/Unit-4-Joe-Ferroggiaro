import java.util.Scanner;

public class DieTester {
    public static void main(String[] args) {
        System.out.println("How many times to roll?");
        Scanner scan = new Scanner(System.in);
        int numRolls = scan.nextInt();

        for(int i = 0; i < numRolls; i++){
            Die d1 = new Die();
            System.out.println(d1);
        }
    }
}

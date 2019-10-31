import java.util.Scanner;

public class CoinTester{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int headsCount = 0;
    System.out.println("How many flips? (Enter an integer)");
    final int NUM_FLIPS = scan.nextInt();
    System.out.println("Flipping " + NUM_FLIPS + " times...");
    for(int i = 0; i < NUM_FLIPS; i++){
      Coin myCoin = new Coin();
      System.out.println(myCoin);
      if(myCoin.isHeads())
        headsCount++;
    }
    System.out.println("Total Heads: " + headsCount);
    System.out.println("Total Tails: " + (NUM_FLIPS - headsCount));
  }
}

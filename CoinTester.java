public class CoinTester{
  public static void main(String[] args){
    int headsCount = 0;
    int tailsCount = 0;
    for(int i = 0; i < 20; i++){
      Coin myCoin = new Coin();
      System.out.println(myCoin);
      if(myCoin.isHeads()){
        headsCount++;
      } else {
        tailsCount++;
      }
    }
    System.out.println("Total Heads: " + headsCount);
    System.out.println("Total Tails: " + tailsCount);
  }
}

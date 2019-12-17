public class DiceGame {
    public static void main(String[] args) {
        DicePlayer p1 = new DicePlayer(0, 1);
        CompPlayer pComp = new CompPlayer(0);

        while(p1.getScore() < 100 && pComp.getScore() < 100) {
            p1.turn();
            if(p1.getScore() >= 100)
                break;
            pComp.compTurn();
            if(p1.getScore() >= 100)
                break;
        }

        if(p1.getScore() >= 100){
            System.out.println("You Win!");
        } else {
            System.out.println("You Lose!");
        }
    }
}

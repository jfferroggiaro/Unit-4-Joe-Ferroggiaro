public class DiceGame {
    public static void main(String[] args) {
        DicePlayer p1 = new DicePlayer(0, 1);
        DicePlayer pComp = new DicePlayer(0, 2);
        p1.turn();
        pComp.compTurn();
    }
}

import java.util.Scanner;

public class DicePlayer {

    private int score;
    private int tempScore;
    private int playerNum;
    Scanner scan = new Scanner(System.in);
    private String ans;


    public DicePlayer(int newScore, int newPlayerNum){
        score = newScore;
        playerNum = newPlayerNum;
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void turn(){
        Die die1 = new Die();
        Die die2 = new Die();

        ans = "y";
        while(ans.equals("y")) {
            die1.roll();
            die2.roll();
            System.out.println(die1);
            System.out.println(die2);
            if(die1.getSide() == 1 && die2.getSide() == 1){
                score = 0;
                System.out.println("Oh no! Snake eyes! You lose ALL your points!");
                System.out.println("Points this round: " + tempScore + "  Total points: " + score);
                ans = "n";
            } else if(die1.getSide() == 1 || die2.getSide() == 1){
                tempScore = 0;
                System.out.println("Rolled a one! You lose your points this round!");
                System.out.println("Points this round: " + tempScore + "  Total points: " + score);
                ans = "n";
            } else {
                tempScore += (die1.getSide() + die2.getSide());
                System.out.println("Points this round: " + tempScore + "  Total points: " + score);
                System.out.println("Would you like to keep rolling? (y for yes, else for no)");
                ans = scan.next();
            }
        }
        System.out.println("You banked " + tempScore + " points this turn!");
        score += tempScore;
        tempScore = 0;
        System.out.println("Total points: " + score);
    }

}

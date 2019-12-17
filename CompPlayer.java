public class CompPlayer {

    private int score;
    private int tempScore;
    private String compAns;
    private int playerNum;

    public CompPlayer(int newScore, int newPlayerNum){
        score = newScore;
        playerNum = newPlayerNum;
    }

    public void compTurn(){
        Die compD1 = new Die();
        Die compD2 = new Die();

        compAns = "y";
        while(compAns.equals("y")) {
            compD1.roll();
            compD2.roll();
            System.out.println("Opponent " + compD1);
            System.out.println("Opponent " + compD2);
            if(compD1.getSide() == 1 && compD2.getSide() == 1){
                score = 0;
                System.out.println("Opponent rolled snake eyes! They lose ALL their points!");
                //System.out.println("Opponent points this round: " + tempScore + "  Opponent total points: " + score);
                compAns = "n";
            } else if(compD1.getSide() == 1 || compD2.getSide() == 1){
                tempScore = 0;
                System.out.println("Opponent rolled a one! They lose their points this round!");
                //System.out.println("Opponent points this round: " + tempScore + "  Opponent total points: " + score);
                compAns = "n";
            } else {
                tempScore += (compD1.getSide() + compD2.getSide());
                //System.out.println("Opponent points this round: " + tempScore + "  Opponent total points: " + score);
                if(tempScore >= 20) {
                    compAns = "n";
                    System.out.println( "Opponent banks points!");
                } else {
                    compAns = "y";
                    System.out.println("Opponent rolls again!");
                }
            }
        }
        System.out.println("Opponent banked " + tempScore + " points this turn!");
        score += tempScore;
        tempScore = 0;
        System.out.println("Opponent total points: " + score);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

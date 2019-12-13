public class Die {
    private int side;

    public Die(){
        side = 1;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public void roll() {
        side = (int) (Math.random()*6) + 1;
    }

    @Override
    public String toString() {
        String result;
        result = "Rolled a " + side;
        return result;
    }
}


public class Coin{
  private int face;

  private final int HEADS = 0;
  private final int TAILS = 1;

  public Coin(){
    flip();
  }

  public int getFace(){
    return face;
  }

  public void setFace(int newFace){
    face = newFace;
  }

  public void flip(){
    face = (int) (Math.random() * 2);
  }

  public boolean isHeads(){
    return(face == HEADS);
  }

  public String toString(){
    String faceName;
    if(face == HEADS){
      faceName = "Heads";
    } else {
      faceName = "Tails";
    }
    return faceName;
  }
}

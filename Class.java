public class Game
{
  //fields (do not add new fields)
  private Domino computer;
  private Domino human;
  private Domino boneyard;
  private Domino firstInPlay;
  private Domino lastInPlay;
////////////////////////////////////////////////////////////
  public Game(int max)
  {
  }

  public void reset(int numToDeal)
  {
  }

  public boolean playFirst(int num1, int num2)
  {
    throw new UnsupportedOperationException("remove this line");
  }

  public boolean playLast(int num1, int num2)
  {
    throw new UnsupportedOperationException("remove this line");
  }

  public boolean computerTurn()
  {
    throw new UnsupportedOperationException("remove this line");
  }

  public boolean isGameOver()
  {
    throw new UnsupportedOperationException("remove this line");
  }

  public int getHumanPoints()
  {
    throw new UnsupportedOperationException("remove this line");
  }

  public int getComputerPoints()
  {
    throw new UnsupportedOperationException("remove this line");
  }

  public Domino getComputer()
  {
    return computer;
  }

  public Domino getHuman()
  {
    return human;
  }

  public Domino getBoneyard()
  {
    return boneyard;
  }

  public Domino getFirstInPlay()
  {
    return firstInPlay;
  }

  public Domino getLastInPlay()
  {
    return lastInPlay;
  }
}

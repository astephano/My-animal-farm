import java.awt.Color;

public class Squirrel extends Turtle
{ 
  /**
   * Constructor that takes a model display and adds
   * a turtle in the middle of it
   * @param display the model display
   */
  public Squirrel(World wref)
  {
    super(wref);
   Color bodyColor = new Color(192, 192, 192); //requires import line at top to work (new color defined using RGB values)
    this.setBodyColor(bodyColor);
   Color shellColor = new Color(96, 96 , 96); //requires import line at top to work (new color defined using RGB values)
    this.setShellColor(shellColor);
  }
  
  /**
   * Constructor that takes the x and y position and the
   * model displayer
   * @param x the x pos
   * @param y the y pos
   * @param display the model display
   */
  public Squirrel (int x, int y, World wref)
  {
    super(x, y, wref);
  }
  
  public void animate(int x)
  {
    for(int i = 0; i < 20; i++)
    {
      this.forward(x);
    try
    {
      Thread.sleep(50);
    } catch(InterruptedException ex) {}
  }
  }

public void animateTurn(int x)
  {
    for(int i = 0; i < 20; i++)
    {
      this.turn(x);
    try
    {
      Thread.sleep(50);
    } catch(InterruptedException ex) {}
  }
  }
}


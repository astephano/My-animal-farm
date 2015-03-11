import java.awt.Color; //needed for color to work
public class Tiger extends Turtle
{ 
  /**
   * Constructor that takes a model display and adds
   * a turtle in the middle of it
   * @param display the model display
   */
  public Tiger(World wref)
  {
    super(wref);
    this. forward(65);
    this. turn(90);
    this. forward(65);
    this. turn(90);
    this. forward(65);
    this. turn(90);
    this. forward(65);
    this. turn(275);
    this. forward(45);
    this. turn(87);
    this. forward(78);
    this. turn(67);
    this. backward(98);
    this. turn(90);
    this. forward(98);
    this. turn(89);
    this. forward(56);
    this. backward(89);
    this. turn(45);
    this. backward(89);
    this. turn(270);
    this. forward(99);
    this. turn(49);
    this. forward(79);
    this. turn(89);
    this. backward(67);
    this. turn(34);
    this. backward(102);
    this. turn(90);
    this. forward(79);
    this. backward(89);
    this. turn(90);
    this. forward(89);
    this. backward(65);
    this. turn(270);
    this. forward(102);
    this. turn(56);
    this. forward(89);
    this. backward(99);
    this. turn(180);
    this. forward(109);
    this. turn(45);
    this. forward(109);
    this. turn(5);
    this. forward(100);
    this. turn(90);
    this. forward(78);
    this. turn(90);
    this. backward(90);
    this. turn(10);
    this. forward(79);
    this. turn(89);
    this. backward(89);
    this. setWidth(100);
    this. setHeight(100);
    this.setName("Tigger");
    Color shellColor = new Color(3, 180, 200);
    this.setShellColor(shellColor);
    Color bodyColor = new Color(0, 0, 0);
    this.setBodyColor(bodyColor);
  }
  
  /**
   * Constructor that takes the x and y position and the
   * model displayer
   * @param x the x pos
   * @param y the y pos
   * @param display the model display
   */
  public Tiger(int x, int y, World wref)
  {
    super(x, y, wref);
    Color shellColor = new Color(3, 180, 200);
    this.setShellColor(shellColor);
    Color bodyColor = new Color(0, 0, 0);
    this.setBodyColor(bodyColor);
  }
}
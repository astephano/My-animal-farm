public class Farm
{
  public static void main(String[] a)
  {
  World wref = new World();
  Tiger tigger = new Tiger(wref);
  Squirrel bob = new Squirrel(wref);
  bob.getDistance(100,100);
  bob.turnToFace(bob);
  bob.forward(100);
  bob.turnToFace(10,10);
  bob.backward(20); 
  bob.turnToFace(125,10);
  bob.animateTurn(100);
  bob.penUp();
  bob.getDistance(20,10);
  bob.getDistance(100,100);
  bob.turnToFace(bob);
  bob.animate(100);
  bob.turnToFace(10,10);
  bob.backward(20); 
  bob.turnToFace(125,10);
  bob.animate(100);
  bob.penUp();
  bob.getDistance(20,10);
  bob.animate(10);
  bob.backward(50);
  bob.animateTurn(25);
  bob.turnToFace(bob);
  bob.forward(20);
  bob.turnToFace(125,10);

  }
}
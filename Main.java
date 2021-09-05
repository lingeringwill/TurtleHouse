import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args)
  {
      World world = new World(300,300);
      Turtle yertle = new Turtle(world);
      
      for (int i =0; i < 4; i++)
      {
          yertle.turnRight();
          yertle.forward(100);
          
      }
      yertle.penUp();
          yertle.moveTo(210,250);
      yertle.penDown();
      yertle.setColor(Color.green);
      for (double i = 0; i < 4; i++)
      {
          if (i%2 == 0 ){
              yertle.forward(50);
              yertle.turnLeft();
          } 
         
          else {
              yertle.forward(20);
              yertle.turnLeft();
          }
      }
      yertle.penUp();
      yertle.moveTo(220,170);
      yertle.penDown();
      yertle.setColor(Color.red);
      for (int i = 0; i < 4; i++)
      {
           yertle.turnRight();
          yertle.forward(19);
      }
      yertle.penUp();
      yertle.moveTo(160,190);
      yertle.penDown();
      yertle.setColor(Color.red);
      for (int i = 0; i < 4; i++)
      {
           yertle.forward(19);
           yertle.turnRight();
        
      }
      world.show(true);
  }
}
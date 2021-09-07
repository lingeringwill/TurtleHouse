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

      // draw roof
      yertle.penUp();
      yertle.moveTo(150, 150);
      yertle.penDown();     
      yertle.setColor(Color.green);
    
      for (int i = 0; i < 2; i++)
      {
        yertle.turn(45);
        yertle.forward(72);
        yertle.turn(45);
      }

      // move to chimney location
      yertle.penUp();
      yertle.moveTo(215, 116);
      yertle.penDown();
      yertle.setColor(Color.red);

      // realign yertle so he's facing up
      yertle.turn(180);

      // draw chimney
      yertle.forward(27);
      yertle.turn(90);
      yertle.forward(15);
      yertle.turn(90);
      yertle.forward(40);

      // move to tree trunk location
      yertle.penUp();
      yertle.moveTo(100, 300);
      yertle.penDown();

      // set color to brown
      yertle.setColor(Color.getHSBColor(30, 60, 41));

      // face yertle up
      yertle.turn(180);

      yertle.setPenWidth(10);
      yertle.forward(100);

      yertle.setColor(Color.green);
      yertle.setPenWidth(50);
      yertle.forward(10);
        
      world.show(true);
  }
}
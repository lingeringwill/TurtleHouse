import java.util.*;
import java.awt.*;

class Main {
  public static void main(String[] args) {
   World world = new World(300, 400);
   Turtle yertle = new Turtle(habitat);
  
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
      
      world.show(true);

   // for (int i = 0; i < 4; i++) {
   //   yertle.forward();
   //   yertle.turnRight();
   // } 

   habitat.show(true);
   
  }
}
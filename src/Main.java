package src;

import java.awt.*;

public class Main {
  public static void main(String[] args) {
    World world = new World(400, 400);
    Turtle yertle = new Turtle(world);
    // Add your own code in here
    yertle.setColor(Color.blue);

    yertle.forward();
    yertle.turnRight();

    yertle.setColor(Color.red);
    yertle.forward();
    yertle.turnRight();

    yertle.setColor(Color.green);
    yertle.forward();
    yertle.setColor(Color.pink);
    yertle.forward();
    yertle.turnRight();

    yertle.setColor(Color.orange);
    yertle.forward();
    yertle.setColor(Color.black);
    yertle.forward();
    yertle.turnRight();

    yertle.setColor(Color.pink);
    yertle.forward();
    yertle.setColor(Color.cyan);
    yertle.forward();
    yertle.turnRight();

    yertle.setColor(Color.magenta);
    yertle.forward();
    yertle.turnRight();

    yertle.forward();

    yertle.setColor(Color.blue);

    world.setVisible(true);
  }
}

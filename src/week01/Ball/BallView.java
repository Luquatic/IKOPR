package week01.Ball;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class BallView extends Pane 
{
  private Circle circle;
  private Ball ball;

  public BallView(Ball ball) 
  {
    this.ball = ball;
    createCircle(); 
    getChildren().add(circle); // what is the meaning of getChildren()? 
  }
  
  private void createCircle()
  {
     circle = // initialize with ball-properties
     
     //Set fill-color of the circle to green
     ..................................
     
     //Set border-color of the circle to black 
     ..................................   
  }
    
  // adjust the centerpoint of the circle, 
  // use properties of the ball    
  public void adjust()
  {
     ...............................
     ...............................
  }

}

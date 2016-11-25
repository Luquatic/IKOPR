package week01.Ball;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.beans.property.DoubleProperty;

public class BallController  
{
  private Ball ball;
  private BallView view;
  private Timeline animation;
  
  private double dx = 1, dy = 1;
  
    
  public BallController (Ball ball, BallView view)
  {
     ..........
          
     // Creata a Timeline-object to start an animation (within the JavaFX-thread) 
     // call the moveBall()-method every (say) 50/100 msecs
     animation = ..........
     
     // Start the animation 
     .................  
     
     // Pause the animatie when pressing the mouse on the view
     .................. 
     
     // Resume the animation when releasing the mouse  
     ..................    
  }
  
  // A binding property value for the 'rate' of  the  animation
  // see class SouthPane ... what is it for?
  public DoubleProperty rateProperty()
  {
    return (animation.rateProperty());
  }
  
  
  private void moveBall() {
    // Check view-bounderies .. when colliding, change horizontal direction
    if (...............................................................) {
        dx *= -1; 
    }
    
    // Check view-bounderies .. when colliding, change vertical direction   
    if (...............................................................) {
        dy *= -1; 
    }

    // adapt ball-properties (which one?) 
    ............................
    ............................
    
    // adapt the view (why?) 
    ............................
  }    
}

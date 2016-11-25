package week01.Ball;

import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.control.Slider;


public class SouthPane extends HBox
{
    public SouthPane(BallController controller)
    {
        setAlignment(Pos.CENTER);
        Slider slSpeed = //a slider-object
        
        // maximum (slider) equals 20
        ......................
        
        // minimum (slider) equals 5
        ......................
        
        // show min and max  
        .......................
        
        slSpeed.setShowTickMarks(true);  // ? 
        
        // What does this do?  see BallController
        controller.rateProperty().bind(slSpeed.valueProperty());
        
        // add additional controls (if necessary to the Hbox) 
        getChildren().add(slSpeed);       
    }
    
}


import ..........

public class VierkantController extends MouseAdapter 
                             implements MouseMotionListener, MouseWheelListener
{
  private Vierkant     vk;
  private VierkantView view;

  private boolean   dragged    = false;
  private int       dragAnkerX = 0;
  private int       dragAnkerY = 0;

  // constructors
  public VierkantController( Vierkant vk, VierkantView view )
  {
    ................
    ................
    // Voeg de verschillende listeners toe aan de view
    ................
  }

  public void mouseEntered( MouseEvent event )
  {
    // maak het vierkant rood
    // teken de view opnieuw
  }

  public void mouseExited( MouseEvent event )
  {
    // maak het vierkant weer blauw
    // teken de view opnieuw
  }


  public void mouseReleased( MouseEvent event )
  {
    ..................... // zie ook mouseDragged
  }

  public void mouseWheelMoved( MouseWheelEvent event ) // ga na!
  {
    int ticks = event.getWheelRotation();
    // pas de breedte en de hoogte van de view
    // aan mbv 'ticks' 
    // gebruik view.getWidth() en view.getHeight() en view.setSize(int, int) 
  }

  public void mouseDragged( MouseEvent event ) // ga na!
  {
    if (!dragged)
    {
      dragged = true;
      dragAnkerX = event.getX();
      dragAnkerY = event.getY();
    }
    int x = view.getX() + event.getX() - dragAnkerX;
    int y = view.getY() + event.getY() - dragAnkerY;
    view.setLocation( x, y );
  }
  public void mouseMoved( MouseEvent event ) {} // waarom moet deze methode hier staan?
}                                               // hij doet toch niets?

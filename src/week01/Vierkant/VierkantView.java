import ..................

public class VierkantView extends JPanel
{
  private Vierkant vk;
  
  
  // constructor
  public VierkantView( Vierkant vk, int x, int y )
  {
    .................
    // maak de achtergrond van de view oranje
    setBounds( x, y, vk.getZijde() + 10, vk.getZijde() + 10);
    // wat doet dit statement?
  }

  public void paintComponent( Graphics g )
  {
    super.paintComponent( g );
    g.setColor (vk.getKleur());
    g.fillRect(5, 5, vk.getZijde(), vk.getZijde()); 
    	// wat doet dit statement?
        // wat is de betekenis van de coordinaten '5' ?
  }

}
import ..............


public class VierkantenPaneel extends JPanel implements MouseListener
{

  private JLabel labelAantalVierkanten; // In dit label wordt het aantal vierkanten getoond.

  public VierkantenPaneel()
  {
     // geef het panel een null-lay-out; waarom?
     // voeg een MouseListener toe aan het panel
  }
  
  
  // alle methods van  MouseListener; waarom alle?
  public void mousePressed (MouseEvent me)
  {
    Vierkant model = // maak een nieuw vierkant met kleur blauw en zijde 70
    VierkantView view = // maak een view van dit model en geef door waar 
                        // het geplaatst moet worden op het panel
    VierkantController vkc = //maak een VierkantController object van het 
                             //model en zijn view
    labelAantalVierkanten.setText("Het aantal vierkanten is " + ...........);                       
    this.add (view);  
  }
  
  public void mouseClicked (MouseEvent me)
  {
  }
  
  
  public void mouseReleased (MouseEvent me)
  {
  }
  
  public void mouseEntered (MouseEvent me)
  {
  }
  
  public void mouseExited (MouseEvent me)
  {
  }
  
}

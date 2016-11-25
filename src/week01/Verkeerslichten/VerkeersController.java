package week01.Verkeerslichten;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class VerkeersController extends JPanel implements ActionListener
{
  private VerkeersLichtModel model;
  private VerkeersLichtView  view;
  private JButton roodKnop, oranjeKnop, groenKnop;


  public VerkeersController ( VerkeersLichtModel model, VerkeersLichtView view )
  {
    // wat doe je met model en view?
	  this.view = view;
	  this.model = model;
    // maak de achtergrondkleur van dit paneel donker-grijs
	  setBackground (Color.DARK_GRAY);
    // maak de knoppen
	  roodKnop = new JButton ("rood");
	  oranjeKnop = new JButton ("oranje");
	  groenKnop = new JButton ("groen");
    // voeg een ActionListener toe aan de knoppen
	  roodKnop.addActionListener(this);
	  oranjeKnop.addActionListener(this);
	  groenKnop.addActionListener(this);
    // maak de knoppen zichtbaar op het paneel
	  add(roodKnop);
	  add(oranjeKnop);
	  add(groenKnop);
  }


  public void actionPerformed( ActionEvent e )
  {
     if (e.getSource() == roodKnop)
       // zet het rode licht aan
    	 model.setRood();
     // idem met de andere knoppen
     else
    	 if (e.getSource() == oranjeKnop)
    		 model.setOranje();
    	 else
    		 if (e.getSource() == groenKnop)
    			 model.setGroen();
     // tenslotte .. teken de view opnieuw. Waarom?
     view.repaint();
  }

}
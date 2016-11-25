package week01.Verkeerslichten;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class HoofdPaneel extends JPanel
{
  private VerkeersLichtModel model;
  private VerkeersLichtView  view;
  private VerkeersController controller;

  public HoofdPaneel()
  {
    // geef dit paneel een borderlayout
	  setLayout(new BorderLayout());
    // model wordt een nieuw VerkeersLichtModel
	  model = new VerkeersLichtModel(true, true, true);
    // view wordt een nieuw view-object van het model;
	  view = new VerkeersLichtView(model);
    // controller wordt een nieuw control van het
    // model en de view
	  controller = new VerkeersController(model, view);
    // voeg de view toe aan het centrum van het paneel
	  add(view, BorderLayout.CENTER);
    // voeg de controller toe aan het zuiden van het paneel
	  add(controller, BorderLayout.SOUTH);
  }

}
package week01.Verkeerslichten;

public class VerkeersLichtModel
{
  private boolean rood, oranje, groen;

  public VerkeersLichtModel ( boolean rood, boolean oranje, boolean groen )
  {
    this.rood = rood;
    this.oranje = oranje;
    this.groen = groen;
  }

  // settters
  public void setRood()
  {
    reset();
    rood = true;
  }

  public void setOranje()
  {
    reset();
    oranje = true;
  }

  public void setGroen()
  {
	reset();
    groen = true;

  }

  public void reset() // alle lichten uit
  {
    rood = false;
    oranje = false;
    groen = false;
  }

  // getters
  public boolean getRood()
  {
    return (rood);
  }

  public boolean getOranje()
  {
    return (oranje);
  }

  public boolean getGroen()
  {
    return (groen);
  }


}
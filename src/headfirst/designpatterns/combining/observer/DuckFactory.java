package headfirst.designpatterns.combining.observer;
/**
 *@author: Dominik Wojdyla
 *@04.06.2016
 * 
 * Die Klasse erbt von einer abstrakten Klasse.
 *
 */
public class DuckFactory extends AbstractDuckFactory {
  /**
   * Bei jeder Methode wird eine neue Instanz einer Klasse erzeugt.
   * 1.Methode Instant von MallardDuck
   * 2.Methode Instanz von RedheadDuck
   * 3.Methode Instanz von DuckCall
   * 4.Methode RubberDuck
   * 
   * */
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}
  
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}
  
	public Quackable createDuckCall() {
		return new DuckCall();
	}
   
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}
}

package headfirst.designpatterns.combining.observer;
/**
 * 
 * @author Dominik Wojdyla
 * @04.06.2016
 * 
 * Die Klasse erbt von der Klasse AbstractDuckFactory
 * Sie beinhaltet 4 Methoden
*/
public class CountingDuckFactory extends AbstractDuckFactory {
  
  /*
  *Jede der 4 Methoden ruft erst die Quackcounter Klasse auf und asnchließend wird eine neuenstanz erstellt.
  *1.Methode neue Mallarduck 
  *2.Methode neue RedheadDuck
  *3.Methode neue Duckcall
  *4.Methode neue RubberDuck
  */
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}
  
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}
  
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}
   
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}
}

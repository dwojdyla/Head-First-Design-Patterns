package headfirst.designpatterns.combining.observer;
/**
 * @author: Dominik Wojdyla
 * @04.06.2016
 * 
 * Klasse implementiert Interface Quackable, somit hat die Klasse
 * alle Methoden des Interfaces
 * */
public class QuackCounter implements Quackable {
	Quackable duck;
	static int numberOfQuacks;
  
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
  /**
   * Hier wird die Methode quack() von duck aufgerufen 
   * anschließend wird die oben definierte numberOfQuacks erhöht.
   * */
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
 /**
  *getter Methode wo die int numberOfQuacks zurückgegeben wird. 
  * */ 
	public static int getQuacks() {
		return numberOfQuacks;
	}
 /**
  * Aufruf einer Methode von duck
  * */
	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
	}
 /**
  * Aufruf einer notufy Methode con duck 
  * */
	public void notifyObservers() {
		duck.notifyObservers();
	}
   /**
    * toString Methode
    * */
	public String toString() {
		return duck.toString();
	}
}

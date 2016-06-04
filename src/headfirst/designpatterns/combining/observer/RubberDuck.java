package headfirst.designpatterns.combining.observer;
/**
 * @author: Dominik Wojdyla
 * @04.06.2016
 * 
 * Die Klasse implementiert Quackable 
 * 
 * */
public class RubberDuck implements Quackable {
	Observable observable;
/**
 * Neue Instanz wird erstellt
 * */
	public RubberDuck() {
		observable = new Observable(this);
	}
 /**
  * Methode hat eine Ausgabe "Squeak"
  * Eine Methode wird ausgeführt 
  * */
	public void quack() {
		System.out.println("Squeak");
		notifyObservers();
	}
/**
 * Eine Methode von observable wird ausgeführt
 * */
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}
/**
 * Eine Methode von observable wird ausgeführt
 * */
	public void notifyObservers() {
		observable.notifyObservers();
	}
  /**
   * toString Methode
   * */
	public String toString() {
		return "Rubber Duck";
	}
}

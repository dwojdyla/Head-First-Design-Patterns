package headfirst.designpatterns.combining.observer;

/**
 * @author: Dominik Wojdyla
 * @04.06.2016
 * 
 * Die Klasse implementiert das Interface Quackable
 * Hat somit alle Methoden des Interfaces
 * 
 * */
public class MallardDuck implements Quackable {
	Observable observable;
/**
 * neue Instanz von observable wird erstellt
 **/ 
	public MallardDuck() {
		observable = new Observable(this);
	}
 /**
  * Ausgabe "Quack"
  * notifyObservers Methode wird aufgerufen
  * */ 
	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}
 /**
  * Methode von observable wird aufgerufen
  * */
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}
 /**
  * methode von observable wird aufgerufen
  * */
	public void notifyObservers() {
		observable.notifyObservers();
	}
 /**
  * toString Methode
  * */
	public String toString() {
		return "Mallard Duck";
	}
}

package headfirst.designpatterns.combining.observer;
/**
 * @author: Dominik Wojdyla
 * @04.06.2016
 * 
 * 
 * Klasse implementiert Quackable
 * 
 * */
public class RedheadDuck implements Quackable {
	Observable observable;
/**
 * Neue Instanz wird gemacht
 * */
	public RedheadDuck() {
		observable = new Observable(this);
	}
/**
 * Klasse hat eine Ausgabe "Quack"
 * Anschließend wird die Methode notifyObservers aufgerufen
 * */
	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}
/**
 * Hier wird eine Methode von observable aufgerufen
 * */
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}
/**
 * Hier wird eine Methode von observable aufgerufen
 * */
	public void notifyObservers() {
		observable.notifyObservers();
	}
/**
 * toString Methode
 * */
	public String toString() {
		return "Redhead Duck";
	}
}

package headfirst.designpatterns.combining.observer;

/**
 * @author Dominik Wojdyla
 * @04.06.2016
 * 
 * Die Klasse implementiert das Interface Quackable
 * 
 */
public class DuckCall implements Quackable {
	Observable observable;
/*
*Neue Instanz von Observable
*/
	public DuckCall() {
		observable = new Observable(this);
	}
 /*
 *Erstmals eine Ausgabe "Kwak".
 *dann Ausführung der Methode
 */
	public void quack() {
		System.out.println("Kwak");
		notifyObservers();
	}
 /*
 *Eine Methode von observable wird aufgerufen
 */
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}
/*
*Methode von Observable wird aufgerufen
*/
	public void notifyObservers() {
		observable.notifyObservers();
	}
/**
 *Ein String wird zurückgegeben 
 * 
 */
	public String toString() {
		return "Duck Call";
	}
}

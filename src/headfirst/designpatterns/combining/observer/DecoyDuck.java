package headfirst.designpatterns.combining.observer;
/**
 * 
 * @author Dominik Wojdyla
 * @04.06.2016
 * 
 * Die Klasse implementiert das Interface Quackable.
 * Es hat somit alle Methoden von Quackable. 
 * 
 * */
public class DecoyDuck implements Quackable {
	Observable observable;

/*Hier wird eine neue Instanz von observable erstellt.
*/
	public DecoyDuck() {
		observable = new Observable(this);
	}
 /*
 *Als erstes eine Ausgabe und anschließend wird die angegebene Methode aufgerufen 
 */
	public void quack() {
		System.out.println("<< Silence >>");
		notifyObservers();
	}
 /*
 *Es wird eine Methode von observable aufgerufen
 */
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}
/*
*Es wird eine Methode von observable aufgerufen 
*/
	public void notifyObservers() {
		observable.notifyObservers();
	}
 /*
 *Die Methode gibt einen String aus
 */
	public String toString() {
		return "Decoy Duck";
	}
}

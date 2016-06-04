package headfirst.designpatterns.combining.observer;
/**
 * @author: Dominik Wojdyla
 * @04.06.2016 
 * 
 * Die Klasse implementiert Interface Quackable
 * Adapter Pattern(Hüllenklasse)
 * 
 * */
public class GooseAdapter implements Quackable {
	Goose goose;
	Observable observable;
/**
 * Konstruktor
 * neue Instanz von observable wird erstellt 
 * */
	public GooseAdapter(Goose goose) {
		this.goose = goose;
		observable = new Observable(this);
	}
 /**
  * Methode von goose wird aufgerufen
  * anschließend wird notifyObservers aufgerufen
  * */
	public void quack() {
		goose.honk();
		notifyObservers();
	}
/**
 * Methode von Observable wird aufgerufen
 * */
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}
/**
 * Methode von observable wird aufgerufen
 * */
	public void notifyObservers() {
		observable.notifyObservers();
	}
/**
 * toString Methode 
 * */
	public String toString() {
		return "Goose pretending to be a Duck";
	}
}

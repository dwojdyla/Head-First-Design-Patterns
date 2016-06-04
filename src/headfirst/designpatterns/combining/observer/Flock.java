package headfirst.designpatterns.combining.observer;

import java.util.Iterator;
import java.util.ArrayList;
/**
 * @author: Dominik Wojdyla
 * @04.06.2016
 * 
 * Diese Klasse implementiert das Interface Quackable
 * Somit haben wir alle Methoden des Interfaces zu Verfügung.
 * */
public class Flock implements Quackable {
	/**
	 * Eine ArrayList mit dem Namen ducks wird erstellt.
	 * */
	ArrayList<Quackable> ducks = new ArrayList<Quackable>();
  
  /**
   * In der Methode wird geaddet.
   * wir adden der ArrayList eine neue Ente
   * */
	public void add(Quackable duck) {
		ducks.add(duck);
	}
  
  	/**
  	 * Mit dem Iterator wird die ArrayList durchgegangen.
  	 * Anschließend wird mit .hasNext() geprüft ob die ArrayList ein nächstes
  	 * Element hat
  	 * 
  	 * */
	public void quack() {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.quack();
		}
	}
   /**
   * Mit dem Iterator wird die ArrayList durchgegangen.
   * Anschließend wird mit .hasNext() geprüft ob die ArrayList ein nächstes
   * Element hat.
   * */
	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.registerObserver(observer);
		}
	}
  
	public void notifyObservers() { }
  /**
   * Methde mit String Rückgabe 
   * */
	public String toString() {
		return "Flock of Ducks";
	}
}

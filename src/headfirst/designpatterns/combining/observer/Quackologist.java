package headfirst.designpatterns.combining.observer;
/**
 * @author: Dominik Wojdyla
 * @04.06.2016
 * 
 * Die Klasse implementiert Observer
 *
 * */
public class Quackologist implements Observer {
 /**
  * EIne Methode update, welche eun Ausgabe macht.
  * */
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked.");
	}
 /**
  * toString Methode 
  * */
	public String toString() {
		return "Quackologist";
	}
}

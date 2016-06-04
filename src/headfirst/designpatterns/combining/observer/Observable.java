package headfirst.designpatterns.combining.observer;

import java.util.Iterator;
import java.util.ArrayList;
/**
 * @author: Dominik Wojdyla
 * @04.06.2016
 * 
 * Diese Klasse implementiert ein Interface QuackObservable 
 *
 *Zu Beginn wird eine ArrayList erstellt.  
 * */
public class Observable implements QuackObservable {
	ArrayList<Observer> observers = new ArrayList<Observer>();
	QuackObservable duck;
 
	public Observable(QuackObservable duck) {
		this.duck = duck;
	}
  /**
   * Elemente werden der ArrayList dazugeaddet
   * */
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
  /**
   * Ein Iterator geht die ArrayList durch
   * Anschließend wird geprüft ob die ArrayList eine nächstes Element besitzt mit hasNext()
   * */
	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(duck);
		}
	}
 /**
  * Eine getter Methode
  * */ 
	public Iterator<Observer> getObservers() {
		return observers.iterator();
	}
}

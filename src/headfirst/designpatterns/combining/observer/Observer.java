package headfirst.designpatterns.combining.observer;
/**
 * @author: Dominik Wojdyla
 * @04.06.2016
 * 
 * In dieser Klasse haben wir eine Methode update.
 * In dieser wird durch QuackObservable des typs duck definiert
 * */
public interface Observer {
	public void update(QuackObservable duck);
}

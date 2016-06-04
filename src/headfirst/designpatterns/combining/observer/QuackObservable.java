package headfirst.designpatterns.combining.observer;
/**
 * @author: Dominik Wojdyla
 * @04.06.2016
 * 
 * Es handelt sich um ein Interface, mit 2 Methoden:
 * -registerObserver
 * -notifyObservers
 * */
public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}

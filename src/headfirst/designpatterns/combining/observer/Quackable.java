package headfirst.designpatterns.combining.observer;
/**
 * @author: Dominik Wojdyla
 * @04.06.2016
 * 
 * Es handelt sich um ein Interface welches von Quackobservable erbt.
 * Interface ist nur ein Bauplan
 * Das Interface hat eine Methode:
 * -quack()
 * */
public interface Quackable extends QuackObservable {
	public void quack();
}

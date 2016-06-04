package headfirst.designpatterns.combining.observer;
/**
 * @author Dominik Wojdyka
 * @04.06.2016
 * 
 * Factory Pattern
 * Die Klasse ist abstract und hat 4 Methoden, welche auch abstract sind. 
 * 
 **/
public abstract class AbstractDuckFactory {
 
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}

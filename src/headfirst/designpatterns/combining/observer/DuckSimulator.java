package headfirst.designpatterns.combining.observer;
/**
 * @author: Dominik Wojdyla
 * @04.06.2016
 * 
 * Das ist die "Hauptklasse".
 * Hier befindet sich die Main und das Programm wir von dieser Klasse aus gestartet
 * 
 * */

public class DuckSimulator {
	/**
	 * Main
	 * */
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
 
		simulator.simulate(duckFactory);
	}
	
  /**
   * Ruft folgende Methoden auf
   * */
	void simulate(AbstractDuckFactory duckFactory) {
  /**
   * Es wird erstellt:
   * -redheadDuck
   * -duckCall
   * -rubberDuck
   * -gooseDuck
   * 
   * -Flock
   * */
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());
 
		Flock flockOfDucks = new Flock();
 
 /**
  * Die erstellten Sachen werden dem Flock geaddet.
  * 
  * */
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
//Wieder ein Flock erstellt 
		Flock flockOfMallards = new Flock();
 
 /**
  * Es werden 4 MallardDucks erstellt.
  * */
		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();
//Diese werden dem erstellten Flock geaddet
		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);

		flockOfDucks.add(flockOfMallards);
/**
 * Ausgabe 
 * */
		System.out.println("\nDuck Simulator: With Observer");

		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);

		simulate(flockOfDucks);

		System.out.println("\nThe ducks quacked " + 
		                   QuackCounter.getQuacks() + 
		                   " times");
	}
 
	void simulate(Quackable duck) {
		duck.quack();
	}
}

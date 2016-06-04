package headfirst.designpatterns.combining.observer;
/**
 * @author: Dominik Wojdyla
 * @04.06.2016
 * 
 * Allgemein Adapter Pattern (Hüllenklasse)
 * */
public class Goose {
/**
 * Einfach Ausgabe "Honk"
 * */
	public void honk() {
		System.out.println("Honk");
	}

/**
 * toString Methdode
 * */
	public String toString() {
		return "Goose";
	}
}

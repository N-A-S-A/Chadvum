package org.mineacademy.novum;

public interface Nice {

	void smile(int intensity);

	default void eat() {
		System.out.println("Eating banana...");
	}
}

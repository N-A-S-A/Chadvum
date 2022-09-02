package org.mineacademy.novum.person;

import org.mineacademy.novum.Nice;
import org.mineacademy.novum.Rich;

public class Employee extends Person implements Nice, Rich {

	private String position;
	private double salary;

	public Employee(String position, double salary) {
		super("John", 5);

		this.position = position;
		this.salary = salary;
	}

	void takeNumber(byte veryTinyNumber) { // 127
		System.out.println(veryTinyNumber);

		this.customMethod();
	}

	@Override
	public void walk() {
		System.out.println("Run 2km");
	}

	@Override
	public void smile(int intensity) {
		// put up a fake-ass smile
	}

	@Override
	public void dropDiamonds() {

	}

	@Override
	public void eat() {

	}

	@Override
	public String brag() {
		return "Hey look at me!";
	}

	public String getPosition() {
		return position;
	}

	public double getSalary() {
		return salary;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}

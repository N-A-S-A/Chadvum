package org.mineacademy.novum.person;

public class Person extends LivingEntity {

	public static Person JOHN = new Person("John", 10);

	private int age; // if fields are final, then you must set their value in the constructor

	public Person() {
		super("Anonymous");
	}

	public Person(int age) {
		this("Anonymous", age);
	}

	public Person(String name, int age) {
		super(name);

		this.age = age;
	}

	protected void customMethod() {
	}

	@Override
	public void walk() {
		System.out.println("Walking 1km");
	}

	public int getAge() {
		return age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person){
			Person otherPerson = (Person) obj;

			if (otherPerson.getAge() == this.age && otherPerson.getName().equals(this.getName())){
				return true;
			}
		}
		return false;
	}

	public static Person getJOHN() {
		return JOHN;
	}
}

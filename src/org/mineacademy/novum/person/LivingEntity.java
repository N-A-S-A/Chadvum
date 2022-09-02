package org.mineacademy.novum.person;

public abstract class LivingEntity {

	private String name;

	public LivingEntity(String name) {
		this.name = name;
	}

	public abstract void walk();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

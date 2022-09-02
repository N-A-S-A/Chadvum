package org.mineacademy.novum.house;

public class House {

	private static int registeredHouses = 0;
	private final int size;

	public House(int size){
		this.size = size;

		registeredHouses++;
		System.out.println("Houses registered:" + getRegisteredHouses());
	}

	public int getSize(){
		return this.size;
	}

	public static int getRegisteredHouses() {
		return registeredHouses;
	}
}

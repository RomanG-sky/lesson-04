package lgs.lviv.ua;

public class Animal {

	private String animalName;
	private double animalSpeed;
	private int animalAge;

	public Animal(String animalName, double animalSpeed, int animalAge) {
		this.animalName = animalName;
		this.animalSpeed = animalSpeed;
		this.animalAge = animalAge;
	}


	@Override
	public String toString() {
		return "Nazva tvaryny - " + animalName + ", shvydkist tvaryny - " + animalSpeed + ", vik tvaryny - " + animalAge + ".";
	}


	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public double getAnimalSpeed() {
		return animalSpeed;
	}

	public void setAnimalSpeed(double animalSpeed) {
		this.animalSpeed = animalSpeed;
	}

	public int getAnimalAge() {
		return animalAge;
	}

	public void setAnimalAge(int animalAge) {
		this.animalAge = animalAge;
	}

}

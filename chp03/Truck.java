package chp03;

public class Truck extends Car {
	
	String hornSound;
	
	public Truck(String hornSound) {
		this("White", 2, 1000, 10, 10000, hornSound);
	}
	
	public Truck(String colour, int noOfDoors, int gasDistance, int currentSpeed, int totalKMDriven, String hornSound) {
		super(colour, noOfDoors, gasDistance, currentSpeed, totalKMDriven);
		this.hornSound = hornSound;
	}

	public String pressBrake() {
		currentSpeed = 0;
		return "Brake is pressed. CurrentSpeed: " + currentSpeed;
	}
	
	public String pressHorn() {
		return "Horn is pressed. " + hornSound;
	}
}

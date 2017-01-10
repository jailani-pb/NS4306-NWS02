package chp2;

public class Car {

	public String colour;
	public int noOfDoors;
	public int gasDistance;
	public int currentSpeed;
	public int totalKMDriven;
	
	public void pressAccelerator() {
		currentSpeed += 10;
		gasDistance -= 10;
	}
	
	public void pressBrake() {
		currentSpeed -= 10;
	}
	
}

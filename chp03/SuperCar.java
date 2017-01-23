package chp03;

public class SuperCar extends Car {
	
	boolean turbo;
	
	public SuperCar() {
		super();
		turbo = true;
	}
	
	public String pressBrake() {
		currentSpeed -= 20;
		return "Brake is pressed. CurrentSpeed: " + currentSpeed;
	}

}

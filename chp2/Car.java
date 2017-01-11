package chp2;

public class Car {
	//Instance Variable
	String colour;
	int noOfDoors;
	int gasDistance;
	int currentSpeed;
	int totalKMDriven;
	//Class Variable
	static int noOfCarsCreated = 0;
	//Constant Class Variable
	final static String carBrand = "Ford";
	
	//Methods
	public void pressAccelerator() {
		//Local Variable
		String s = "The accelerator is pressed.";
		//Print the local variable.
		System.out.println(s);
		//Change the state of the object.
		currentSpeed += 10;
		gasDistance -= 10;
	}
	
	//Methods
	public void pressBrake() {
		//Change the state of the object.
		currentSpeed -= 10;
	}
	
}

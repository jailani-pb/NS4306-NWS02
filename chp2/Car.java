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

	public Car() {
		this("Blue", 5, 500, 0, 100);
	}

	public Car(int gasDistance, int currentSpeed, int totalKMDriven) {
		this("Blue", 5, gasDistance, currentSpeed, totalKMDriven);
	}

	public Car(String colour, int noOfDoors, int gasDistance, int currentSpeed, int totalKMDriven) {
		this.colour = colour;
		if(noOfDoors >= 0 && noOfDoors <= 5){
			this.noOfDoors = noOfDoors;
		} else {
			this.noOfDoors = 5;
		}
		this.gasDistance = gasDistance;
		this.currentSpeed = currentSpeed;
		this.totalKMDriven = totalKMDriven;
	}

	public String pressAccelerator(int speed, int gasConsumed) {
		//Local Variable
		String s = "The accelerator is pressed.";
		//Change the state of the object.
		currentSpeed += speed;
		gasDistance -= gasConsumed;
		return s;
	}

	//Methods
	public String pressAccelerator(int speed) {
		return pressAccelerator(speed, 10);
	}

	//Methods
	public void pressBrake() {
		//Change the state of the object.
		currentSpeed -= 10;
	}

	public static int getNoOfCars() {
		return noOfCarsCreated;
	}

}

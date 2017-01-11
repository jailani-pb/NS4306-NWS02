package chp2;

public class RunProgram {

	public static void main(String[] args) {
		//Create first car object
		Car firstCar = new Car();
		//Set the state (instance variable) of the first car object.
		firstCar.colour = "Blue";
		firstCar.currentSpeed = 0;
		firstCar.gasDistance = 500;
		firstCar.noOfDoors = 5;
		firstCar.totalKMDriven = 100;
		//Print the first car current speed.
		System.out.println("Initial Speed");
		System.out.println(firstCar.currentSpeed);
		//Press the accelerator and print first car current speed.
		System.out.println("Pressing the Accelerator Pedal");
		firstCar.pressAccelerator();
		System.out.println(firstCar.currentSpeed);
		//Press the accelerator again and print first car current speed.
		System.out.println("Pressing the Accelerator Pedal");
		firstCar.pressAccelerator();
		System.out.println(firstCar.currentSpeed);
		
		//Create second car object
		Car secondCar = new Car();
		//Set the state (instance variable) of the second car object
		secondCar.colour = "White";
		secondCar.currentSpeed = 0;
		secondCar.gasDistance = 200;
		secondCar.noOfDoors = 5;
		secondCar.totalKMDriven = 10000;
		//Print the second car current speed.
		System.out.println("Initial Speed secondCar");
		System.out.println(secondCar.currentSpeed);
		//Press the accelerator and print second car current speed.
		System.out.println("Pressing the Accelerator Pedal secondCar");
		secondCar.pressAccelerator();
		System.out.println(secondCar.currentSpeed);
		//Printing initial value of Class Variable (noOfCarsCreated)
		System.out.println("Initial Value for noOfCarsCreated");
		System.out.println(firstCar.noOfCarsCreated);
		//Change value of the class variable through first car object.
		firstCar.noOfCarsCreated = 2;
		//Both object have the same noOfCarsCreated value.
		System.out.println("Current Value for noOfCarsCreated");
		System.out.println("For firstCar: " + firstCar.noOfCarsCreated);
		System.out.println("For secondCar: " + secondCar.noOfCarsCreated);
	}
	
}

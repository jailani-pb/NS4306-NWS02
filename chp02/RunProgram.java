package chp02;

public class RunProgram {

	public static void main(String[] args) {
		System.out.println("Current NoOfCars: " + Car.getNoOfCars());
		//Create first car object
		Car firstCar = new Car();
		//Print the first car current speed.
		System.out.println("Initial Speed");
		System.out.println(firstCar.currentSpeed);
		//Press the accelerator and print first car current speed.
		System.out.println("Pressing the Accelerator Pedal");
		System.out.println(firstCar.pressAccelerator(50));;
		System.out.println(firstCar.currentSpeed);
		//Press the accelerator again and print first car current speed.
		System.out.println("Pressing the Accelerator Pedal");
		System.out.println(firstCar.pressAccelerator(100));;
		System.out.println(firstCar.currentSpeed);
		
		//Create second car object
		Car secondCar = new Car("White", 5, 200, 0, 10000);
		//Print the second car current speed.
		System.out.println("Initial Speed secondCar");
		System.out.println(secondCar.currentSpeed);
		//Press the accelerator and print second car current speed.
		System.out.println("Pressing the Accelerator Pedal secondCar");
		System.out.println(secondCar.pressAccelerator(30));;
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

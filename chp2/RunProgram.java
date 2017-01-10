package chp2;

public class RunProgram {

	public static void main(String[] args) {
		Car c = new Car();
		c.colour = "Blue";
		c.currentSpeed = 0;
		c.gasDistance = 500;
		c.noOfDoors = 5;
		c.totalKMDriven = 100;
		System.out.println("Initial Speed");
		System.out.println(c.currentSpeed);
		
		System.out.println("Pressing the Accelerator Pedal");
		c.pressAccelerator();
		System.out.println(c.currentSpeed);
		
		System.out.println("Pressing the Accelerator Pedal");
		c.pressAccelerator();
		System.out.println(c.currentSpeed);
		
		Car c1 = new Car();
		c1.colour = "White";
		c1.currentSpeed = 0;
		c1.gasDistance = 200;
		c1.noOfDoors = 5;
		c1.totalKMDriven = 10000;
		System.out.println("Initial Speed c1");
		System.out.println(c1.currentSpeed);
		
		System.out.println("Pressing the Accelerator Pedal c1");
		c1.pressAccelerator();
		System.out.println(c1.currentSpeed);
	}
	
}

package chp03a;

public class RunProgram {

	public static void main(String[] args) {
		Animal anim = new Lion("Meat", false);
		animalSimulation(anim);
		anim = new Elephant("Daun", false);
		animalSimulation(anim);
	}
	
	public static void animalSimulation(Animal anim) {
		System.out.println(anim.eat("Ayam"));
		System.out.println(anim.sleep());
		System.out.println(anim.makeNoise("Noise"));
	}

}

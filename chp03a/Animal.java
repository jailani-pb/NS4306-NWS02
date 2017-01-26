package chp03a;

public abstract class Animal {

	String favouriteFood;
	boolean hunger;
	
	public Animal(String favouriteFood, boolean hunger) {
		this.favouriteFood = favouriteFood;
		this.hunger = hunger;
	}
	
	public abstract String eat(String food);
	
	public String makeNoise(String noise) {
		return "I make noise " + noise;
	}
	
	public abstract String sleep();
	
}

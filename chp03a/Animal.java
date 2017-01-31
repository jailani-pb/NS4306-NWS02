package chp03a;

public abstract class Animal {

	private String favouriteFood;
	private boolean hunger;
	private int age;
	
	public Animal(String favouriteFood, boolean hunger) {
		this.favouriteFood = favouriteFood;
		this.hunger = hunger;
	}
	
	public abstract String eat(String food);
	
	public String makeNoise(String noise) {
		return "I make noise " + noise;
	}
	
	public abstract String sleep();

	public boolean isHunger() {
		return hunger;
	}

	public void setHunger(boolean hunger) {
		this.hunger = hunger;
	}

	public String getFavouriteFood() {
		return favouriteFood;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 0) {
			this.age = 0;
		} else {
			if(age > 10) {
				this.age = 10;
			} else {
				this.age = age;
			}
		}
	}
	
	
	
}

package chp03a;

public class Elephant extends Animal {

	public Elephant(String favouriteFood, boolean hunger) {
		super(favouriteFood, hunger);
	}

	@Override
	public String eat(String food) {
		if(favouriteFood.equals(food)) {
			return "Elephant: Nyaman tu " + food;
		} else {
			return "Elephant: Inda ku pandai " + food;
		}
	}

	@Override
	public String sleep() {
		return "Elephant: I sleep";
	}

}

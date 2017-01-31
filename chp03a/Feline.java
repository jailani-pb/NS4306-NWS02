package chp03a;

public abstract class Feline extends Animal {

	public Feline(String favouriteFood, boolean hunger) {
		super(favouriteFood, hunger);
	}

	@Override
	public String eat(String food) {
		return "Feline: I eat";
	}

	@Override
	public String sleep() {
		if(this.isHunger()) {
			return "Feline: I cannot sleep";
		} else {
			return "Feline: I sleep";
		}
	}
	
	public abstract String hunt();

}

package chp03a;

public class Lion extends Feline implements Pet {

	public Lion(String favouriteFood, boolean hunger) {
		super(favouriteFood, hunger);
	}

	@Override
	public String hunt() {
		return "Lion: I am hunting";
	}

	@Override
	public String play() {
		if(this.isHunger()) {
			return "Lion: I am hungry, I better eat you";
		} else {
			return "Lion: Lets play";
		}
	}

	@Override
	public String beFriendly() {
		if(this.isHunger()) {
			return "Lion: I am hungry, I better eat you";
		} else {
			return "Lion: Pet me";
		}
	}

}

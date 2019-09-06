package planet_earth;

public class Earth {

	public static void main(String[] args) {

		human sammy = new human("Samuel", 12, 70, "brown");
		human raul = new human("Raulin", 15, 75, "green");

		sammy.speak();
		raul.speak();

	}

}

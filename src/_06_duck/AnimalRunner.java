package _06_duck;

public class AnimalRunner {
	public static void main(String[] args) {
		Duck daffy = new Duck("donuts", 5);
		daffy.quack();
		daffy.waddle();
		Bunny bella = new Bunny("Bella", 5);
		bella.hop();
		bella.nibbleOnFood();
	}
}

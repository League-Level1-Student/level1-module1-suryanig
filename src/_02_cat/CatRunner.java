package _02_cat;

public class CatRunner {
	public static void main(String[] args) {
		Cat cat = new Cat("Siri");
		cat.meow();
		cat.printName();
		while (cat.getLives()>0) {		
			cat.kill();
		}
	}
}

package _04_popcorn;

public class PopcornMaker {
	public static void main(String[] args) {
		Popcorn popcorn = new Popcorn("Honey BBQ");
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(popcorn);
		microwave.setTime(5);;
		microwave.startMicrowave();
		
}
}

package _06_duck;

public class Duck {
	int numberOfFriends;
	String favoriteFood;

	void quack() {
		System.out.println("The duck is quacking. Quack Quack!");
	}

	void waddle() {
		System.out.println("The duck is waddleing. Waddle Waddle!");
	}

	Duck(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}

}

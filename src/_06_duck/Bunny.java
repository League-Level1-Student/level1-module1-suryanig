package _06_duck;

public class Bunny {
	int numberOfFamilyMembers;
	String name;

	void hop() {
		System.out.println(name + " is hopping.");
	}

	void nibbleOnFood() {
		System.out.println(name + " and " + numberOfFamilyMembers + " siblings are nibbling on carrots.");
	}

	Bunny(String name, int numberOfFamilyMembers) {
		this.name = name;
		this.numberOfFamilyMembers = numberOfFamilyMembers;
	}

}

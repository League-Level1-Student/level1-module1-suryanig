package _05_vault;

import java.util.Random;

public class Vault {
int code;
Vault() {
	Random random = new Random();
	code = random.nextInt(1000000) + 1;
	
}
boolean tryCode(int guess) {
	if (guess == code) {
		return true;
	}
	else {
		return false;
	}
}
}

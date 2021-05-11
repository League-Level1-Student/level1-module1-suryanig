package _05_vault;

public class Spy {
	String name;

	Spy(String name) {
		this.name = name;
	}

	int findCode(Vault vault) {
		for (int i = 1; i < 1000000; i++) {
			boolean vaultOpens = vault.tryCode(i);
			if (vaultOpens) {
				return i;
			}
		}
		return -1;
	}
}

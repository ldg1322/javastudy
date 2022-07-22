package ch07.exam.ex7_14;

public class Exercise7_14 {

	public static void main(String[] args) {
		SutdaCard card = new SutdaCard(1, true);

	}

}

class SutdaCard {
	final int num;
	final boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

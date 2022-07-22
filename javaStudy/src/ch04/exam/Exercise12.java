package ch04.exam;

public class Exercise12 {

	public static void main(String[] args) {
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 3; j++) {
//				System.out.print(i + "x" + j + "=" + i * j + "\t");
//			}
//			System.out.println();
//		} 

		int i, j;

		for (i = 2; i <= 9; i += 3) {
			for (j = 1; j <= 3; j++) {
				int y = i;
				for (int x = 1; x <= 3; x++) {
					if (y >= 10)
						continue;
					System.out.print(y + "X" + j + "=" + y * j + "\t");
					y++;
				}
				System.out.println("");
			}
			System.out.println();
		}
	}
}
package お遊び幼稚園;

public class 遊び場２砂場 {

	public static void main(String[] args) {
		int i = 3;
		while (i <= 7) {
			if (i >= 3) {
				System.out.println("*");
				i++;
			}
			if (i >= 4) {
				System.out.println("**");
				System.out.print("*");
				i++;
			}
				if (i == 5) {
					System.out.print("*");
					System.out.println("*");
					i++;
				}
			if (i == 6) {
				System.out.println("****");
				System.out.print("**");
				i--;
			}
			if (i == 7) {
				break;
			}

		}

	}

}

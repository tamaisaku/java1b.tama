package course20;

public class Practice02 {

	public static void main(String[] args) {
		int num = 333;
		int[] numArray = { 10, 20, 30, 40, 50 };
		for (int a : numArray) {
			num = num - a;
		}
		System.out.println(num);
		int g = 0;
		int h = 0;
		int m = 0;
		int n = 0;
		int[] saiko = { 10, 20, 30, 40, 50 };
		for (int b : saiko) {
			if (b <= 10) {
				g = b;
			}
			if (b <= 50) {
				h = b;
			}
			if (b <= 40) {
				m = b;
			}
			if (b <= 20) {
				n = b;
			}
		}
		System.out.println(g + h);
		System.out.println(m - n);

		int y = 0;
		String[] moji = { "x", "y", "x", "y", "x" };
		for (String z : moji) {
			if ("x".equals(z)) {
				y = y + 1;
			}
		}
		System.out.println(y);

		int s = 0;
		String[] arr = { "y", "x", "x","y", "x", "x", "x", "y" };
		for (String mozi : arr) {
			if ("x".equals(mozi)) {
				s = s + 1;
			} else {
				s = 0;
			}
			if (s >= 2) {
				System.out.println(s + "回続いてる");
			}
		}

	}

}

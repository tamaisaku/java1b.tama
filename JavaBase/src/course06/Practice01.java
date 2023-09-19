package course06;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		int a = ５;
		if (a > 3) {
			System.out.println("３より大きいなｗ");
		} else {
			System.out.println("３より雑魚やな");
		}
		int x = 10;
		int y = 10;
		if (x == y) {
			System.out.println("同じ値です");
		} else {
			System.out.println("違いますな");
		}
		int m = ６;
		if (m >= 3) {
			System.out.println("３以上だよ");
		}
		Scanner stdIn = new Scanner(System.in);
		System.out.println("空欄に適当な数字を書きなさい");
		int n = stdIn.nextInt();
		if (n >= 10) {
			System.out.println("１０以上");
		} else {
			System.out.println("小さい");
		}

	}

}

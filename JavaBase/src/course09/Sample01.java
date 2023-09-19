package course09;

import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();

		switch (num) {
		case 1:
			System.out.println("１ですね？");
			break;
		case 2:
			System.out.println("2ですね？");
			break;
		case 10:
			System.out.println("10ですね？");
			break;
		default:
			System.out.println("該当せず");
		}

		String a = stdIn.next();

		switch (a) {
		case "魚":
		case "肉":
			System.out.println("おいしいです");
			break;
		case "野菜":
		case "その他":
			System.out.println("健康重視です");
			break;
		default:
			System.out.println("該当せず");
		}

	}

}

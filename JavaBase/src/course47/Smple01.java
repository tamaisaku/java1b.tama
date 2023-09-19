package course47;

import java.util.Scanner;

public class Smple01 {

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			try {
				System.out.println("数値を入力しte根");
				Scanner stdIn = new Scanner(System.in);

				int x = stdIn.nextInt();
				int[] numArr = new int[2];

				numArr[1] = 10;
				numArr[2] = 20;
				numArr[3] = 30;
				numArr[4] = 40;

			} catch (Exception e) {
				System.out.println("以下のエラーを検出しました！ググレカス");
				System.out.println(e);
			}

		}
	}

}

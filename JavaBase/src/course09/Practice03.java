package course09;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.println("入力してね");
		int numnum = stdIn.nextInt();
		switch(numnum) {
		case 1:
			System.out.println("１ですね");
			break;
		case 2:
			System.out.println("２ですね");
			break;
		default:
			System.out.println("該当なし");
		}
		


	}

}

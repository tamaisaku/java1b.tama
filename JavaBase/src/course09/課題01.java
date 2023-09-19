package course09;

import java.util.Scanner;


public class 課題01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("誕生日を入力してね。例：３月なら「３」と入力");
		Scanner stdIn = new Scanner(System.in);
		int month=stdIn.nextInt();
		switch(month) {
		case 1:
		case 2:
		case 3:
			System.out.println("大吉");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("中吉");
			break;
		case 7:
		case 9:
			System.out.println("小基地");
			break;
		case 8:
			System.out.println("もう大吉より大吉！！");
		case 10:
		case 11:
		case 12:
			System.out.println("大狂");
			break;
			default:
				System.out.println("二つ名:人ならざる者");
		}

	}

}

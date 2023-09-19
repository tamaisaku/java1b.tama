package couse10;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("私はJava勉強中です");

		System.out.println("大門２");
		int x = 50;
		int y = 100;
		System.out.println(x * y);

		System.out.println("大門３");
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		System.out.println(a + 100);

		System.out.println("大門４");
		String mozi = stdIn.next();
		System.out.println(mozi + "を入力しました。");

		System.out.println("大門5");
		int w = stdIn.nextInt();
		int q = stdIn.nextInt();
		if (w > q) {
			System.out.println("ｗがでかい");
		} else if (w < q) {
			System.out.println("ｑがでかい");
		} else
			System.out.println("該当なし");

		System.out.println("大門6");
		int xx = stdIn.nextInt();
		int yy = stdIn.nextInt();
		if (xx > yy) {
			System.out.println("xがでかい！なじぇなりゃｘは" + xx + "でｙは" + yy + "だから");
		} else if (xx < yy) {
			System.out.println("yがでかい！なじぇなりゃｘは" + xx + "でｙは" + yy + "だから");
		} else
			System.out.println("該当なし");

		System.out.println("大門8");
		int aa = stdIn.nextInt();
		int ab = stdIn.nextInt();
		int ac = stdIn.nextInt();

		if (aa >= ab && aa >= ac) {
			System.out.println(aa + "が一番大きい数値です");
		}
		if (ab >= aa && ab >= ac) {
			System.out.println(ab + "が一番大きい数値です");
		}
		if (ac >= aa && ac >= ab) {
			System.out.println(ac + "が一番大きい数値です");
		}
		if (aa >= ab && aa <= ac) {
			System.out.println(aa + "が２番目に大きい");

		}
		if (ab >= aa && ab <= ac) {
			System.out.println(ab + "が２番目に大きい");

		}
		if (ac >= ab && ac <= aa) {
			System.out.println(ac + "が２番目に大きい");

		}
		if (aa <= ab && aa <= ac) {
			System.out.println(aa + "が3番目に大きい");
		}
		if (ab <= aa && ab <= ac) {
			System.out.println(ab + "が3番目に大きい");
		}
		if (ac <= aa && ac <= ab) {
			System.out.println(ac + "が3番目に大きい");
		}
		
		String k = stdIn.next();
		switch (k) {
		case"月":
		case"水":
		case"木":
		case"土":
			System.out.println("予約可能");
			break;
		default:
			System.out.println("予約不可");
			
		}
		
		String m = stdIn.next();
		switch(m) {
		case"月":
		case"木":
			System.out.println("すべて可");
			break;
		case"火":
		case"金":
				System.out.println("午後、夜間が可");
				break;
		case"水":
		System.out.println("午前、午後可");
		break;
		case"土":
		System.out.println("午前可");
		break;
		default:
			System.out.println("日曜休み");
		}

	}

}

package course24;

import java.util.Scanner;

public class 応用 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("簡易型電卓");
		System.out.println("足し算１　引き算２");
		System.out.println("掛け算３　割り算４");
		int utikomi = stdIn.nextInt();
		int a1 = 0;
		int a2 = 0;
		System.out.println("100個まで値が入力できます");
		System.out.println("9999を打つと終わります");
		for (int a = 1; a <= 100; a++) {
			System.out.println(a+"回目");
			System.out.println("値１");
			int a3 = stdIn.nextInt();
			if (a3 == 9999) {
				break;
			}
			a1 = a1 + a3;
			System.out.println("値２");
			int a4 = stdIn.nextInt();
			if (a4 == 9999) {
				break;
			}
			a2 = a2 + a4;
		}
		switch (utikomi) {
		case 1:
			tasu(a1, a2);
			break;
		case 2:
			hiki(a1, a2);
			break;
		case 3:
			kake(a1, a2);
			break;
		case 4:
			waru(a1, a2);
		}
	}

	static void tasu(int ta, int si) {
		System.out.println(ta + si);
	}

	static void hiki(int hi, int ki) {
		System.out.println(hi - ki);
	}

	static void kake(int ka, int ke) {
		System.out.println(ka * ke);
	}

	static void waru(int wa, int ru) {
		System.out.println(wa / ru);
	}

}

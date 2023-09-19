package ガチャシステム;

import java.util.Random;
import java.util.Scanner;

public class Naibu {

	public static void main(String[] args) {
		Scanner erab = new Scanner(System.in);
		Random gaty = new Random();
		int i = 0;
		int count = 0;
		while (i <= 9999) {

			//System.out.println("終わりなら９９９９");
			//i=erab.nextInt();
			//if (count == 300) {
			//	System.out.println("ピックアップSSR");
			//}

			System.out.println("何回引く？1or10");
			int kaisu = erab.nextInt();
			if (kaisu >= 11) {
				System.out.println("1か10で");
			} else if (count <= 300) {
				for (int ka = 1; ka <= kaisu; ka++) {
					int rand = gaty.nextInt(100) + 1;
					if (rand <= 82) {
						System.out.println("R");
						count = count + 1;
					} else if (rand <= 97) {
						System.out.println("SR");
						count = count + 1;
					} else {
						int rand2 = gaty.nextInt(10) + 1;
						if (rand2 <= 7) {
							System.out.println("ピックアップSSR");
							count = count + 1;
						} else {
							System.out.println("SSR");
							count = count + 1;
						}
					}
					if (count == 300) {
						System.out.println("回数が300になった");
						System.out.println("ピックアップをプレゼント！！");
						break;
					}
				}
				System.out.println("低確率にしたいなら301を入力");
				count=erab.nextInt();

			} else {
				for (int ka = 1; ka <= kaisu; ka++) {
					int rand = gaty.nextInt(100) + 1;
					if (rand <= 82) {
						System.out.println("R");
						count = count + 1;
					} else if (rand <= 99) {
						System.out.println("SR");
						count = count + 1;
					} else {
						int rand3 = gaty.nextInt(100) + 1;
						if (rand3 <= 1) {
							System.out.println("UR");
							count = count + 1;
						} else {
							System.out.println("SSR");
							count = count + 1;
						}

					}
				}
			}

			System.out.println("終わりにするなら９９９９");
			i = erab.nextInt();

		}
	}

}

package 総合演習;

import java.util.Random;
import java.util.Scanner;

public class Trainer {
	String name;
	Pocketon[] myPockes;

	//値の初期化
	Trainer() {
		name = "";
		myPockes = new Pocketon[6];
	}

	void capture(Pocketon pocke) {
		Random rnd = new Random();
		int a = rnd.nextInt(10) + 1;
		if (pocke.diffcult <= a) {
			System.out.println("捕獲成功");
			//UseClass2用
		for(int i=0;i<=5;i++) {
				if(myPockes[i]==null) {
					myPockes[i]=pocke;
					break;
				}
				if(myPockes[5]==null) {
				}else {
					System.out.println("ポケトンがいっぱいで保存できない");
					System.out.println("どこに保存する？０～５");
					Scanner stdIn = new Scanner(System.in);
					int senta = stdIn.nextInt();
					myPockes[senta] = pocke;
					break;
				}
			}
		
			//UseClass用
			//Scanner stdIn = new Scanner(System.in);
			//int senta = stdIn.nextInt();
			//myPockes[senta] = pocke;
		} else {
			System.out.println("捕獲失敗");
		}
	}

	void display() {
		for(int i=0;i<=5;i++) {
		if (myPockes[i] == null) {
		} else {
			System.out.println(myPockes[i].name);
		}
		}
	} 
	int wake() {
		int i;
		Scanner stdIn = new Scanner(System.in);
		String bato3=stdIn.next();
		for(i=0;i<=5;i++) {
			if(myPockes[i].name.equals(bato3)) {
			}
		}
		return i;
	}

}

package course26;

import java.util.Random;
import java.util.Scanner;

public class prac01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int gamecont = 0;
		int wincount = 0;
		int losecount = 0;
		int rand2 = 0;
		int yosou = 0;
		int rand = 0;

		syo();

		judge();

		rand = kaad();
		System.out.println("１枚目カード数は[" + rand + "]");
		
		System.out.println("高いか低いか予想をしてください");
		System.out.println("1:高い 2:低い");
		yosou = stdIn.nextInt();

		rand2 = kaad();
		
		String kekka = hanntei(rand, rand2, yosou);
		if(kekka.equals("win")) {
			wincount=wincount+1;
			
		}
		if(kekka.equals("lose")) {
			losecount=losecount+1;
			
		}
		System.out.println("２枚目カード数は[" + rand2 + "]");
		gamecont=wincount+losecount;

		double f = Shouritu(gamecont, wincount);
		System.out.println(f + "%");
		dispResult(gamecont, wincount, losecount);

	}
	static void syo() {
		int syozi = 1000;
		System.out.println("現在の所持金は" + syozi + "です");
	}

	static int kaad() {
		Random rnd = new Random();
		int a = rnd.nextInt(13) + 1;
		int num = a;
		return num;
	}

	static String hanntei(int x, int y, int z) {
		String kekka = null;
		if (x == y) {

		} else if (x < y && z == 1) {
			kekka = "win";
		} else if (x > y && z == 2) {
			kekka = "win";
		} else if (x < y && z == 2) {
			kekka = "lose";
		} else if (x > y && z == 1) {
			kekka = "lose";
		}
		return kekka;
	}

	static double Shouritu(int u, int t) {
		//勝利数÷勝負数
		double f = u / t;
		return f;
	}

	static void dispResult(int x, int y, int z) {
		System.out.println("現在のゲーム数" + x);
		System.out.println("現在の勝利数" + y);
		System.out.println("現在の敗北数" + z);
	}

	static String judge() {
		System.out.println("続ける場合は2、終了する場合は9999を入力してください。");

		String kaesu = "";
		Scanner stdIn = new Scanner(System.in);

		int a = stdIn.nextInt();

		if (a == 9999) {
			kaesu = "END";
		} else {
			kaesu = "CONT";
		}

		return kaesu;
	}
}

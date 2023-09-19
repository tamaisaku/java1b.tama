package course57;

import java.util.Random;
import java.util.Scanner;

public class PlayControll {

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		Plsyer me = new Plsyer();
		System.out.println("0通常モード99でバックモード");
		int U = scan.nextInt();
		if (U == 0) {
			me.setkinryoku(rnd.nextInt(5) + 1);
			me.setgakuryoku(rnd.nextInt(5) + 1);
			me.setmitame(rnd.nextInt(5) + 1);
			me.setomosiro(rnd.nextInt(5) + 1);
		} else {
			System.out.println("自由にパラメータを振り込める");
			System.out.println("筋力");
			int Y = scan.nextInt();
			me.setkinryoku(Y);
			System.out.println("学力");
			int M = scan.nextInt();
			me.setgakuryoku(M);
			System.out.println("見た目");
			int N = scan.nextInt();
			me.setmitame(N);
			System.out.println("面白");
			int O = scan.nextInt();
			me.setomosiro(O);
		}

		Target kok = new Target();
		kok.sethikakuKin(rnd.nextInt(11) + 3);
		kok.sethituyouGaku(rnd.nextInt(11) + 3);
		kok.sethituyouMita(rnd.nextInt(11) + 3);
		kok.sethituyouOmo(rnd.nextInt(11) + 3);

		System.out.println("筋力:" + me.getkinryoku());
		System.out.println("学力:" + me.getgakuryoku());
		System.out.println("見た目:" + me.getmitame());
		System.out.println("面白:" + me.getomosiro());

		int kai = 1;
		for (int om = 0; om <= 7; om++) {
			System.out.println("トレーニングメニューの選択");
			System.out.println("1筋トレ 2勉強 3整形 4人と喋る");
			System.out.println("筋肉１+ 学力１+ 見た目１+ 面白さ１+");

			String sen = scan.next();
			if (sen.equals("1")) {
				me.setkinryoku(me.getkinryoku() + 1);
				kai = kai + 1;
			} else if (sen.equals("2")) {
				me.setgakuryoku(me.getgakuryoku() + 1);
				kai = kai + 1;
			} else if (sen.equals("3")) {
				me.setmitame(me.getmitame() + 1);
				kai = kai + 1;
			} else {
				me.setomosiro(me.getomosiro() + 1);
				kai = kai + 1;
			}
			int R = rnd.nextInt(4) + 1;
			if (R == 1) {
				int gosa1 = kok.gethikakuKin() - me.getkinryoku();
				System.out.println("筋力あと" + gosa1 + "ぐらい");
			} else if (R == 2) {
				int gosa2 = kok.gethituyouGaku() - me.getgakuryoku();
				System.out.println("学力あと" + gosa2 + "ぐらい");
			} else if (R == 3) {
				int gosa3 = kok.gethituyouMita() - me.getmitame();
				System.out.println("見た目あと" + gosa3 + "ぐらい");
			} else {
				int gosa4 = kok.gethituyouOmo() - me.getomosiro();
				System.out.println("面白あと" + gosa4 + "ぐらい");
			}
		}
		int seki = 0;
		System.out.println("とうとうこの時告白のチャンス!!");
		System.out.println("勝負するステータスを選択1筋力2学力3見た目4コミュ");
		int sen2 = scan.nextInt();
		if (sen2 == 1) {
			seki = seki + kokuhaku(me.getkinryoku(), kok.gethikakuKin(), 0);
			int T = rnd.nextInt(3) + 1;
			if (T == 1) {
				seki = seki + kokuhaku(me.getgakuryoku(), kok.gethituyouGaku(), 0);
			} else if (T == 2) {
				seki = seki + kokuhaku(me.getmitame(), kok.gethituyouMita(), 0);
			} else {
				seki = seki + kokuhaku(me.getomosiro(), kok.gethituyouOmo(), 0);
			}

		} else if (sen2 == 2) {
			seki = seki + kokuhaku(me.getgakuryoku(), kok.gethituyouGaku(), 0);
			int T = rnd.nextInt(4) + 1;
			if (T == 1) {
				seki = seki + kokuhaku(me.getkinryoku(), kok.gethikakuKin(), 0);
			} else if (T == 2) {
				seki = seki + kokuhaku(me.getmitame(), kok.gethituyouMita(), 0);
			} else {
				seki = seki + kokuhaku(me.getomosiro(), kok.gethituyouOmo(), 0);
			}
		} else if (sen2 == 3) {
			seki = seki + kokuhaku(me.getmitame(), kok.gethituyouMita(), 0);
			int T = rnd.nextInt(4) + 1;
			if (T == 1) {
				seki = seki + kokuhaku(me.getkinryoku(), kok.gethikakuKin(), 0);
			} else if (T == 2) {
				seki = seki + kokuhaku(me.getgakuryoku(), kok.gethituyouGaku(), 0);
			} else {
				seki = seki + kokuhaku(me.getomosiro(), kok.gethituyouOmo(), 0);
			}
		} else {
			seki = seki + kokuhaku(me.getomosiro(), kok.gethituyouOmo(), 0);
			int T = rnd.nextInt(4) + 1;
			if (T == 1) {
				seki = seki + kokuhaku(me.getkinryoku(), kok.gethikakuKin(), 0);
			} else if (T == 2) {
				seki = seki + kokuhaku(me.getgakuryoku(), kok.gethituyouGaku(), 0);
			} else {
				seki = seki + kokuhaku(me.getmitame(), kok.gethituyouMita(), 0);
			}
		}
		if (seki >= 2) {
			System.out.println("成功!!これから幸せなハッピーエンドくそったれが");
		} else {
			System.out.println("君は失敗した地獄で達者でな");
		}

	}

	public static int kokuhaku(int a, int b, int c) {
		if (a > b) {
			c = c + 1;
		} else {
			c = c + 0;
		}
		return c;
	}

}

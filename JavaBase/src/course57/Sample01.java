package course57;

import java.util.Random;
import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("数字あてゲーム");
		int hyak = rnd.nextInt(100) + 1;
		int kaisu = 1;
		System.out.println("1~100のなかで数字を当てよう");

		for (int yt = 0; yt < 999;) {
			System.out.println("当たりそうな数値の入力");
			int kakik = scan.nextInt();
			if (hyak == kakik) {
				System.out.println("正解");
				System.out.println(kaisu+"回目で当たったよ");
				yt = 999;
			} else if (hyak < kakik) {
				int ka=kaisu-hyak;
				System.out.println("選んだ数値より低いかな");
				kaisu = kaisu + 1;
			} else {
				System.out.println("選んだ数値より大きいかも");
				kaisu = kaisu + 1;
			}
			if(kaisu==10) {
				for(int a=0;a<=1;) {
					System.out.println("10回以内に終わらなかったので壊します");
				}
			}

		}
	}
	
}
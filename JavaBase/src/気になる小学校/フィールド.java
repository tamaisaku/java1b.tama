package 気になる小学校;

import java.util.Random;
import java.util.Scanner;

public class フィールド {

	public static void main(String[] args) {
		batol bat = new batol();
		int levelj = 100;

		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		String name = scan.next();
		アイフォン ai = new アイフォン(name);
		ai.display();
		String li = scan.nextLine();

		敵 te = new 敵(ai);
		bat.hozon(ai, te);
		te.display();
		String li2 = scan.nextLine();

		//for(int owa=0;owa<=100;) {
		bat.batl(ai, te);
		System.out.println("バトル終了");
		//if(ai.level<=levelj) {
		//ai.leveup();
		//levelj=levelj+100;
		//}
		//}

	}

}

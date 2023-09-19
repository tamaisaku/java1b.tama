package couser49;

import java.util.Scanner;

public class Sample02 {

	public static void main(String[] args) {
		int[][] seki = new int[6][6];

		seki[0][0] = 0;
		seki[0][1] = 1;
		seki[0][2] = 0;
		seki[0][3] = 0;
		seki[0][4] = 0;
		seki[0][5] = 0;

		seki[1][0] = 0;
		seki[1][1] = 0;
		seki[1][2] = 0;
		seki[1][3] = 0;
		seki[1][4] = 0;
		seki[1][5] = 0;

		seki[2][0] = 0;
		seki[2][1] = 0;
		seki[2][2] = 0;
		seki[2][3] = 0;
		seki[2][4] = 0;
		seki[2][5] = 0;

		seki[3][0] = 0;
		seki[3][1] = 0;
		seki[3][2] = 0;
		seki[3][3] = 0;
		seki[3][4] = 0;
		seki[3][5] = 0;

		seki[4][0] = 0;
		seki[4][1] = 0;
		seki[4][2] = 0;
		seki[4][3] = 0;
		seki[4][4] = 0;
		seki[4][5] = 0;

		seki[5][0] = 0;
		seki[5][1] = 0;
		seki[5][2] = 0;
		seki[5][3] = 0;
		seki[5][4] = 0;
		seki[5][5] = 0;

		//席の確認を調べるプログラム
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i <= 999; i++) {
			//この席でいいかの確認
			System.out.println("確定していい？はい１・・いいえ１以外");
			int sentak = scan.nextInt();

			
			if (sentak == 1) {
				//確定した場合すべての席を表示するプログラム
				for (int b = 0; b <= 5; b++) {
					for (int c = 0; c <= 5; c++) {
						System.out.print(seki[b][c] + " ");
					}
					System.out.println("");
				}

				break;
				//case 2:

			} else {
				//変更する前の座席表示
				for (int b = 0; b <= 5; b++) {
					for (int c = 0; c <= 5; c++) {
						System.out.print(seki[b][c] + " ");
					}
					System.out.println("");
				}
				
				//いいえを選択した場合入れ替えたいところの指定を要求
				//入れ替えしたい値の場所の左側を指定
				System.out.println("入れ替えしたい元を選択:[][]の←側");
				int basyo1 = scan.nextInt();
				
				//入れ替えしたい値の場所の右側を指定
				System.out.println("入れ替えしたい元を選択:[][]の→側");
				int basyo2 = scan.nextInt();
				
				//入れ替えしたい値の先の左側を指定
				System.out.println("入れ替えしたい先を選択:[][]の←側");
				int basaki1 = scan.nextInt();
				
				//入れ替えしたい値の先の右側を指定
				System.out.println("入れ替えしたい先を選択:[][]の→側");
				int basaki2 = scan.nextInt();

				//指定した場所を入れ替える
				int save = seki[basaki1][basaki2];
				seki[basaki1][basaki2] = seki[basyo1][basyo2];
				seki[basyo1][basyo2] = save;
			}
			//変更した後の座席表示
			for (int b = 0; b <= 5; b++) {
				for (int c = 0; c <= 5; c++) {
					System.out.print(seki[b][c] + " ");
				}
				System.out.println("");
			}
			

		}

	}

}

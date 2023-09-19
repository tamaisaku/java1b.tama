package お遊び幼稚園;

import java.util.Random;
import java.util.Scanner;

public class 練習場2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		Random rnd = new Random();

		int saikoro = rnd.nextInt(10) + 1;

		int HP = 10;
		int[][] zhyou = new int[5][5];
		zhyou[0][0] = 1;
		zhyou[0][1] = 2;
		zhyou[0][2] = 3;
		zhyou[0][3] = 4;
		zhyou[0][4] = 5;

		zhyou[1][0] = 6;
		zhyou[1][1] = 7;
		zhyou[1][2] = 8;
		zhyou[1][3] = 9;
		zhyou[1][4] = 10;

		zhyou[2][0] = 11;
		zhyou[2][1] = 12;
		zhyou[2][2] = 13;
		zhyou[2][3] = 14;
		zhyou[2][4] = 15;

		zhyou[3][0] = 16;
		zhyou[3][1] = 17;
		zhyou[3][2] = 18;
		zhyou[3][3] = 19;
		zhyou[3][4] = 20;

		zhyou[4][0] = 21;
		zhyou[4][1] = 22;
		zhyou[4][2] = 23;
		zhyou[4][3] = 24;
		zhyou[4][4] = 25;

		int zw = 0;
		int za = 0;

		while (za <= 3 && zw <= 3 || za<=0 && zw<=0) {
			//　＊　＊　＊　＊　＊
			//　１６　　１８　　２０
			//　１１１２１３１４１５
			//　９　　　８　　　１０
			//　１　２　３　４　５
			if (zhyou[zw][za] == 1) {
				System.out.println("操作　１前 2右");
				int a = stdIn.nextInt();
				switch (a) {
				case 1:
					zw = zw + 1;
					System.out.println("前に進んだ");
					System.out.println("座標" + zhyou[zw][za]);
					break;
				case 2:
					za = za + 1;
					System.out.println("右へ進んだ");
					System.out.println("座標" + zhyou[zw][za]);
				}
			}
			if (zhyou[zw][za] == 2) {
				System.out.println("操作　 2右 3左");
				int a = stdIn.nextInt();
				switch (a) {
				case 2:
					za = za + 1;
					System.out.println("右へ進んだ");
					System.out.println("座標" + zhyou[zw][za]);
					break;
				case 3:
					za = za + 1;
					System.out.println("左へ進んだ");
					System.out.println("座標" + zhyou[zw][za]);
				}
			}
			if (zhyou[zw][za] == 3) {
				System.out.println("操作　1前 2右 3左");
				int a = stdIn.nextInt();
				switch (a) {
				case 1:
					zw = zw + 1;
					System.out.println("前に進んだ");
					System.out.println("座標" + zhyou[zw][za]);
					break;
				case 2:
					za = za + 1;
					System.out.println("右へ進んだ");
					System.out.println("座標" + zhyou[zw][za]);
					break;
				case 3:
					za = za - 1;
					System.out.println("左へ進んだ");
					System.out.println("座標" + zhyou[zw][za]);
				}
			}
			if (zhyou[zw][za] == 4) {
				System.out.println("操作　 2右 3左");
				int a = stdIn.nextInt();
				switch (a) {
				case 2:
					za = za + 1;
					System.out.println("右へ進んだ");
					System.out.println("座標" + zhyou[zw][za]);
					break;
				case 3:
					za = za - 1;
					System.out.println("左へ進んだ");
					System.out.println("座標" + zhyou[zw][za]);
				}
			}
			if (zhyou[zw][za] == 5) {
				System.out.println("操作　1前  3左");
				int a = stdIn.nextInt();
				switch (a) {
				case 1:
					zw = zw + 1;
					System.out.println("前に進んだ");
					System.out.println("座標" + zhyou[zw][za]);
					break;
				case 3:
					za = za - 1;
					System.out.println("左へ進んだ");
					System.out.println("座標" + zhyou[zw][za]);
				}
			}

			if (zhyou[zw][za] == 6) {
				System.out.println("操作　1前 4後");
				int a = stdIn.nextInt();
				switch (a) {
				case 1:
					zw = zw + 1;
					System.out.println("前に進んだ");
					System.out.println("座標" + zhyou[zw][za]);
				case 4:
					zw = zw - 1;
					System.out.println("後ろへ進んだ");
					System.out.println("座標" + zhyou[zw][za]);
				}
			}
			if (zhyou[zw][za] == 8) {
				System.out.println("操作　 1前 4後");
				int a = stdIn.nextInt();
				switch (a) {
				case 1:
					zw = zw + 1;
					System.out.println("前へ進んだ");
					System.out.println("座標" + zhyou[zw][za]);
					break;
				case 4:
					zw = zw - 1;
					System.out.println("後ろへ進んだ");
					System.out.println("座標" + zhyou[zw][za]);
				}
			}
			if (zhyou[zw][za] == 10) {
				System.out.println("操作　 1前 4後");
				int a = stdIn.nextInt();
				switch (a) {
				case 1:
					zw = zw + 1;
					System.out.println("前へ進んだ");
					System.out.println("座標" + zhyou[zw][za]);
					break;
				case 4:
					zw = zw - 1;
					System.out.println("後ろへ進んだ");
					System.out.println("座標" + zhyou[zw][za]);
				}
			}
			if (zhyou[zw][za] == 11) {
				System.out.println("操作　1前 2右 4後");
				int a = stdIn.nextInt();
				switch (a) {
				case 1:
					zw = zw + 1;
					System.out.println("前に進んだ");
					System.out.println("座標" + zhyou[zw][za]);
					break;
				case 2:
					za = za + 1;
					System.out.println("右へ進んだ");
					System.out.println("座標" + zhyou[zw][za]);
					break;
				case 4:
					zw = zw - 1;
					System.out.println("後ろへ進んだ");
					System.out.println("座標" + zhyou[zw][za]);
				}
			}
			if (zhyou[zw][za] == 12) {
				System.out.println("操作　2右 3左");
				int a = stdIn.nextInt();
				switch (a) {
				case 2:
					za = za + 1;
					System.out.println("右へ進んだ");
					System.out.println("座標" + zhyou[zw][za]);
					break;
				case 3:
					za = za - 1;
					System.out.println("左へ進んだ");
					System.out.println("座標" + zhyou[zw][za]);
				}
			}
			if (zhyou[zw][za] == 13) {
				System.out.println("操作　1前 2右 4後");
				int a = stdIn.nextInt();
				switch (a) {
				case 1:
					zw = zw + 1;
					System.out.println("前に進んだ");
					System.out.println("座標" + zhyou[zw][za]);
					break;
				case 2:
					za = za + 1;
					System.out.println("右へ進んだ");
					System.out.println("座標" + zhyou[zw][za]);
					break;
				case 3:
					za = za - 1;
					System.out.println("左へ進んだ");
					System.out.println("座標" + zhyou[zw][za]);
					break;
				case 4:
					zw = zw - 1;
					System.out.println("後ろへ進んだ");
					System.out.println("座標" + zhyou[zw][za]);
				}
			}
			if (zhyou[zw][za] == 14) {
				System.out.println("操作　2右 3左");
				int a = stdIn.nextInt();
				switch (a) {
				case 2:
					za = za + 1;
					System.out.println("右へ進んだ");
					System.out.println("座標" + zhyou[zw][za]);
					break;
				case 3:
					za = za - 1;
					System.out.println("左へ進んだ");
					System.out.println("座標" + zhyou[zw][za]);
				}
			}
			if (zhyou[zw][za] == 16) {
				System.out.println("操作　1前");
				int b = stdIn.nextInt();
				switch (b) {
				case 1:
					zw = zw + 1;
					System.out.println("前に進んだ");
					System.out.println("座標" + zhyou[zw][za]);
				}
			}
			if (zhyou[zw][za] == 21) {
				System.out.println("操作　 2右 4後");
				int b = stdIn.nextInt();
				switch (b) {
				case 2:
					za = za + 1;
					System.out.println("右へ進んだ");
					System.out.println("座標" + zhyou[zw][za]);
				case 4:
					zw = zw - 1;
					System.out.println("後ろへ進んだ");
					System.out.println("座標" + zhyou[zw][za]);
				}
			}
			//while文最後
		}

	}

}

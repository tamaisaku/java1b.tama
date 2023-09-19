package course50;

import java.util.Random;

public class Sample01 {

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

		Random rnd = new Random();

		for (int a = 0; a <= 36; a++) {
			
			for (int b = 0; b <= 5; b++) {
				for (int c = 0; c <= 5; c++) {
					int omo = rnd.nextInt(36) + 1;

					if (seki[b][c] == omo) {
					} else {
						seki[b][c] = omo;
					}

				}
			}
		}
		for (int b = 0; b <= 5; b++) {
			for (int c = 0; c <= 5; c++) {
				System.out.print(seki[b][c] + " ");
			}
			System.out.println("");
		}

	}

	static int m(int a, int b) {
		Random rnd = new Random();
		if (a == b) {
		} else {
			b = rnd.nextInt(36) + 1;
		}

		return b;
	}

}

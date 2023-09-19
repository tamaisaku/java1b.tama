package caorse23;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		String[][] a = new String[3][3];
		a[0][0] = "☆";
		a[0][1] = "□";
		a[0][2] = "☆";
		a[1][0] = "□";
		a[1][1] = "☆";
		a[1][2] = "△";
		a[2][0] = "△";
		a[2][1] = "□";
		a[2][2] = "△";
		String s = "G";

		for (int f = 0; f < 3; f++) {
			
			int b = stdIn.nextInt();
			int c = stdIn.nextInt();
			int d = stdIn.nextInt();
			int e = stdIn.nextInt();

			String AA = a[b][c];
			String BB = a[d][e];
			a[b][c] = BB;
			a[d][e] = AA;

			if (a[0][0].equals(a[0][1]) && a[0][2].equals(a[0][0])) {
				a[0][0] = s;
				a[0][1] = s;
				a[0][2] = s;
			}
			if (a[1][0].equals(a[1][1]) && a[1][2].equals(a[1][0])) {
				a[1][0] = s;
				a[1][1] = s;
				a[1][2] = s;
			}
			if (a[2][0].equals(a[2][1]) && a[2][2].equals(a[2][0])) {
				a[2][0] = s;
				a[2][1] = s;
				a[2][2] = s;
			}

			if (a[0][0].equals(a[1][0]) && a[2][0].equals(a[0][0])) {
				a[0][0] = s;
				a[1][0] = s;
				a[2][0] = s;
			}
			if (a[0][1].equals(a[1][1]) && a[2][1].equals(a[0][0])) {
				a[0][1] = s;
				a[1][1] = s;
				a[2][1] = s;
			}
			if (a[0][2].equals(a[1][2]) && a[2][2].equals(a[0][0])) {
				a[0][2] = s;
				a[1][2] = s;
				a[2][2] = s;
			}
			System.out.println("現在のパネル");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(a[i][j]);
				}
				System.out.println();
			}
		}
	}

}

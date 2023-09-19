package ArrQuestion;

import java.util.Scanner;

public class seisaku02 {

	public static void main(String[] args) {
		int[] typhoon = { 1, 1, 0, 0, 0, 1, 4, 5, 6, 4, 6, 1, };
		int[] zisin = { 153, 127, 130, 109, 118, 164, 130, 103, 103, 104, 123, 141 };
		int[] kouaui = { 20, 58, 107, 87, 114, 187, 200, 59, 169, 441, 158, 94 };
		Scanner stdIn = new Scanner(System.in);
		System.out.println("見たい情報 10地震 20台風 30降水");
		int a = stdIn.nextInt();
		switch (a) {
		case 10:
			System.out.println("情報を設定 1年別、2月別");
			int i = stdIn.nextInt();
			switch (i) {
			case 1:
				System.out.println("ごうけい");
				System.out.println(zisin[0] + zisin[1] + zisin[2] + zisin[3] + zisin[4] + zisin[5] + zisin[6] + zisin[7]
						+ zisin[8] + zisin[9] + zisin[10] + zisin[11]);
				break;
			case 2:
				System.out.println("月を入力");
				int z = stdIn.nextInt();
				for (int c = 0; 0 <= 11; c++) {
					if (c == z - 1) {
						System.out.println(c + 1 + "月の発生件数" + zisin[c]);
						break;
					}
					if (c == z - 1) {
						System.out.println(c + 1 + "月の発生件数" + zisin[c]);
						break;
					}
					if (c == z - 1) {
						System.out.println(c + 1 + "月の発生件数" + zisin[c]);
						break;
					}
					if (c == z - 1) {
						System.out.println(c + 1 + "月の発生件数" + zisin[c]);
						break;
					}
					if (c == z - 1) {
						System.out.println(c + 1 + "月の発生件数" + zisin[c]);
						break;
					}
					if (c == z - 1) {
						System.out.println(c + 1 + "月の発生件数" + zisin[c]);
						break;
					}
					if (c == z - 1) {
						System.out.println(c + 1 + "月の発生件数" + zisin[c]);
						break;
					}
					if (c == z - 1) {
						System.out.println(c + 1 + "月の発生件数" + zisin[c]);
						break;
					}
					if (c == z - 1) {
						System.out.println(c + 1 + "月の発生件数" + zisin[c]);
						break;
					}
					if (c == z - 1) {
						System.out.println(c + 1 + "月の発生件数" + zisin[c]);
						break;
					}
					if (c == z - 1) {
						System.out.println(c + 1 + "月の発生件数" + zisin[c]);
						break;
					}
					if (c == z - 1) {
						System.out.println(c + 1 + "月の発生件数" + zisin[c]);
						break;
					}
				}
			case 20:
				System.out.println("情報を設定 １年別 ２月別");
				int o = stdIn.nextInt();
				switch (o) {
				case 1:
					System.out.println("合計");
					System.out.println(typhoon[0] + typhoon[1] + typhoon[2] + typhoon[3] + typhoon[4] + typhoon[5]
							+ typhoon[6] + typhoon[7] + typhoon[8] + typhoon[9] + typhoon[10] + typhoon[11]);
					break;
				case 2:
					System.out.println("月を入力");
					int y = stdIn.nextInt();
					for (int b = 0; 0 <= 11; b++) {
						if (b == y - 1) {
							System.out.println(b + 1 + "月の発生件数" + typhoon[b]);
							break;
						}
						if (b == y - 1) {
							System.out.println(b + 1 + "月の発生件数" + typhoon[b]);
							break;
						}
						if (b == y - 1) {
							System.out.println(b + 1 + "月の発生件数" + typhoon[b]);
							break;
						}
						if (b == y - 1) {
							System.out.println(b + 1 + "月の発生件数" + typhoon[b]);
							break;
						}
						if (b == y - 1) {
							System.out.println(b + 1 + "月の発生件数" + typhoon[b]);
							break;
						}
						if (b == y - 1) {
							System.out.println(b + 1 + "月の発生件数" + typhoon[b]);
							break;
						}
						if (b == y - 1) {
							System.out.println(b + 1 + "月の発生件数" + typhoon[b]);
							break;
						}
						if (b == y - 1) {
							System.out.println(b + 1 + "月の発生件数" + typhoon[b]);
							break;
						}
						if (b == y - 1) {
							System.out.println(b + 1 + "月の発生件数" + typhoon[b]);
							break;
						}
						if (b == y - 1) {
							System.out.println(b + 1 + "月の発生件数" + typhoon[b]);
							break;
						}
						if (b == y - 1) {
							System.out.println(b + 1 + "月の発生件数" + typhoon[b]);
							break;
						}
						if (b == y - 1) {
							System.out.println(b + 1 + "月の発生件数" + typhoon[b]);
							break;
						}
					}
				case 30:
					System.out.println("情報を設定 1年別、2月別");
					int p = stdIn.nextInt();
					switch (p) {
					case 1:
						System.out.println("合計");
						System.out.println(kouaui[0] + kouaui[1] + kouaui[2] + kouaui[3] + kouaui[4] + kouaui[5]
								+ kouaui[6] + kouaui[7] + kouaui[8] + kouaui[9] + kouaui[10] + kouaui[11]);
						break;
					case 2:
						System.out.println("月を入力");
						int m = stdIn.nextInt();
						for (int d = 0; 0 <= 11; d++) {
							if (d == m - 1) {
								System.out.println(d + 1 + "月の発生件数" + kouaui[d]);
								break;
							}
							if (d == m - 1) {
								System.out.println(d + 1 + "月の発生件数" + kouaui[d]);
								break;
							}
							if (d == m - 1) {
								System.out.println(d + 1 + "月の発生件数" + kouaui[d]);
								break;
							}
							if (d == m - 1) {
								System.out.println(d + 1 + "月の発生件数" + kouaui[d]);
								break;
							}
							if (d == m - 1) {
								System.out.println(d + 1 + "月の発生件数" + kouaui[d]);
								break;
							}
							if (d == m - 1) {
								System.out.println(d + 1 + "月の発生件数" + kouaui[d]);
								break;
							}
							if (d == m - 1) {
								System.out.println(d + 1 + "月の発生件数" + kouaui[d]);
								break;
							}
							if (d == m - 1) {
								System.out.println(d + 1 + "月の発生件数" + kouaui[d]);
								break;
							}
							if (d == m - 1) {
								System.out.println(d + 1 + "月の発生件数" + kouaui[d]);
								break;
							}
							if (d == m - 1) {
								System.out.println(d + 1 + "月の発生件数" + kouaui[d]);
								break;
							}
							if (d == m - 1) {
								System.out.println(d + 1 + "月の発生件数" + kouaui[d]);
								break;
							}
							if (d == m - 1) {
								System.out.println(d + 1 + "月の発生件数" + kouaui[d]);
								break;
							}
						}
					}
				case 40:
					for (int gt=0;gt<=11;gt++) {
						if (gt == 0) {
							System.out.println(a+1+"月の発生件数"+typhoon[gt]);
						}
						if (gt == 1) {
							System.out.println(a+1+"月の発生件数"+typhoon[gt]);
						}
						if (gt == 2) {
							System.out.println(a+1+"月の発生件数"+typhoon[gt]);
						}
						if (gt == 3) {
							System.out.println(a+1+"月の発生件数"+typhoon[gt]);
						}
						if (gt == 4) {
							System.out.println(a+1+"月の発生件数"+typhoon[gt]);
						}
						if (gt == 5) {
							System.out.println(a+1+"月の発生件数"+typhoon[gt]);
						}
						if (gt == 6) {
							System.out.println(a+1+"月の発生件数"+typhoon[gt]);
						}
						if (gt == 7) {
							System.out.println(a+1+"月の発生件数"+typhoon[gt]);
						}
						if (gt == 8) {
							System.out.println(a+1+"月の発生件数"+typhoon[gt]);
						}
						if (gt == 9) {
							System.out.println(a+1+"月の発生件数"+typhoon[gt]);
						}
						if (gt == 10) {
							System.out.println(a+1+"月の発生件数"+typhoon[gt]);
						}
						if (gt == 11) {
							System.out.println(a+1+"月の発生件数"+typhoon[gt]);
						}
						
						
					}

				}
			
			}

		}

	}

}

package course55;

import java.util.Scanner;

public class TuphoonControll {

	public static void main(String[] args) {
		Scanner uti = new Scanner(System.in);
		Typhoon typ10 = new Typhoon(0, "aa", "a");
		Typhoon typ11 = new Typhoon(0, "aa", "a");
		Typhoon typ12 = new Typhoon(0, "aa", "a");
		Typhoon typ13 = new Typhoon(0, "aa", "a");
		Typhoon typ14 = new Typhoon(0, "aa", "a");
		Typhoon typ15 = new Typhoon(0, "aa", "a");
		Typhoon typ1 = new Typhoon(1, "2022年4月8日", "マラカス");
		Typhoon typ2 = new Typhoon(2, "2022年4月10日", "メーギー");
		Typhoon typ3 = new Typhoon(3, "2022年6月30日", "チャバ");
		Typhoon typ4 = new Typhoon(4, "2022年7月1日", "アイレー");
		Typhoon typ5 = new Typhoon(5, "2022年7月28日", "ソングダー");
		Typhoon typ6 = new Typhoon(6, "2022年7月31日", "トローセス");
		Typhoon typ7 = new Typhoon(7, "2022年8月9日", "ムーラン");
		Typhoon typ8 = new Typhoon(8, "2022年8月12日", "メアリー");
		Typhoon typ9 = new Typhoon(9, "2022年8月22日", "マーゴン");

		Typhoon[] typh = new Typhoon[15];
		typh[0] = typ1;
		typh[1] = typ2;
		typh[2] = typ3;
		typh[3] = typ4;
		typh[4] = typ5;
		typh[5] = typ6;
		typh[6] = typ7;
		typh[7] = typ8;
		typh[8] = typ9;
		typh[9] = typ10;
		typh[10] = typ11;
		typh[11] = typ12;
		typh[12] = typ13;
		typh[13] = typ14;
		typh[14] = typ15;

		for (int i = 0; i <= 14; i++) {
			if (typh[i].getAsiaName().equals("a")) {
				break;
			} else
				Typhoon.hyo(typh[i].getAsiaName(), i);
		}
		System.out.println("編集をするなら99新規追加は55を選択");
		int sag = uti.nextInt();
		if (sag == 99) {
			System.out.println("台風の名前を変更しまtyu");
			System.out.println("変えたい台風の番号の指定");
			int kae = uti.nextInt();
			System.out.println("名前を入力");
			String kae2 = uti.next();
			typh[kae - 1].setAsiaName(kae2);
			for (int f = 0; f <= 14; f++) {
				if (typh[f].getAsiaName().equals("a")) {
					break;
				} else
					Typhoon.hyo(typh[f].getAsiaName(), f);
			}
		}
		if (sag == 55) {
			System.out.println("追加したい台風の番号を入力");
			int at = uti.nextInt();
			System.out.println("発生日を入力");
			String na = uti.next();
			System.out.println("台風の名前を入力");
			String nama = uti.next();
			for (int j = 0; j <= 14; j++) {
				if (typh[j].getAsiaName().equals("a")) {
					typh[j].setAsiaName(nama);
					typh[j].setHasseibi(na);
					typh[j].setTyphoonbango(at);
					break;
				}
			}

			for (int s = 0; s <= 14; s++) {
				if (typh[s].getAsiaName().equals("a")) {
					break;
				} else
					Typhoon.hyo(typh[s].getAsiaName(), s);
			}

		}

	}

}

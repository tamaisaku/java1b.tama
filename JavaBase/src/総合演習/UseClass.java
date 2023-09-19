package 総合演習;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Trainer tre = new Trainer();

		for (int tan = 0; tan <= 9999; tan++) {
			System.out.println("どれにする？");
			System.out.print("１捕獲　２図鑑を見る");
			System.out.print("３バトル");
			System.out.println("終わりなら９９");
			int senta = stdIn.nextInt();
			if (senta == 99) {
				break;
			}
			switch (senta) {
			//捕獲
			case 1:
				System.out.println("捕獲するポケモンの名前を入力");
				String namae = stdIn.next();
				System.out.println("ポケモンのタイプを入力");
				System.out.print("1炎,2水,3地面,4草");
				int taip = stdIn.nextInt();
				System.out.println("戦闘力を入力");
				int senryo = stdIn.nextInt();
				System.out.println("捕獲難易度を入力");
				int nanid = stdIn.nextInt();

				Pocketon poke = new Pocketon(namae, taip, senryo, nanid);

				tre.capture(poke);
				System.out.println("６体まで保存可能");
				tre.display();
				break;

			//図鑑を見る	
			case 2:

				tre.display();
				break;

			//バトル	
			case 3:

				//.equals
				Battle bto = new Battle();
				String bato1 = stdIn.next();
				String bato2 = stdIn.next();

				if (tre.myPockes[0] == (null)) {
				} else {
					if (bato1.equals(tre.myPockes[0].name) && bato2.equals(tre.myPockes[1].name)) {
						String kati = bto.doBattle(tre.myPockes[0], tre.myPockes[1]);
						System.out.println(kati + "の勝利");

						break;
					}
					if (bato1.equals(tre.myPockes[0].name) && bato2.equals(tre.myPockes[2].name)) {
						String kati = bto.doBattle(tre.myPockes[0], tre.myPockes[2]);
						System.out.println(kati + "の勝利");
						break;
					}
					if (bato1.equals(tre.myPockes[0].name) && bato2.equals(tre.myPockes[3].name)) {
						String kati = bto.doBattle(tre.myPockes[0], tre.myPockes[3]);
						System.out.println(kati + "の勝利");
						break;
					}
					if (bato1.equals(tre.myPockes[0].name) && bato2.equals(tre.myPockes[4].name)) {
						String kati = bto.doBattle(tre.myPockes[0], tre.myPockes[4]);
						System.out.println(kati + "の勝利");
						break;
					}
					if (bato1.equals(tre.myPockes[0].name) && bato2.equals(tre.myPockes[5].name)) {
						String kati = bto.doBattle(tre.myPockes[0], tre.myPockes[5]);
						System.out.println(kati + "の勝利");
						break;
					}
				}

				if (tre.myPockes[1] == (null)) {
				} else {
					if (tre.myPockes[0] == (null)) {
						if (bato1.equals(tre.myPockes[1].name) && bato2.equals(tre.myPockes[0].name)) {
							String kati = bto.doBattle(tre.myPockes[1], tre.myPockes[0]);
							System.out.println(kati + "の勝利");
							break;
						}
					}
					if (tre.myPockes[2] == (null)) {
						if (bato1.equals(tre.myPockes[1].name) && bato2.equals(tre.myPockes[2].name)) {
							String kati = bto.doBattle(tre.myPockes[1], tre.myPockes[2]);
							System.out.println(kati + "の勝利");
							break;
						}
					}
					if (bato1.equals(tre.myPockes[1].name) && bato2.equals(tre.myPockes[3].name)) {
						String kati = bto.doBattle(tre.myPockes[1], tre.myPockes[3]);
						System.out.println(kati + "の勝利");
						break;
					}
					if (bato1.equals(tre.myPockes[1].name) && bato2.equals(tre.myPockes[4].name)) {
						String kati = bto.doBattle(tre.myPockes[1], tre.myPockes[4]);
						System.out.println(kati + "の勝利");
						break;
					}
					if (bato1.equals(tre.myPockes[1].name) && bato2.equals(tre.myPockes[5].name)) {
						String kati = bto.doBattle(tre.myPockes[1], tre.myPockes[5]);
						System.out.println(kati + "の勝利");
						break;
					}
				}

				if (tre.myPockes[2] == (null)) {
				} else {
					if (tre.myPockes[1] == (null)) {
					} else if (bato1.equals(tre.myPockes[2].name) && bato2.equals(tre.myPockes[1].name)) {
						String kati = bto.doBattle(tre.myPockes[2], tre.myPockes[1]);
						System.out.println(kati + "の勝利");
						break;
					}
					if (tre.myPockes[0] == (null)) {
					} else if (bato1.equals(tre.myPockes[2].name) && bato2.equals(tre.myPockes[0].name)) {
						String kati = bto.doBattle(tre.myPockes[2], tre.myPockes[0]);
						System.out.println(kati + "の勝利");
						break;
					}
					if (tre.myPockes[3] == (null)) {
					} else if (bato1.equals(tre.myPockes[2].name) && bato2.equals(tre.myPockes[3].name)) {
						String kati = bto.doBattle(tre.myPockes[2], tre.myPockes[3]);
						System.out.println(kati + "の勝利");
						break;
					}
					if (tre.myPockes[4] == (null)) {
					} else if (bato1.equals(tre.myPockes[2].name) && bato2.equals(tre.myPockes[4].name)) {
						String kati = bto.doBattle(tre.myPockes[2], tre.myPockes[4]);
						System.out.println(kati + "の勝利");
						break;
					}
					if (tre.myPockes[5] == (null)) {
					} else if (bato1.equals(tre.myPockes[2].name) && bato2.equals(tre.myPockes[5].name)) {
						String kati = bto.doBattle(tre.myPockes[2], tre.myPockes[5]);
						System.out.println(kati + "の勝利");
						break;
					}
				}

				if (tre.myPockes[3] == (null)) {
				} else {
					if (tre.myPockes[1] == (null)) {
					} else if (bato1.equals(tre.myPockes[3].name) && bato2.equals(tre.myPockes[1].name)) {
						String kati = bto.doBattle(tre.myPockes[3], tre.myPockes[1]);
						System.out.println(kati + "の勝利");
						break;
					}
					if (tre.myPockes[0] == (null)) {
					} else if (bato1.equals(tre.myPockes[3].name) && bato2.equals(tre.myPockes[0].name)) {
						String kati = bto.doBattle(tre.myPockes[3], tre.myPockes[0]);
						System.out.println(kati + "の勝利");
						break;
					}
					if (tre.myPockes[2] == (null)) {
					} else if (bato1.equals(tre.myPockes[3].name) && bato2.equals(tre.myPockes[2].name)) {
						String kati = bto.doBattle(tre.myPockes[3], tre.myPockes[2]);
						System.out.println(kati + "の勝利");
						break;
					}
					if (tre.myPockes[4] == (null)) {
					} else if (bato1.equals(tre.myPockes[3].name) && bato2.equals(tre.myPockes[4].name)) {
						String kati = bto.doBattle(tre.myPockes[3], tre.myPockes[4]);
						System.out.println(kati + "の勝利");
						break;
					}
					if (tre.myPockes[5] == (null)) {
					} else if (bato1.equals(tre.myPockes[3].name) && bato2.equals(tre.myPockes[5].name)) {
						String kati = bto.doBattle(tre.myPockes[3], tre.myPockes[5]);
						System.out.println(kati + "の勝利");
						break;
					}
				}

				if (tre.myPockes[4] == (null)) {
				} else {
					if (tre.myPockes[1] == (null)) {
					} else if (bato1.equals(tre.myPockes[4].name) && bato2.equals(tre.myPockes[1].name)) {
						String kati = bto.doBattle(tre.myPockes[4], tre.myPockes[1]);
						System.out.println(kati + "の勝利");
						break;
					}
					if (tre.myPockes[2] == (null)) {
					} else if (bato1.equals(tre.myPockes[4].name) && bato2.equals(tre.myPockes[2].name)) {
						String kati = bto.doBattle(tre.myPockes[4], tre.myPockes[2]);
						System.out.println(kati + "の勝利");
						break;
					}
					if (tre.myPockes[3] == (null)) {
					} else if (bato1.equals(tre.myPockes[4].name) && bato2.equals(tre.myPockes[3].name)) {
						String kati = bto.doBattle(tre.myPockes[4], tre.myPockes[3]);
						System.out.println(kati + "の勝利");
						break;
					}
					if (tre.myPockes[0] == (null)) {
					} else if (bato1.equals(tre.myPockes[4].name) && bato2.equals(tre.myPockes[0].name)) {
						String kati = bto.doBattle(tre.myPockes[4], tre.myPockes[0]);
						System.out.println(kati + "の勝利");
						break;
					}
					if (tre.myPockes[5] == (null)) {
					} else if (bato1.equals(tre.myPockes[4].name) && bato2.equals(tre.myPockes[5].name)) {
						String kati = bto.doBattle(tre.myPockes[4], tre.myPockes[5]);
						System.out.println(kati + "の勝利");
						break;
					}
				}

				if (tre.myPockes[5] == (null)) {
				} else {
					if (tre.myPockes[1] == (null)) {
					} else if (bato1.equals(tre.myPockes[5].name) && bato2.equals(tre.myPockes[1].name)) {
						String kati = bto.doBattle(tre.myPockes[5], tre.myPockes[1]);
						System.out.println(kati + "の勝利");
						break;
					}
					if (tre.myPockes[2] == (null)) {
					} else if (bato1.equals(tre.myPockes[5].name) && bato2.equals(tre.myPockes[2].name)) {
						String kati = bto.doBattle(tre.myPockes[5], tre.myPockes[2]);
						System.out.println(kati + "の勝利");
						break;
					}
					if (tre.myPockes[3] == (null)) {
					} else if (bato1.equals(tre.myPockes[5].name) && bato2.equals(tre.myPockes[3].name)) {
						String kati = bto.doBattle(tre.myPockes[5], tre.myPockes[3]);
						System.out.println(kati + "の勝利");
						break;
					}
					if (tre.myPockes[4] == (null)) {
					} else if (bato1.equals(tre.myPockes[5].name) && bato2.equals(tre.myPockes[4].name)) {
						String kati = bto.doBattle(tre.myPockes[5], tre.myPockes[4]);
						System.out.println(kati + "の勝利");
						break;
					}
					if (tre.myPockes[0] == (null)) {
					} else if (bato1.equals(tre.myPockes[5].name) && bato2.equals(tre.myPockes[0].name)) {
						String kati = bto.doBattle(tre.myPockes[5], tre.myPockes[0]);
						System.out.println(kati + "の勝利");
						break;
					}
				}

				break;

			}
		}

	}

}

package course28;

import java.util.Random;
import java.util.Scanner;

public class sentou {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rnd =new Random();
		chr numata=new chr();
		numata.name="沼";
		numata.attck=35;
		numata.hp=1000;
		numata.def=349;
		numata.kyouki=30;
		
		chr2 kajima=new chr2();
		System.out.println("自分の名前の設定");
		kajima.name=stdIn.next();
		kajima.attck=40;
		kajima.hp=500;
		kajima.def=500;	
		kajima.agi=5;
		System.out.println("ボス戦");
				for(int t=1;t<=99;t++) {
					System.out.println("行動を選択１攻撃２守りアップ３回避率アップ");
					int a=stdIn.nextInt();
					switch(a) {
					case 1:
						kajima.naguru2(kajima,numata);
						System.out.println(numata.name+numata.hp);
						String k= stdIn.nextLine();
						if(numata.hp<=0) {
							break;
						}
						break;
					case 2:
						kajima.mamori2(kajima);
						String k1= stdIn.nextLine();
						break;
					case 3:
						kajima.niger(kajima);
						String k4= stdIn.nextLine();
					}
					if(numata.hp<=0) {
						break;
					}
					System.out.println(numata.name+"のターン");
					int b=rnd.nextInt(2)+1;
					switch(b) {
					case 1:
						numata.naguru(numata,kajima);
						System.out.println(kajima.name+"体力"+kajima.hp);
						String k2= stdIn.nextLine();
						if(kajima.hp<=0) {
							break;
						}
						break;
					case 2:
						numata.mamori(numata);
						String k3= stdIn.nextLine();
					}
					if(kajima.hp<=0) {
						break;
					}
				}
				if(kajima.hp<=0) {
					System.out.println("ゲームオーバー");
				}
				if(numata.hp<=0) {
					System.out.println("ゲームクリア");
				}
			
		//Random rnd =new Random();
				//int a=rnd.nextInt(100)+pl.agi;

	}

}

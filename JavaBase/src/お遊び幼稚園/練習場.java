package お遊び幼稚園;

import java.util.Random;
import java.util.Scanner;

public class 練習場 {

	public static void main(String[] args) {
		System.out.println("ハイカード");
		int syozi=1000;
		int syouri=0;
		int haissya=0;
		System.out.println("現在の所持金は"+syozi+"です");
		for(int g=0;g<9999;g++) {
		int rand=kaad();
		System.out.println("カードは["+rand+"]です");
		System.out.println("これより高い？　低い？");
		System.out.println("高い１　低い２");
		Scanner stdIn = new Scanner(System.in);
		int rand2=kaad();
		if(rand==rand2) {
			rand=kaad();
			System.out.println("同じでした　もう一度");
			System.out.println("高い１　低い２");
			System.out.println("["+rand+"]");
			rand2=kaad();
		}
		int b=stdIn.nextInt();
		switch(b) {
		case 1:
			if(rand<rand2) {
				System.out.println("あたり");
				System.out.println("["+rand2+"]でした");
				if(rand>=10) {
					syozi=syozi*3;
					syouri=syouri+1;
					break;
				}
				syouri=syouri+1;
				syozi=syozi*2;
			}else {
				System.out.println("はずれ");
				System.out.println("["+rand2+"]でした");
				haissya=haissya+1;
			    syozi=syozi/2;
			}
			break;
		case 2:
			if(rand>rand2) {
				System.out.println("あたり");
				System.out.println("["+rand2+"]でした");
				if(rand<=4) {
					syouri=syouri+1;
					syozi=syozi*3;
					break;
				}
				syouri=syouri+1;
				syozi=syozi*2;
			}else {
				System.out.println("はずれ");
				System.out.println("["+rand2+"]でした");
				haissya=haissya+1;
			    syozi=syozi/2;
			}
		}
		System.out.println("現在の所持金は"+syozi+"です");
		System.out.println("続ける？");
		System.out.println("続ける１　続けない９９９９");
		int tudu=stdIn.nextInt();
		g=tudu;
		}
		System.out.println("最終所持金は"+syozi+"です");
		System.out.println("最終勝利数"+syouri);
		System.out.println("最終敗北数"+haissya);
		int t=0;
		int ritu=ritu2(syouri,haissya);
		System.out.println(""+ritu+"%");
	}
	static int kaad() {
		Random rnd =new Random();
		int a=rnd.nextInt(13)+1;
		int num=a;
		return num;
	}
	static int ritu2(int x,int y) {
		int h=x+y;
		int f=h/x;
		return f;
	}

}

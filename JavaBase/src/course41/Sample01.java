package course41;

import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		String moji="模擬テスト。100点取ります";
		System.out.println(moji);
		
		int x=50;
		int y=100;
		int z=x*y;
		System.out.println(z);
		
		Scanner utiko=new Scanner(System.in);
		String kakiko=utiko.next();
		System.out.println(kakiko);
		
		for(int ru=1;ru<=5;ru++) {
			System.out.println(ru+"回目のループです。");
		}
		
		int kakiko2=utiko.nextInt();
		if(kakiko2<=50) {
			System.out.println("50以上です");
		}else {
			System.out.println("49以下です");
		}
		
		boolean isRaining=true;
		if(isRaining) {
			System.out.println("傘持ってけーー");
		}else {
			System.out.println("よい一日を");
		}
		
		int[] numArr=new int[5];
		numArr[0]=10;
		numArr[1]=50;
		numArr[2]=30;
		numArr[3]=20;
		numArr[4]=40;
		
		for(int ru=0;ru<=4;ru++) {
			System.out.println(numArr[ru]);
		}
		
		int kae=numArr[4];
		numArr[4]=numArr[1];
		numArr[1]=kae;
		
		int kakiko3=utiko.nextInt();
		int[] variable=new int[kakiko3];
		
		int[] numExArr=new int[5];
		numExArr[0]=10;  //0,1,2,3,4
		numExArr[1]=50;
		numExArr[2]=30;
		numExArr[3]=20;
		numExArr[4]=40;
		int zur0=numExArr[0];
		int zur1=numExArr[1];
		int zur2=numExArr[2];
		int zur3=numExArr[3];
		int zur4=numExArr[4];
		numExArr[0]=zur1;
		numExArr[1]=zur2;
		numExArr[2]=zur3;
		numExArr[3]=zur4;
		numExArr[4]=zur0;
		
		mogi();
		
		calc(10,40);
		
		String uketo=mojicon("あ！！");
		System.out.println(uketo);
		
		

	}
	static void mogi() {
		System.out.println("メソッド問題");
	}
	
	static void calc(int a,int b) {
		System.out.println(a+b);
	}
	
	static String mojicon(String moji) {
		String concated=moji+"受け取りました";
		return concated;
	}

}

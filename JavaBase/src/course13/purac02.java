package course13;

import java.util.Scanner;

public class purac02 {

	public static void main(String[] args) {
		//6
		Scanner stdIn = new Scanner(System.in);
		System.out.println("数値を入力してね");
		
		int y=stdIn.nextInt();
		
		for(int i=0;i<=y;i++) {
			System.out.println("現在"+i+"回目のループです");
		}
		//7
		System.out.println("第二問");
		System.out.println("数値入力すう");
		int a=stdIn.nextInt();
		for(int b=0;b<=a;b++) {
			int c=b%2;
			if(c==0) {
			System.out.println("偶数やね");
			}else
				System.out.println("奇数じゃね");
			if(b>100) {
				System.out.println("どんだけ回すんや");
			}
			System.out.println(b);
		}

	}

}

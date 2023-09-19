package course35;

import java.util.Scanner;

public class prac {

	public static void main(String[] args) {
		 Scanner stdIn = new Scanner(System.in);
		 System.out.println("数理の入力");
			int x=stdIn.nextInt();
			if(x>=50) {
				System.out.println("合成する通理入力や");
				int y=stdIn.nextInt();
				calc(x,y);
			}else {
			calc(x);
			}

	}
	static void calc(int a,int b) {
		System.out.println("合成"+(a+b));
	}
	static void calc(int a) {
		System.out.println("10べぇにしてけぇしたる"+(a*10));
	}

}

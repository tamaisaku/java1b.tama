package course15;

import java.util.Random;
import java.util.Scanner;

public class pea2 {

	public static void main(String[] args) {
		System.out.println("所持金１００００");
		int i=10000;
		Random rnd =new Random();
		int num=rnd.nextInt(7)+1;
		int num2=rnd.nextInt(7)+1;
		int num3=rnd.nextInt(7)+1;
		Scanner stdIn = new Scanner(System.in);
		while(i<=50000) {
			System.out.println("掛け金を設定してください");
			int a = stdIn.nextInt();
			System.out.print(num+" ");
			System.out.print(num2+" ");
			System.out.print(num3);
			System.out.println();
			int num4=num+num2+num3;
			int num5=num4%3;
			if(num5==0&&num4<=18) {
				System.out.println("ゾロ目");
				int c=a*3+i;
			}
			switch(num4) {
			case 3:
				System.out.println("ピンゾロ");
				int b=a*5+i;
			case 6:
				System.out.println("ゾロ目");
				int c=a*3+i;
			case 9:
				System.out.println("ゾロ目");
				int c2=a*3+i;
			case 12:
				System.out.println("ゾロ目");
				int c3=a*3+i;
			case 15:
				System.out.println("ゾロ目");
				int c4=a*3+i;
			
				System.out.println("ゾロ目");
				int c5=a*3+i;
			}
		}

	}

}

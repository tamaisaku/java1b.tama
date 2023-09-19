package course19;

import java.util.Random;
import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		Random rnd =new Random();
		//なれよう問題５
		int[]numArray=new int[3];
		numArray[0]=10;
		numArray[1]=11;
		numArray[2]=12;
		for(int a=0;a<3;a++) {
			System.out.println(numArray[a]);
			
		}
		//なれよう問題６
		System.out.println("数字入力");
		Scanner stdIn = new Scanner(System.in);
		int x=stdIn.nextInt();
		int y=stdIn.nextInt();
		int z=stdIn.nextInt();
		int[]num= {x,y,z,x+y+z};
		for(int o=0;o<4;o++) {
			System.out.println(num[o]);
		}
		int u=1;
		int[]logicArray= {100,50,75,80,65};
		for(int t=0;t<5;t++) {
			
			if(logicArray[t]<=0) {
				System.out.println(logicArray[t]);
			}
		}
		int num1=rnd.nextInt(100)+1;
		int num2=rnd.nextInt(500)+1;
		int num3=rnd.nextInt(1000)+1;
		int[]num4= {num1,num2,num3,num1+num2+num3};
		System.out.println(num4[0]);
		System.out.println(num4[1]);
		System.out.println(num4[2]);
		System.out.println(num4[3]);

	}

}

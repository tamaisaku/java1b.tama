package course19;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		//なれよう問題
		String[]mygroup=new String[3];
		mygroup[0]="やすだ";
		mygroup[1]="いとう";
		mygroup[2]="わたべ";
		for(int a=0;a<=2;a++)
		System.out.println(mygroup[a]);
		
		//なれよう問題２
		int[]mygroupnum=new int[3];
		mygroupnum[0]=26;
		mygroupnum[1]=2;
		mygroupnum[2]=99;
		for(int i=0;i<=2;i++)
		System.out.println(mygroupnum[i]);
		
		//なれよう問題３
		int[]myNum=new int[3];
		myNum[0]=10;
		myNum[1]=50;
		myNum[2]=myNum[0]+myNum[1];
		for(int b=0;b<=2;b++)
			System.out.println(myNum[b]);
		System.out.println("数字打て");
		Scanner stdIn = new Scanner(System.in);
		int[]myNumScan=new int[3];
		myNumScan[0]=10;
		myNumScan[1]=stdIn.nextInt();
		myNumScan[2]=myNumScan[0]+myNumScan[1];
		for(int d=0;d<=2;d++)
			System.out.println(myNumScan[d]);

	}

}

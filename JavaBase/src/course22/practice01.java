package course22;

import java.util.Arrays;

public class practice01 {

	public static void main(String[] args) {
		String[][] arr= new String[3][3];
		arr[0][0]="o";
		arr[0][1]="x";
		arr[0][2]="o";
		
		arr[1][0]="x";
		arr[1][1]="o";
		arr[1][2]="x";
		
		arr[2][0]="o";
		arr[2][1]="o";
		arr[2][2]="o";
		System.out.println(arr[2][1]);
		System.out.println(Arrays.deepToString(arr));
		int count=0;
		for(int ar=0;ar<3;ar++) {
			for(int a=0;a<3;a++) {
				System.out.println("現在の要素は"+arr[ar][a]);
				if(arr[ar][a].equals("o")) {
					count=count+1;
				}
			}
			System.out.println();
		}
		System.out.println(count);
		

	}

}

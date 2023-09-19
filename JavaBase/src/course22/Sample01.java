package course22;

import java.util.Arrays;

public class Sample01 {

	public static void main(String[] args) {
		int i=0;
		//座標の概念にできる
		int[][] arr=new int[3][3];
		
		arr[0][0]=i;
		arr[0][1]=20;
		arr[0][2]=30;
		
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		
		arr[2][0]=70;
		arr[2][1]=80;
		arr[2][2]=90;
		
		System.out.println(arr[1][0]);
		//すべて表示
		System.out.println(Arrays.deepToString(arr));
		
		

	}

}

package course34;

import java.util.Random;
import java.util.Scanner;

public class Smple02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//int a=stdIn.nextInt();
		Random rnd =new Random();
		String b="練習問題";
		String moji=prapra(b);
		System.out.println(moji);
		
		
		

	}
	static String prapra(String a) {
		String main=(a+"を受け取りました");
		return main;
	}
	
	
	
	
	

}

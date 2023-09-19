package course05;

import java.util.Scanner;

public class Sample01 {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.println("xとyを加算します");

		System.out.println("xの値を入力してください");
		//変数「X」に入力された内容が
		//格納される(yも同様)
		int x = stdIn.nextInt();

		System.out.println("yの値を入力してください");

		int y = stdIn.nextInt();

		System.out.println("x + y =" + (x + y));
		//練習問題　int zを作成し入力しなさい
		System.out.println("zの値を入力しろや");
		int z = stdIn.nextInt();
		System.out.println(z);
		System.out.println("aの値を打ち込みなさい");
		double a = stdIn.nextDouble();
		System.out.println("ｂの値を打ち込みな");
		double b = stdIn.nextDouble();
		System.out.println(a + b);
	}
}
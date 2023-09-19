package course40;

import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		int number=15;
		if(number>=10) {
			System.out.println("でか");
		}
		
		int age=20;
		if(age>=18) {
			System.out.println("大人っすね");
		}else {
			System.out.println("キッズだね");
		}
		
		int score=85;
		if(score>=90) {
			System.out.println("Excellent");
		}else if(score>=80) {
			System.out.println("Good");
		}else {
			System.out.println("勉強しましょう");
		}
		
		boolean isRaining=true;
		if(isRaining) {
			System.out.println("傘持ってけーー");
		}else {
			System.out.println("よい一日を");
		}
		
		Scanner erabu=new Scanner(System.in);
		int num=erabu.nextInt();
		if(num%2==0) {
			System.out.println("偶数ですぞ");
		}else if(num%3==0) {
			System.out.println("奇数ですな");
		}
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		for(int a=1;a<=100;a++) {
			if(a%2==0) {
				System.out.println("現在"+a+"回目のループです。偶数です");
			}
		}
		
		for(int b=10;b>=1;b--) {
			System.out.println(b);
		}
		
		int sum=0;
		for(int x=1;x<=100;x++) {
			sum=sum+x;
		}
		System.out.println("合計は"+sum+"です");

	}

}

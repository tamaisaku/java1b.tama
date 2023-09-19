package 気になる小学校;
//java@tAira0904
import java.util.Random;
import java.util.Scanner;

public class batol {
	アイフォン[] aifo;
	敵[] teki;

	batol() {
		aifo = new アイフォン[1];
		teki = new 敵[2];
	}

	void hozon(アイフォン ai, 敵 te) {
		aifo[0] = ai;
		teki[0] = te;
	}

	String batl(アイフォン ai, 敵 te) {
		System.out.println(te.name+"とあたった");
		for (int i = 1; i <= 99; i++) {
			Random rad = new Random();
			Scanner scan = new Scanner(System.in);
			System.out.println(i + "ターン目");
			String l=scan.nextLine();
			ai.haya = rad.nextInt();
			te.haya = rad.nextInt();
			if (ai.haya >= te.haya) {
				System.out.println("1・攻撃");
				System.out.println("1以外・魔法");
				int sen = scan.nextInt();
				if (sen == 1) {
					te.hp=te.hp-(ai.attac/(ai.attac/te.difen));
					String l2=scan.nextLine();
					System.out.println("体力・"+Math.ceil(te.hp));
					String l3=scan.nextLine();
				} else {
					System.out.println("メンテ中");
					String l4=scan.nextLine();
				}
			}else {
				int sem=rad.nextInt(2)+1;
				if (sem == 1) {
					ai.hp=ai.hp-(te.attac/(te.attac/ai.difen));
					System.out.println(te.name+"の攻撃");
					String l5=scan.nextLine();
					System.out.println("体力・"+Math.ceil(ai.hp));
					String l6=scan.nextLine();
				} else {
					System.out.println("メンテ中");
					String l7=scan.nextLine();
				}
			}
			
			if(te.hp<=0) {
				System.out.println(te.name+"の勝ち");
				ai.level=ai.level+10;
				i=i+1000;
			}else if(ai.hp<=0) {
				System.out.println(ai.name+"は負けた");
				i=i+1000;
				break;
			}
			
		}
		return ai.name;
	}

}

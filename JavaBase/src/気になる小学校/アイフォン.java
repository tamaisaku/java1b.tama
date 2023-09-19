package 気になる小学校;

import java.util.Random;

public class アイフォン {
	String name;
	double hp;
	double attac;
	double difen;
	double supi;
	int haya;
	int maryo;
	int level;

	アイフォン(String name) {
		Random rnd = new Random();
		this.name = name;
		this.hp = rnd.nextInt(25) + 26;
		this.attac = rnd.nextInt(25) + 26;
		this.difen = rnd.nextInt(25) + 26;
		this.supi = rnd.nextInt(25) + 26;
		this.haya = 0;
		this.maryo = 100;
		this.level = 0;
	}

	void display() {
		System.out.println("名前・・" + name);
		System.out.println("体力" + Math.ceil(hp));
		System.out.println("攻撃" + Math.ceil(attac));
		System.out.println("防御" + Math.ceil(difen));
		System.out.println("スピード" + Math.ceil(supi));
	}

	void leveup() {
		Random rnd = new Random();
		this.hp = rnd.nextInt(75) + 26;
		this.attac = rnd.nextInt(75) + 26;
		this.difen = rnd.nextInt(75) + 26;
		this.supi = rnd.nextInt(75) + 26;
		this.level=0;
		this.maryo = maryo + 50;
	}

	public static void main(String[] args) {

	}

}

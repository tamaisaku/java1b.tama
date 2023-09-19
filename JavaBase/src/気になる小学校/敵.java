package 気になる小学校;

import java.util.Random;

public class 敵 {
	String name;
	double hp;
	double attac;
	double difen;
	double supi;
	int haya;

	敵(アイフォン aif) {
		Random ran = new Random();
		int a=ran.nextInt(10)+1;
		this.name = "ny"+a;
		this.hp = ran.nextInt(25) + 50;
		this.attac = (aif.attac * 0.8);
		this.difen = (aif.difen * 0.8);
		this.supi = (aif.supi * 0.8);
		this.haya = 0;
	}

	void display() {
		System.out.println("名前・・" + name);
		System.out.println("体力" + Math.ceil(hp));
		System.out.println("攻撃" + Math.ceil(attac));
		System.out.println("防御" + Math.ceil(difen));
		System.out.println("スピード" + Math.ceil(supi));
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}

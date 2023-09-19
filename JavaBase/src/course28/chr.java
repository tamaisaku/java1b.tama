package course28;

import java.util.Random;

public class chr {
	String name;
	static int hp;
	static int attck;
	static int def;
	static int kyouki;
	void naguru(chr ple, chr2 ple2) {
		Random rnd =new Random();
		int yoke=rnd.nextInt(100)+ple2.agi;
		if (yoke>90) {
		chr.attck=chr.attck+chr.kyouki;
		int ati=(ple.attck*2)-ple2.def;
		ple2.hp=ple2.hp-((ple.attck*2)-ple2.def);
		System.out.println(ati+"のダメージを与えた");
	}else {
		System.out.println("よけた");
	}
		chr2.agi=chr2.agi/2;
		chr.kyouki=chr.kyouki*2;
	}
	void mamori(chr plei) {
		if(plei.def<=1000) {
		chr.def=chr.def*2;
		System.out.println("守りを固めて防御が"+(chr.def)+"なった。");
		}
		chr.kyouki=chr.kyouki+10;
	}

	public static void main(String[] args) {
		

	}

}

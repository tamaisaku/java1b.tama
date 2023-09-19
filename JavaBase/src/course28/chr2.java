package course28;

public class chr2 {
	String name;
	static int hp;
	static int attck;
	static int def;
	static int agi;
	void naguru2(chr2 ple, chr ple2) {
		System.out.println(ple.name+"の攻撃");
		int ati=(ple.attck*3)-(ple2.def%2+ple2.def%3);
		ple2.hp=ple2.hp-((ple.attck*3)-(ple2.def%2+ple2.def%3));
		System.out.println(ple2.name+"に"+ati+"のダメージを与えた");
	}
	void mamori2(chr2 plei) {
		if(plei.def<=1000) {
		plei.def=plei.def*2;
		System.out.println(plei.name+"の防御が"+(plei.def)+"なった。");
		}
	}
	void niger(chr2 pl) {
		System.out.println("回避率が上がった");
		pl.agi=pl.agi*2;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}

package 総合演習;

public class Pocketon {
	String name;
	int type;
	int power;
	int diffcult;
	int getted;

	Pocketon(String n, int t, int p, int d) {
		name = n;
		type = t;
		power = p;
		diffcult = d;
		getted = 0;
	}

	void display() {
		System.out.println("名前：" + name);
		System.out.println("属性：" + type);
		System.out.println("力：" + power);
		System.out.println("防御：" + diffcult);
		System.out.println(getted);

	}

}

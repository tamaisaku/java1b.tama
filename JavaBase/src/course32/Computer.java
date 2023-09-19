package course32;

public class Computer {
	String name;
	String cpu;
	int memory;
	String gurabo;
	int price;
	
	void display() {
		System.out.println(name);
		System.out.println(cpu);
		System.out.println(memory);
		System.out.println(gurabo);
		System.out.println(price);
	}
	Computer(String n,String c,int m,String g,int p) {
		name=n;
		cpu=c;
		memory=m;
		gurabo=g;
		price=p;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}

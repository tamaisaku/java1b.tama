package course24;

public class Practice01 {
	//2
	static void mondai01() {
		System.out.println("呼び出されたよ");
	}

	//3
	static void rikou() {
		System.out.println("国際理工");
	}

	//4に動く
	static void keisan() {
		System.out.println(1 + 1);
	}
	static void hensu() {
		int a=100;
		System.out.println(a);
	}
	public static void main(String[] args) {
		//プログラムは１
		mondai01();
		rikou();
		keisan();
		hensu();
	}
	

}

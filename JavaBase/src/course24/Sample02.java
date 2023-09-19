package course24;

public class Sample02 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
	//int型変数「a」「b」をメソッドに渡して呼び出す
		plus(a,b);
		System.out.println("呼び出し終わったよ");
		int suti=30;
		bai(suti);
		String m="引数だお";
		moji(m);
		int ni=50;
		int ko=40;
		niko(ni,ko);
		int tensu =100;
		calledmethod(tensu);
	}
	//呼び出される側
	//int「a」の値がint「x」に、int「b」の値がint「y」に格納されてるよ
	static void plus(int x,int y) {
		System.out.println(x+y);
	}
	static void bai(int sti) {
		System.out.println(sti*2);
	}
	static void moji(String mo) {
		System.out.println(mo);
	}
	static void niko(int i,int o) {
		System.out.println(i+o);
	}
	static void calledmethod(int te) {
		System.out.println("因数で受け取った値は"+te+"です");
	}

}

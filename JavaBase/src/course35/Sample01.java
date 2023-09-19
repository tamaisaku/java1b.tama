package course35;

public class Sample01 {

	public static void main(String[] args) {
		calc();
		
		
		calc(50,100);

	}
	static void calc() {
		System.out.println("計算をしたいときは因数を二つ渡す");
	}
	static void calc(int a,int b) {
		System.out.println("計算結果は"+(a+b));
	}

}

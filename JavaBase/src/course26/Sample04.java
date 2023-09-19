package course26;

public class Sample04 {

	public static void main(String[] args) {
		int m=1000;
		int syosyozi=syo(m);
		int syosyozi2=syo2(m);
		int haisyozi=hai(m);
		System.out.println("現在の所持金は"+syosyozi+"です");
		System.out.println("現在の所持金は"+haisyozi+"です");
		System.out.println("現在の所持金は"+syosyozi2+"です");

	}
	static int syo(int n) {
		int non=n*2;
		return non;
	}
	static int syo2(int n) {
		int non2=n*3;
		return non2;
	}
	static int hai(int n) {
		int nom=n/2;
		return nom;
	}


	

}

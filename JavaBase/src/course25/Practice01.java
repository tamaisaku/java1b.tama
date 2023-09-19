package course25;

public class Practice01 {

	public static void main(String[] args) {
		int a=modoriOne(134);
		String b=modoriTwo("文字！");
		int z=modoPraThree(333,555);
		System.out.println(a);
		System.out.println(b);
		System.out.println(z);

	}
	static int modoriOne(int a2) {
		int num=100+a2;
		return num;
	}
	static String modoriTwo(String b2) {
		String moji=b2+"受け取りました";
		return moji;
	}
	static int modoPraThree(int x,int y) {
		int sum=x+y;
		return sum;
	}

}

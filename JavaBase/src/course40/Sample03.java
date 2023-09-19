package course40;

public class Sample03 {

	public static void main(String[] args) {
		boolean a=isEven(9);
		System.out.println(a);

	}
	
	static void Tutorial() {
		System.out.println("ちゅーとりある");
	}
	static void printHello() {
		System.out.println("Hello,Woeld");
	}
	static void multiply(int a,int b) {
		System.out.println(a*b);
	}
	static int multiplymodori(int a,int b) {
		return a*b;
	}
	static boolean isEven(int number) {
		boolean tf;
		if(number%2==0) {
			tf=true;
		}else {
			tf=false;
		}
		return tf;
		
	}

}

package course35;

public class Sample02 {

	public static void main(String[] args) {
		calc("文字");
		calc(50);

	}

	static void calc(String a) {
		System.out.println("渡されたんは" + a + "でう");
	}

	static void calc(int a) {
		System.out.println("受け取ったのあ" + a + "でう");
	}

}

package course47;

public class Sample04 {

	public static void main(String[] args) {
		try {
			//number2がゼロのため鰓である
		int number2 = 0;
		if (100 / number2 == 20) {
			System.out.println("numberは5です。");
		}
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}

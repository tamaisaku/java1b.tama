package course47;

public class Sample03 {

	public static void main(String[] args) {
		try {
			//10/0になってしまうからエラー
		int number = 0;
		if (10 / number == 2) {
			System.out.println("numberは5です。");
		}
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}

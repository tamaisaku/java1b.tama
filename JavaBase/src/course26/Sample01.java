package course26;

import java.util.Random;

public class Sample01 {

	public static void main(String[] args) {
		int rand=kaad();
		System.out.println("１枚目カード数は["+rand+"]");
		int rand2=kaad();
		System.out.println("２枚目カード数は["+rand2+"]");
	}
	static int kaad() {
		Random rnd =new Random();
		int a=rnd.nextInt(13)+1;
		int num=a;
		return num;
	}

}

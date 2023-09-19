package course08;

import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		//ifの中にifをつけることができる
		int a = 4;
		if (a >= 10) {

			if (a <= 50) {
				System.out.println("10以上50以下");
			}
		}
		//&&=andと同じ意味
		int b = 1;
		if (b >= 10 && b <= 50) {
			System.out.println("１０以上５０以下");
		}

		//||=orと同じ意味
		int c = 1;
		if (c >= 5 || c <= 20) {
			System.out.println("５以上２０以下");
		}
		//switch文まとめて判別が可能
		//㊟breakを忘れないように
		Scanner stdIn = new Scanner(System.in);
		String like = stdIn.next();
		switch (like) {
		case "魚":
			System.out.println("魚が好きです");
			//以降の判定をスキップ
			break;
		case "肉":
			System.out.println("肉が好きです");
			break;
		//defaultどれにも該当しない場合
		default:
			System.out.println("野菜が好きです");
		}

	}

}

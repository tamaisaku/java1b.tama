package course18;

public class Sample01 {

	public static void main(String[] args) {
		//小数点を扱う変数の型
		//doubleとfloat(違いは精度)
		double x=3.1415;
		
	//float型を使うときF(大文字)を付ける
		//つけないとdoubleになる
		float y=3.1459F;
//floatは大きくなる過ぎると四捨五入される
		System.out.println(x);
		System.out.println(y);
		
		//boolean文yesかNoか分ける分
		//if文は括弧のなかがyesかどうかの確認
		boolean bolean=true;
		
		boolean blean=false;
		//この分は
		if(bolean) {
			System.out.println("TRUEだよ");
		}else {
			System.out.println("FALSEだよ");
		}
		
		int into=30;
		boolean lean=into>15;
		if(lean) {
			System.out.println("intoは15よりも大きいです");
		}else {
			System.out.println("intoは15以下です");
		}

	}

}

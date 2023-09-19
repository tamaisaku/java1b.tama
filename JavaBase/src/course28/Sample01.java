package course28;

public class Sample01 {
	
	public static void main(String[] args) {
		//インスタンス
		//「hu1」はHumanのインスタンス(実体)
		//インスタンスに対してパラメータを設定する。
		//newの隣がインスタンス
	Human hu1=new Human();
	hu1.name="坂本";
	hu1.kotoba="ラブ＆ピース";
	
	hu1.hp=50;
	hu1.neru();
	
	System.out.println(hu1.name);
	
	
	
	
	}

}

package course29;

public class Sample01 {

	public static void main(String[] args) {
		//クラス「Human」から、インスタンス「human1」を作成
		Human human1=new Human();
		//human1にパラメータを設定
		human1.name="システム太郎";
		human1.hobby="基数返還";
		human1.address="サーティファ伊本社";
		
		//クラス「Human」から、インスタンス「human2」を作成
		Human human2=new Human();
		//human1にパラメータを設定
		human2.name="システム花子";
		human2.hobby="パック１０進数";
		human2.address="国際履行学園１８２号館";
		//メソッド呼び出し
		human1.talk();
		human2.talk();

		Human me=new Human();
		me.name="坂本龍馬";
		me.hobby="革命";
		me.address="図らずともわが故郷";
		me.talk();
		
		Character ore=new Character();
		ore.name="ore";
		ore.hp=9999;
		ore.str=400;
		ore.def=30;
		ore.agi=0;
		ore.dex=90;
		ore.viewStatus();
	}

}

package course29;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Character me=new Character();
		Scanner stdIn = new Scanner(System.in);
		System.out.println("自分のステータスを入力しよう");
		System.out.println("まず名前を入力");
		me.name=stdIn.next();
		System.out.println("次に体力を入力");
		me.hp=stdIn.nextInt();
		System.out.println("次に攻撃力を入力だ");
		me.str=stdIn.nextInt();
		System.out.println("命中率を入力");
	    me.dex=stdIn.nextInt();
	    System.out.println("回避率を入力");
	    me.agi=stdIn.nextInt();
	    System.out.println("最後に防御力を入力しよう！");
	    me.def=stdIn.nextInt();
	    me.viewStatus();
	    
	    System.out.println("");
	    System.out.println("次に相手のステータスを入力しよう！");
	    Character tonari=new Character();
	    System.out.println("まず名前を入力");
	    tonari.name=stdIn.next();
	    System.out.println("次に体力を入力");
	    tonari.hp=stdIn.nextInt();
	    System.out.println("次に攻撃力を入力だ");
	    tonari.str=stdIn.nextInt();
	    System.out.println("命中率を入力");
	    tonari.dex=stdIn.nextInt();
	    System.out.println("回避率を入力");
	    tonari.agi=stdIn.nextInt();
	    System.out.println("最後に防御力を入力しよう！");
	    tonari.def=stdIn.nextInt();
	    tonari.viewStatus();
	    
	    me.battle(me,tonari);

	}

}

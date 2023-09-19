package course29;

public class Human {
	//パラメータ
	String name;
	String address;
	String hobby;
	//行動原理
	void talk() {
		System.out.println(this.name+"こんにちは。私の趣味は"+this.hobby+"でう！！");
	}
	void run() {
		System.out.println(this.name+"は走った");
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}

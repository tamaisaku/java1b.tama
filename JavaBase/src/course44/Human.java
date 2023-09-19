package course44;

//extendsが大事これがあると子クラス
//親クラスから受け取る
public class Human extends Creatures {
	private String name;
	private String hobby;
	
	void disp() {
		System.out.println("私の名前は"+this.name+"です");
		System.out.println("私の趣味は"+this.hobby+"です");
	}
	void dispWeight() {
		//superは親クラスから
		System.out.println("私の体重は"+super.getWeight()+"gです");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getHobby() {
		return hobby;
	}
	
	public void setHobby(String hobby) {
		this.hobby=hobby;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}

package course44;

//extendsは親クラスから変数などを持ってくる

public class Animal extends Creatures {
	private String name;
	private String kari;
	
	void display() {
		System.out.println(this.name);
		System.out.println(this.kari);
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name=name;
	}
	String getKari(){
		return kari;
	}
	void setKari(String kari) {
		this.kari=kari;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}

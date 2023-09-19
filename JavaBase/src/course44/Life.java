package course44;

//Life→Creatures→Human
//               →Animal
//の順に継承される

public class Life {
	private int jumyou;

	void death(String name) {
		System.out.println(name + "は" + jumyou + "年の寿命を全うし死んだ。そして天国から今も皆を見守っている。");
	}

	public int getJumyou() {
		return jumyou;
	}

	public void setJumyou(int jumyou) {
		this.jumyou = jumyou;
	}


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}

package course44;

public class Creatures extends Life {
	
	private int weight;
	
	void eat(String food,int cal) {
		System.out.println(food+"を食べた。体重が"+cal+"ｇ増えた。");
		this.weight=this.weight+cal;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight=weight;
	}

	public static void main(String[] args) {
		

	}

}

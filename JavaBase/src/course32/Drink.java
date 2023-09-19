package course32;

public class Drink {
	int price;
	String name;
	void display() {
		System.out.println(price);
		System.out.println(name);
	}
	int calcSum(int a,int b) {
		int pas=a*b;
		return pas;
	}
	int nebiki(int nebikigaku) {
		return price-nebikigaku;
	}
	int chonebiki(int nebikigaku){
		int a=nebikigaku*3;
		int modori=nebikigaku-a;
		return modori;
	}

	public static void main(String[] args) {
		

	}

}

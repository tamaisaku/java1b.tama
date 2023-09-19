package course32;

public class UseClass {

	public static void main(String[] args) {
		Drink drink=new Drink();
		drink.display();
		int a=drink.calcSum(40, 80);
		System.out.println("合計は"+a);
		drink.nebiki(10);
		int g=drink.chonebiki(2000);
		System.out.println(g);
	}

}

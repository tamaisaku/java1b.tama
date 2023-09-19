package course60;

public class UseClass {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		//Animal ani=new Animal();

		//ぽりもーふぃずむ
		//別々のクラスが持つ同じメソッドを呼び出すこと
		dog.nakigoe();
		cat.nakigoe();
		//ani.nakigoe();
	}

}

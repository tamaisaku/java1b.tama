package course44;

public class UseClass {

	public static void main(String[] args) {
		Human human=new Human();
		human.setName("システム太郎");
		human.setHobby("プログラミング");
		human.setWeight(60000);
		
		human.disp();
		human.dispWeight();
		
		human.eat("ハンバーガー",1200);
		
		human.dispWeight();
		
		Animal ani=new Animal();
		ani.setName("サイ");
		ani.setWeight(7000000);
		ani.setKari("角で相手を粉砕");
		ani.display();
		
		ani.setJumyou(30);
		ani.death(ani.getName());

	}

}

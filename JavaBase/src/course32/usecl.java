package course32;

public class usecl {

	public static void main(String[] args) {
		Computer mypc=new Computer("KOKURI MACHINE","intel core-i9 13900H",16,"RTX4070",250000);
		mypc.display();
		mypc.name="初期NAME";
		mypc.cpu="初期CPU";
		mypc.memory=0;
		mypc.gurabo="初期GURIBO";
		mypc.price=100;
		mypc.display();
		

	}

}

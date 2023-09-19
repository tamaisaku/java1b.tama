package course41;

public class UseClass {

	public static void main(String[] args) {
		Product pro1=new Product();
		pro1.no="A001";
		pro1.name="Item1";
		pro1.price=200;
		pro1.quantity=10;
		pro1.display();
		
		Food fo1=new Food();
		fo1.name="おいしい魚乳";
		fo1.price=3500;
		
		Food fo2=new Food();
		fo2.name="面白いほどまずいブラ肉";
		fo2.price=450;
		
		Food fo3=new Food();
		fo3.name="踊り食い！突撃お前が晩御飯";
		fo3.price=15000;
		
		Food fo4=new Food();
		fo4.name="珍しさ満点！人肉ご飯";
		fo4.price=4600;
		
		Food[] manu=new Food[4];
		manu[0]=fo1;
		manu[1]=fo2;
		manu[2]=fo3;
		manu[3]=fo4;
		System.out.println(manu[0].name);
		System.out.println(manu[1].name);
		System.out.println(manu[2].name);
		System.out.println(manu[3].name);
		
		Food fo5=new Food();
		fo5.name="";
		fo5.price=0;
		
		Food fo6=new Food();
		fo6.name="";
		fo6.price=0;
		
		Food fo7=new Food();
		fo7.name="";
		fo7.price=0;
		
		Food fo8=new Food();
		fo8.name="";
		fo8.price=0;
		
		
		Food[] manu2=new Food[4];
		manu2[0]=fo5;
		manu2[1]=fo6;
		manu2[2]=fo7;
		manu2[3]=fo8;
		
		
			
		
			

	}

}

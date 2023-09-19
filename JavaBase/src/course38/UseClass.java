package course38;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		Pocketon poke1=new Pocketon();
		poke1.name="銭カメ";
		poke1.power=100;
		poke1.difficult=1;
		String[] arr2=new String[3];
		arr2[0]="あ";
		arr2[1]="か";
		arr2[2]="さ";
		for(int i=0;i<=2;i++) {
		System.out.println(arr2[i]);	
		}
		Pocketon[] myPockes=new Pocketon[3];
		myPockes[0]=poke1;
		
		Pocketon poke2=new Pocketon();
		poke2.name="不思議リーフ";
		poke2.power=200;
		poke2.difficult=3;
		
		myPockes[1]=poke2;
		
		System.out.println(myPockes[0].name);
		System.out.println(myPockes[1].difficult);
		
		Scanner a=new Scanner(System.in);
		
		Pocketon poke3=new Pocketon();
		poke3.name=a.next();
		poke3.power=a.nextInt();
		poke3.difficult=a.nextInt();
		myPockes[2]=poke3;
		
		System.out.println(myPockes[2].name);
		System.out.println(myPockes[2].power);
		System.out.println(myPockes[2].difficult);
		
		for(int name=0;name<3;name++) {
			System.out.println(myPockes[name].name);
		}
		myPockes[1].display();
		
		
		

	}

}

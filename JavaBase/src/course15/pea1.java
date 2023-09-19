package course15;

import java.util.Random;
import java.util.Scanner;

public class pea1 {

	public static void main(String[] args) {
		System.out.println("所持金１００００");
		Random rnd =new Random();
		
		int b = 0;
		int c=0;
		int d=0;
		int e=0;
		int f=0;
		int g=0;
		int h=0;
		
		Scanner stdIn = new Scanner(System.in);
		int i=10000;
		while(i<=50000) {
			int num=rnd.nextInt(7)+1;
			int num2=rnd.nextInt(7)+1;
			int num3=rnd.nextInt(7)+1;
			System.out.println("掛け金を設定してください");
			int a = stdIn.nextInt();
			System.out.print(num+" ");
			System.out.print(num2+" ");
			System.out.print(num3);
			System.out.println();
			String moji = num+"" ;
			String moji2 =num2+"";
			String moji3 =num3+"";
			String moji4 =moji+moji2+moji3;
			System.out.println(moji4);
			switch(moji4) {
			case "111":
				System.out.println("ピンゾロ");
				b=i+a*5+i;
				i=b;
				System.out.println(b);
				break;
				//ゾロ目の目
			case "222":
			case "333":
			case "444":
			case "666":
				System.out.println("ゾロ目");
				c=a*3+i;
				i=c;
				System.out.println(c);
				break;
				//しごろの目
			case "456":
			case "465":
			case "546":
			case "564":
			case "645":
			case "654":
				System.out.println("シゴロ");
				d=a*2+i;
				i=d;
				System.out.println(d);
				break;
				//ヒフミの目
			case "123":
			case "132":
			case "213":
			case "231":
			case "312":
			case "321":
				System.out.println("ヒフミ");
				e=i-a*2;
				i=e;
				System.out.println(e);
				break;
				//しょんべんの目
			case "770":
			case "707":
			case "077":
			case "777":
				System.out.println("しょんべん");
				f=i-a;
				i=f;
				System.out.println(f);
				break;
				//1の通常目
			case "112":
			case "113":
			case "114":
			case "115":
			case "116":
			case "121":
			case "131":
			case "141":
			case "151":
			case "161":
			case "211":
			case "311":
			case "411":
			case "511":
			case "611":
			//2の通常目
			case "221":
			case "223":
			case "224":
			case "225":
			case "226":
			case "212":
			case "232":
			case "242":
			case "252":
			case "262":
			case "122":
			case "322":
			case "422":
			case "522":
			case "622":
				//3
			case "331":
			case "332":
			case "334":
			case "335":
			case "336":
			case "313":
			case "323":
			case "343":
			case "353":
			case "363":
			case "133":
			case "233":
			case "433":
			case "533":
			case "633":
				//4
			case "441":
			case "442":
			case "443":
			case "445":
			case "446":
			case "414":
			case "424":
			case "434":
			case "454":
			case "464":
			case "144":
			case "244":
			case "344":
			case "544":
			case "644":
				//5
			case "551":
			case "552":
			case "553":
			case "554":
			case "556":
			case "515":
			case "525":
			case "535":
			case "545":
			case "565":
			case "155":
			case "255":
			case "355":
			case "455":
			case "655":
				//6
			case "661":
			case "662":
			case "663":
			case "664":
			case "665":
			case "616":
			case "626":
			case "636":
			case "646":
			case "656":
			case "166":
			case "266":
			case "366":
			case "466":
			case "566":
				g=i+a;
				i=g;
				System.out.println("通常目");
				System.out.println(g);
				break;
			default:
				System.out.println("役なし");
				h=i- a;
				i=h;
				System.out.println(h);
			}
			if(b<=-1) {
				
				System.out.println("1050年地下行き");
				break;
			}
			if(c<=-1) {
				
				System.out.println("1050年地下行き");
				break;
			}
			if(d<=-1) {
				
				System.out.println("1050年地下行き");
				break;
			}
			if(e<=-1) {
				
				System.out.println("1050年地下行き");
				break;
			}
			if(f<=-1) {
				
				System.out.println("1050年地下行き");
				break;
			}
			if(g<=-1) {
				
				System.out.println("1050年地下行き");
				break;
			}
			if(h<=-1) {
				
				System.out.println("1050年地下行き");
				break;
			}
			
			
			
			
			
			
			

		}
		System.out.println("ゲームクリア");

	}

}

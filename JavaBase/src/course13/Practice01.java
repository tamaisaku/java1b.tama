package course13;

public class Practice01 {

	public static void main(String[] args) {
	//1
		for(int i=1;i<=3;i++) {
			System.out.print(i);
		}
		//2
		System.out.println();
		for(int l=1;l<=12;l++) {
			System.out.print(l);
		}
		//3
		System.out.println();
		for(int a=0;a<=10;a++) {
			int b=a%2;
			if(b==0) {
				System.out.println("偶数です");
				
			}
			System.out.print(a);
		}
		//4
		for(int c=1;c<=10;c++) {
			if(c==3) {
				System.out.println("3週目");
			}
			if(c==6) {
				System.out.println("あと4週");
			}
			if(c==10) {
				System.out.println("最後のループ");
			}
			System.out.println(c);
		}
		//5
		for(int d=10;d>=1;d--) {
			System.out.println(d);
		}

	}

}

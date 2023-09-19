package course14;

public class Sample02 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			//この下がループする
			for(int j=1;j<=9;j++) {
				if(i*j<10)
					System.out.print("  ");
				else
					System.out.print(" ");
				System.out.print(i*j);
			}
			//終われば下まで行く
			System.out.println();
		}

	}

}

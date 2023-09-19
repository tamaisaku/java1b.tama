package お遊び幼稚園;

public class 遊び場１ {

	public static void main(String[] args) {
		int i = 1;
		while (i <=4) {
			if(i==1) {
				System.out.println("*");
			}
			if(i==2) {
				System.out.println("**");
			}
			if(i==3) {
				System.out.println("***");
			}
			if(i==4) {
				System.out.println("****");
				break;
			}
			i++;
		}
		//この時「i」はbreak時の４である
			while(i<=4) {
				if(i==1) {
					System.out.println("*");
				}
				if(i==2){
					System.out.println("**");
				}
				if(i==3) {
					System.out.println("***");
				}
				i--;
			}

	}

}

package course13;

public class purac03 {

	public static void main(String[] args) {
		for(int i=0;i<=100;i++) {
			int l=i%11;
			while(l==0) {
				System.out.println("ぞろ目");
				break;
			}
			
			System.out.println(i);
		}


	}

}

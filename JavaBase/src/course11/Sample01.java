package course11;

public class Sample01 {

	public static void main(String[] args) {
		//int i=0;
		//while(1<10){
		//system.out.println("現在のカウントは"+i);
		//i++;
		//}
		int i=1;
		while(i<10) {
			System.out.println("現在カウントは"+i);
			if(i==5) {
				break;
			}
			i++;
		}
		System.out.println("抜けたお");

	}

}

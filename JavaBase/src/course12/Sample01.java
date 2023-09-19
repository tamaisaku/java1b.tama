package course12;

public class Sample01 {

	public static void main(String[] args) {
		int a=0;
			do {
				System.out.println("ここに実行したいことをかくよ ");
				a++;
			}while(a<3);
			
			int x=0;
			do {
				if(x<3) {
					System.out.println("ifとの組み合わせ"+x); 
					
				}else if(x==2) {
					break;
				}
				x++;
			}while(x<3);

	}

}

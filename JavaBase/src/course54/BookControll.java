package course54;

public class BookControll {

	public static void main(String[] args) {
		int[] arr=new int[5];
		arr[0]=10;
		arr[1]=11;
		arr[2]=12;
		arr[3]=13;
		arr[4]=14;
		System.out.println(arr[3]);
		Book book1=new Book("明解java",1500);
		System.out.println(book1.getPrice());
		
		Book book2=new Book("Iパ",2500);
		Book book3=new Book("3マス",1200);
		Book book4=new Book("たかC",2800);
		System.err.println(book2.getTitle());
		//System.out.println(book3.getTitle());
		System.out.println("");
		Book[] hondana=new Book[4];
		hondana[0]=book1;
		System.out.println(hondana[0].getTitle());
		System.out.println(hondana[0].getPrice());

	}

}

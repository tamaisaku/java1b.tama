package course47;

public class Sample02 {

	public static void main(String[] args) {
		//for文が４回まわてしまうから
		//=を消すとできる
		try {
		int[] array = {1,2,3};
		for(int i=0;i<=array.length;i++) {
			System.out.println(array[i]);
		}
		
		}catch(Exception e) {
			//ちなみにIndexがエラーに入っていると配列である
			System.out.println(e);
		}

	}

}

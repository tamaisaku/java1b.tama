package course31;

public class Sample02 {

	public static void main(String[] args) {
		Books[] arr = new Books[3];
		Books books1=new Books("ITワールド",100,"サーティファイ");
		arr[0] =books1;
		Books books2=new Books("明解java",400,"柴田");
		arr[1]=books2;
		//インスタンスに入ってる変数を表示する
		System.out.println(arr[1].name);

	}

}

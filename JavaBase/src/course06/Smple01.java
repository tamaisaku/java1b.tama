package course06;

public class Smple01 {

	public static void main(String[] args) {
		int a=７３;
		
		//if文の鉄板文法
		if(a>50) {
			System.out.println("大きい");
		}else {
			System.out.println("小さい");
		}
		//else・・そうでなければという意味
		String m="あいうえお";
		String s="かきくけこ";
		
		if(m.equals(s)) {
			System.out.println("文字は一緒です。");
		}else {
			System.out.println("違う文章です");
		}
		
		if(m.equals("さしすせそ")) {
			System.out.println("文字は一緒でやんす");
		}else{
			System.out.println("文字は違うで");
		}

	}

}

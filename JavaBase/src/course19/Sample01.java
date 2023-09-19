package course19;

public class Sample01 {

	public static void main(String[] args) {
		String a="やすだ";
		String b="いとう";
		String c="さかもと";
		String d="ふじひら";
		String e="いの";
		String s="すずき";
		String x="かけがわ";
		String y="いとう";
		
		//配列の鉄板構文
		//[]のことを要素と呼ぶ。
		//要素は0から始まる
		String[]namelist=new String[10];
		namelist[0]="やすだ";
		namelist[1]="いとう";
		namelist[2]="ふじひら";
		namelist[3]="sもと";
		namelist[4]="sm";
		namelist[5]="st";
		namelist[6]="so";
		namelist[7]="sf";
		
		for(int i=0;i<8;i++) {
			System.out.println("俺の友達の名前は"+namelist[i]+"ｄ");
		}
		
		

	}

}

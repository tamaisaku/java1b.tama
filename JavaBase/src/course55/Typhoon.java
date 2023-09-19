package course55;

public class Typhoon {
	private int typhoonbango;
	private String hasseibi;
	private String asiaName;
	//デフォルトコンストラクタ
	public Typhoon() {
		
	}
	//引数有りコンストラクタ
	public Typhoon(int at,String ah,String aa) {
		this.typhoonbango=at;
		this.hasseibi=ah;
		this.asiaName=aa;
	}
	public static  void hyo(String a,int i) {
		System.out.println("台風" + (i + 1) + "号は" + a + "で発生した");
	}
	//getter,setter
	public int getTyphoonbango(){
		return typhoonbango;
	}
	
	public void setTyphoonbango(int t) {
		this.typhoonbango=t;
	}
	
	public String getHasseibi(){
		return hasseibi;
	}
	
	public void setHasseibi(String h) {
		this.hasseibi=h;
	}
	
	public String getAsiaName(){
		return asiaName;
	}
	
	public void setAsiaName(String a) {
		this.asiaName=a;
	}

}

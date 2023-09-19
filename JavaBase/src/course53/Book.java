package course53;

public class Book {
	private String title;
	private int price;
	
	//ちなみにクラスとクラスと同じ名前は
	//コンストラクタというらしい

	public Book() {
		System.out.println("動いたよ。");
	}
	
	//(オーバーロード
	//それは同じ名前でも引数の有無で判断すること)
	//ここでいうところのBookのあたり

	public Book(String userInputTitle) {
		this.title = userInputTitle;
		System.out.println("タイトルに初期値として" + userInputTitle + "をセットしました。");
	}
	
	public Book(String userlnputTitle,int userlnputPrice) {
		this.title=userlnputTitle;
		this.price=userlnputPrice;
		System.out.println(title+" "+price);
		}
	//ここにタイトルと価格をセットするコンストラクタを書いてみよう////

	////////////////以下getter及びsetter(今日は無視してOK）/////////////
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	////////////////以下getter及びsetter(今日は無視してOK）/////////////

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}

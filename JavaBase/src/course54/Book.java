package course54;

public class Book {
	private String title;
	private int price;

	public Book() {
		System.out.println("コンストラクタが動いたよ。");
	}

	public Book(String userInputTitle, int userInputPrice) {
		System.out.println("タイトルに初期値として" + userInputTitle + "をセットしました。");
		System.out.println("価格に初期値として" + userInputPrice + "をセットしました。");
		this.price=userInputPrice;
		this.title=userInputTitle;
	}

	//////////////////////////////////////////////////////////////////
	////////////////以下getter及びsetter/////////////
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
}
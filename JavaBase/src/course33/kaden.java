package course33;

public class kaden {
	private String name;
	private int price;
	private String category;
	
	public void setCategory(String category) {
		if(category.equals("大型")) {
		this.category="設定NG";
		}else {
			this.category=category;
		}
	}
	public String getCategory() {
		return category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		//もし設定予定のパラメータがマウスなら
		//在庫切れ商品のためNGとする
		if(name.equals("マウス")) {
		this.name = "設定NG";
		}else {
			//そうでなければ名前を設定
			this.name=name;
		}
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}

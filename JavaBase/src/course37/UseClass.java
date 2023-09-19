package course37;

public class UseClass {

	public static void main(String[] args) {
		//インスタンス生成
				Sample01 em = new Sample01();
				em.display();

				//値をセット
				em.setName("テスト太郎");
				em.setCompany("株式会社国際理工");

				//中身を表示
				em.display();

	}

}

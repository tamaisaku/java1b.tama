package 適当な空間;

public class 攻撃 {
	魔法[] mazic;
	int kouryok;

	public void mahokougeki(魔法 maho) {

	}
	

	public void 攻撃(魔法 maho) {
		mazic = new 魔法[12];
		kouryok=0;
		//mazic[0] = maho;
		for (int a = 0; a <= 11; a++) {
			if (mazic[a].mahoname.equals("")) {
				mazic[a] = maho;
				break;
			}
		}
	}
}

package course57;

public class Plsyer {
	private int kinryoku;
	private int gakuryoku;
	private int mitame;
	private int omosiro;
	
	public void setkinryoku(int kin) {
		this.kinryoku=kin;
	}

	public int getkinryoku() {
		return kinryoku;
	}
	
	public void setgakuryoku(int a) {
		this.gakuryoku=a;
	}
	
	public int getgakuryoku() {
		return gakuryoku;
	}
	
	public void setmitame(int a) {
		this.mitame=a;
	}
	public int getmitame() {
		return mitame;
	}
	
	public void setomosiro(int a) {
		this.omosiro=a;
	}
	
	public int getomosiro() {
		return omosiro;
	}
	
	public void hyo() {
		System.out.println(kinryoku);
		System.out.println(gakuryoku);
		System.out.println(mitame);
		System.out.println(omosiro);
	}

}

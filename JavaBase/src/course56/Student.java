package course56;

public class Student extends Human implements Gimu{
	
	private int syussekibango;
	
	public void study(){
		System.out.println("逮捕します。義務なので");
	}

	public int getSyussekibango() {
		return syussekibango;
	}

	public void setSyussekibango(int syussekibango) {
		this.syussekibango = syussekibango;
	}
}

package course56;

public class PoPocke extends PoSuper implements PoAction{
	private int kotaichi;
	private String nickname;
	
	public void setkotaichi(int kot) {
		this.kotaichi=kot;
	}
	
	public int getkotaichi() {
		return kotaichi;
	}
	
	public void setnickname(String nike) {
		this.nickname=nike;
	}
	
	public String getnickname() {
		return nickname;
	}
	
	public void battle() {
	}
	
	public void recover() {
	}

}

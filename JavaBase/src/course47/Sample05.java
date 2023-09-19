package course47;

public class Sample05 {

	public static void main(String[] args) {
		try {
			//送る引数にゼロがある（0じゃ割れない）
		int result = divideNumbers(10, 0);
	    System.out.println(result);
		
		}catch(Exception e) {
			System.out.println(e);
		}
	   

	}
	 public static int divideNumbers(int a, int b) {
	        return a / b;
	    }

}

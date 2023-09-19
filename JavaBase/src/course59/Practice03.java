package course59;
import java.util.Scanner;
public class Practice03 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//String a=scan.next();
		JavaMaker jm = new JavaMaker();
		String startCode = "public class HelloWorld { public static void main(String[] args){"
				+ "for(int a=0;a<=10;a++){ System.out.println(\"ともに\");}"
				+ ""
				+ "}}";
		//startCode=startCode+"System.out.println(\"お疲れ\");";
		jm.javaCodeStart(startCode);
	}
}
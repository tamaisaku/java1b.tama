package course54;

public class StudentControll {

	public static void main(String[] args) {
		Student me=new Student(10,"さっかもっと");
		Student tonari=new Student(6,"大関 理惟");
		
		Student[] mymen=new Student[2];
		mymen[0]=tonari;
		mymen[1]=me;
		System.out.println(mymen[1].getName());
		
		mymen[0].setName("史上最強のサイコキラー沼");
		
	}

}

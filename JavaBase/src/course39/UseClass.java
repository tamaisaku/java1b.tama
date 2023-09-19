package course39;

public class UseClass {

	public static void main(String[] args) {
		Student stu=new Student();
		Student stu2=new Student();
		stu.name="坂本";
		stu2.name="鈴木";
		stu.no=10;
		stu2.no=14;
		
		Student[] myfriend=new Student[2];
		myfriend[0]=stu;
		myfriend[1]=stu2;
		for(int i=0;i<2;i++) {
			System.out.println(myfriend[i].name);	
		}

	}

}

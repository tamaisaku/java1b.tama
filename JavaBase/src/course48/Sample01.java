package course48;

public class Sample01 {
	
	seki[][] seki;
	
	Sample01(){
		seki=new seki[6][6];
	}
	
	void rndgae(seki rnd) {
		//for(int a=0;a<=6;a++) {
			//for(int b=0;b<=6;b++) {
				//seki[a][b]=rnd;
			//}
		//}
		seki[0][0]=rnd;
	}
	
	void display() {
		//for(int a=0;a<=6;a++) {
			//for(int b=0;b<=6;b++) {
				//System.out.println(seki[a][b]);
			//}
		//}
		System.out.println(seki[0][0]);
	}

	public static void main(String[] args) {
		

	}

}

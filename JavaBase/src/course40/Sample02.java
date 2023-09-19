package course40;

public class Sample02 {

	public static void main(String[] args) {
		int[] numbers=new int[5];
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
		numbers[4]=50;
		for(int a=0;a<=4;a++) {
			System.out.println(numbers[a]);
		}
		
		String[] cities=new String[5];
		cities[0]="東京";
		cities[1]="大阪";
		cities[2]="千葉";
		cities[3]="神奈川";
		cities[4]="埼玉笑";
		for(int b=0;b<=4;b++) {
			System.out.println(cities[b]);
		}
		
		int[] sumbers=new int[5];
		sumbers[0]=10;
		sumbers[1]=20;
		sumbers[2]=30;
		sumbers[3]=40;
		sumbers[4]=50;
		int sumb=0;
		for(int c=0;c<=4;c++) {
			sumb=sumb+sumbers[c];
		}
		System.out.println(sumb);
		
		int[] umbers=new int[5];
		umbers[0]=10;
		umbers[1]=20;
		umbers[2]=30;
		umbers[3]=40;
		umbers[4]=50;
		for(int d=0;d<=4;d++) {
			if(umbers[d]==50) {
				System.out.println(umbers[d]);
			}
		}
		
		int[] bers=new int[5];
		bers[0]=11;
		bers[1]=20;
		bers[2]=31;
		bers[3]=40;
		bers[4]=51;
		for(int x=0;x<=4;x++) {
			if(bers[x]%2==0) {
			}else {
				System.out.println(bers[x]);
			}
		}

		
		

	}

}

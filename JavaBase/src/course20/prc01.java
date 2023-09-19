package course20;

public class prc01 {

	public static void main(String[] args) {
		int[] a=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		int sum=0;
		for(int b=0;b<a.length;b++) {
			sum=sum+a[b];
		}
		System.out.println(sum);
	}

}

package お遊び幼稚園;

public class kaerita {

	public static void main(String[] args) {
		String kaerita="";
		int kaeritap=0;
		String ka="か";
		String e="え";
		String ri ="り";
		String ta ="た";
		String i="い";
		for(int a=0;a<=9999;) {
			if(kaerita.equals("")) {
				kaerita=kaerita+ka;
				System.out.println(ka);
			}
			if(kaerita.equals("か")) {
				kaerita=kaerita+e;
				System.out.println(e);
			}
			if(kaerita.equals("かえ")) {
				kaerita=kaerita+ri;
				System.out.println(ri);
			}
			if(kaerita.equals("かえり")) {
				kaerita=kaerita+ta;
				System.out.println(ta);
			}
			if(kaerita.equals("かえりた")) {
				kaerita=kaerita+i;
				System.out.println(i);
			}
			if(kaerita.equals("かえりたい")) {
				System.out.println(kaerita);
				kaerita="";
				kaeritap=kaeritap+1;
			}
			if(kaeritap==10000) {
				kaerita="超"+"かえりたい";
				System.out.println(kaerita);
				break;
			}
		}
		

	}

}

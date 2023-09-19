package couse10;

import java.util.Scanner;

public class Sampleple {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int aa = stdIn.nextInt();
		int ab = stdIn.nextInt();
		int ac = stdIn.nextInt();

		if (aa >= ab && aa >= ac) {
			System.out.println(aa + "が一番大きい数値です");
		}
		if (ab >= aa && ab >= ac) {
			System.out.println(ab + "が一番大きい数値です");
		}
		if (ac >= aa && ac >= ab) {
			System.out.println(ac + "が一番大きい数値です");
		}
		
		if (aa >= ab && aa <= ac) {
			System.out.println(aa + "が２番目に大きい");

		}
		if (ab >= aa && ab <= ac) {
			System.out.println(ab + "が２番目に大きい");

		}
		if (ac >= ab && ac <= aa) {
			System.out.println(ac + "が２番目に大きい");

		}
		if (aa <= ab && aa <= ac) {
			System.out.println(aa + "が3番目に大きい");
		}
		if (ab <= aa && ab <= ac) {
			System.out.println(ab + "が3番目に大きい");
		}
		if (ac <= aa && ac <= ab) {
			System.out.println(ac + "が3番目に大きい");
		}
		
	}
}

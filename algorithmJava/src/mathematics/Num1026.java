package mathematics;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Num1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		Integer[] B = new Integer[N];
		int sum = 0;
		
		for(int i=0; i<2; i++) {
			for(int z=0; z<N; z++) {
				if(i==0) A[z] = sc.nextInt();
				else B[z] = sc.nextInt();
			}
		}
		Arrays.sort(A);
		Arrays.sort(B, Collections.reverseOrder());
		for(int i=0; i<N; i++) {
			sum += A[i] * B[i];
		}
		System.out.println(sum);
	}
}

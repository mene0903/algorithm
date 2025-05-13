package stack.baekjoonStack;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Num_17608 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int top;
		int cnt = 1;
		
		int[] number = new int[num];
		for(int i=0; i<num; i++) {
			number[i] = sc.nextInt();
		}
		top = number[num-1];
		
		for(int i=num-2; i>-1; i--) {
			if (number[i]>top) {
				cnt += 1;
				top = number[i];
			}
		}
		System.out.println(cnt);
	}
}

package stack.baekjoonStack;

import java.util.*;
import java.io.*;

public class Num_1874 {
	private static ArrayList<Integer> arr = new ArrayList<>();
	private static int cnt = 1, top = 0;
	
	static void push(int number) {
		arr.add(number);
		cnt += 1;
		top += 1;
	}
	static void pop() {
		arr.remove(top-1);
		top -= 1;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int big = 0;
		int[] array = new int[n];
		for (int i=0; i<n; i++ ) {
			array[i] = Integer.parseInt(br.readLine());
			if (big<array[i]) big = array[i];
		}
		int z = 0;
		while (true) {
			if (z==array.length) break;
			if (top>0 && array[z] == arr.get(top-1) || cnt == big ) {
				System.out.println("-");
				pop();
				z += 1;
				continue;
			}
			push(cnt);
			System.out.println("+");
			
		}
		
	}

}

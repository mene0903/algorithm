package stack.baekjoonStack;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Num_10773 {
	private static ArrayList<Integer> arr = new ArrayList<>();
	private static int top = 0;
	private static int sum = 0;
	
	static void push(int number) {
		arr.add(number);
		top+=1;
		sum += number;
	}
	static void pop() {
		sum -= arr.get(top-1);
		arr.remove(top-1);
		top-=1;
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		for (int i=0; i<number; i++) {
			int value = Integer.parseInt(br.readLine());
			if (value != 0) {
				push(value);
			}
			else {
			pop();
		}
		}
		System.out.println(sum);
	}
}

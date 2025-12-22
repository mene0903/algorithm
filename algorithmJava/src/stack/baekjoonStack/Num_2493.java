package stack.baekjoonStack;

import java.util.StringTokenizer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Num_2493 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> deque = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();

		
		int countNum = Integer.parseInt(br.readLine());
		int[] arr = new int[countNum];
		int[] results = new int[countNum];
		
		String numString = br.readLine();	
		StringTokenizer st = new StringTokenizer(numString);
		
		for(int i=0; i<countNum; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			results[i] = 0;
		}
		
		for(int i=0; i<countNum; i++) {
			if(i==0) {
				deque.add(i);
				continue;
			}
			
			while(deque.size() != 0 && arr[deque.peekLast()] < arr[i]) {
				deque.removeLast();
			}
						
			
			if(deque.size() == 0) {
				deque.add(i);
			}
			else if (deque.size() == 1) {
				results[i] = deque.peekLast() + 1;
				deque.add(i);
			}
			else {
				results[i] = deque.peekLast() + 1;
				deque.add(i);
			}
			
		}
		
		for(int i=0; i<countNum; i++) {
		    sb.append(results[i]).append(" ");
		}
		System.out.println(sb);
	}
}

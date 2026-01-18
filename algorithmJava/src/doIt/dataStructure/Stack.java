package doIt.dataStructure;

/*
백준 1874
stack
 */

import java.util.*;
import java.io.*;

public class Stack {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		int cnt = 1;
		Deque<Integer> stack = new LinkedList<>();
		boolean tf = true;
		
		for(int i=0; i<num; i++) {
			
			int value = Integer.parseInt(br.readLine());

			while(cnt <= value) {
				stack.addFirst(cnt);
				cnt ++;
				sb.append("+\n");
			}
			
			if(!stack.isEmpty() && stack.getFirst() == value) {
				stack.removeFirst();
				sb.append("-\n");
			} else {
				System.out.print("NO");
                return;
			}
		}
        System.out.print(sb.toString());
	}
}

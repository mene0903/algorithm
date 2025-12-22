package stack.baekjoonStack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;


public class Num_17298 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> deque = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();


		int countNum = Integer.parseInt(br.readLine());
		int[] arr = new int[countNum];
		int[] result = new int[countNum];

		String num = br.readLine();
		StringTokenizer st = new StringTokenizer(num);
		
		for(int i=0; i<countNum; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			result[i] = -1;
		}
		
		for(int i=0; i<countNum; i++) {

			if (i==0) {
				deque.add(i);
				continue;
			}
			
			while(deque.size() != 0 && arr[deque.peekLast()] < arr[i]) {
				result[deque.peekLast()] = arr[i];
				deque.removeLast();
			}
			
			deque.addLast(i);
		}
		
		for(int i=0; i<countNum; i++) {
		    sb.append(result[i]).append(" ");
		}
		System.out.println(sb);
	}
}

/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
Deque<Integer> deque = new ArrayDeque<>();

int countNum = Integer.parseInt(br.readLine());
String num = br.readLine();
StringTokenizer st = new StringTokenizer(num);

for(int i=0; i<countNum; i++) {
	deque.add(Integer.parseInt(st.nextToken()));
}


Deque<Integer> dequeCopy = new ArrayDeque<>(deque);

for(int i=0; i<countNum; i++) {
	int minimum = deque.removeFirst();
	dequeCopy.removeFirst();
	
	for(int z=0; z<deque.size(); z++) {
		int bigNum = deque.removeFirst();
		if(minimum < bigNum) { 
			minimum = -1;
			System.out.println(bigNum); 
			break;
		}
	}
	
	if(minimum != -1) System.out.println(-1);
	
	deque = dequeCopy;
}
*/

package doIt.dataStructure;

/*
백준 11003
최소값 구하기
슬라이딩 윈도우 deque 사용 
 */

import java.util.*;
import java.io.*;

public class Minimum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken());
		int sliding = Integer.parseInt(st.nextToken());
		Deque<Node> dq = new LinkedList<>();
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<num; i++) {
			int now = Integer.parseInt(st.nextToken());
			
			while(!dq.isEmpty() && dq.peekLast().value > now) {
				dq.removeLast();
			}
			dq.addLast(new Node(i, now));
			
			if(dq.getFirst().index <= i-sliding) {
				dq.removeFirst();
			}
			bw.write(dq.getFirst().value + " ");
		}
		bw.flush();
		bw.close();
	}
	
	static class Node{
		public int value;
		public int index;
		
		Node(int index, int value) {
			this.index = index;
			this.value = value;
		}
	}
}
/*
 백준 11286 - 절댓값 힙
 
 우선순위 큐 , Comparator 사용
 
 절댓값이 작은 수가 우선
 절댓값이 같으면 음수가 우선
 우선순위 큐에 Comparator을 정의하여 해결
 
 시간복잡도 O(N logN)
 */

package doIt.dataStructure;

import java.util.*;
import java.io.*;

public class AbsoluteValueHeap {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
	
		PriorityQueue<Integer> pq = new PriorityQueue<>(
				(a,b) -> {
					if(Math.abs(a) == Math.abs(b)) {
						return Integer.compare(a, b);
					}
				return Integer.compare(Math.abs(a), Math.abs(b));
				}
				);
				
		for(int i=0; i<num; i++) {
			int value = Integer.parseInt(br.readLine());
			
			if(value == 0) {
				if(pq.isEmpty()) System.out.println(0);
				else System.out.println(pq.poll());
				
				continue;
			}
			
			pq.add(value);
		}
	}		
}

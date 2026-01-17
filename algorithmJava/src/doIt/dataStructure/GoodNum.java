package doIt.dataStructure;

/*
백준 1253
좋은 수 구하기
배열 저장 후 투포인터로 확인
최대 개수가 2000이라 시간 복잡도가 O(N^2)이여도 시간 초과 X
 */

import java.util.*;
import java.io.*;

public class GoodNum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int cnt = 0;
		
		for(int i=0; i<size; i++) {
			
			int first = 0;
			int last = size - 1;
			int value = arr[i];
			
			while(first<last) {
				if(first == i) {
					first++;
					continue;
				}
				if(last == i) {
					last--;
					continue;
				}
				int sum = arr[first] + arr[last];
				if(sum==value) {
					cnt += 1;
					break;
				} else if(sum < value) first ++;
				else last --;
			}
		}
		System.out.println(cnt);
	}
}

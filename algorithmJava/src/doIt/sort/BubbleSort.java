/*
백준 1377번

버블 정렬 패스 횟수 구하기
정렬을 하기 전 숫자와 인덱스 값 넣기 -> 정렬 -> 기존의 인덱스 값 - 정렬된 인덱스 값
-> 인덱스값이 가장 많이 변한 숫자 + 1 = 패스 횟수 (버블정렬 특성상 왼쪽으로 가장 많이 이동한 숫자가 횟수를 나타냄, 정렬이 된 상태에서도 한번 더 검사하기 때문에 +1)

시간 복잡도: O(n logN)

 */

package doIt.sort;

import java.util.*;
import java.io.*;

public class BubbleSort {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		Store[] arr = new Store[num];
		
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = new Store(Integer.parseInt(br.readLine()), i);
		}
		
		Arrays.sort(arr);
		
		int max = 0;
		
		for(int i=0; i<arr.length; i++) {
			int changeIndex = arr[i].index - i;
			if(changeIndex > max) max = changeIndex;
		}
		
		System.out.println(max+1); 
	}
	
}

class Store implements Comparable<Store> {
	
	int number;
	int index;
	
	Store(int number, int index) {
		this.number = number;
		this.index = index;
	}
	
	@Override
	public int compareTo(Store s) {
		return Integer.compare(this.number, s.number);
	}
}
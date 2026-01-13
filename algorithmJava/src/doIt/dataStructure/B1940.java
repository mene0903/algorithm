package doIt.dataStructure;

/*
 백준 1940
 투 포인터
 포인터를 정렬의 시작과 끝에 놓고 순차적 비교
 */

import java.util.*;
import java.io.*;

public class B1940 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int value = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		
		Arrays.sort(arr);
				
		int first = 0;
		int second = num - 1;
		int cnt = 0;
		
		while(first < second) {
			int sum = arr[first] + arr[second];
			
			if(sum == value) {
				cnt += 1;
				second -= 1;
				first += 1;
			}
			else if(sum < value) {
				first += 1;
			}
			else second -= 1;
			
		}
		
		System.out.println(cnt);
	}

}

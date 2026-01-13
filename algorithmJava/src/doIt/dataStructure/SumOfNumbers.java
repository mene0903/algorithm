package doIt.dataStructure;

/*
백준 2018
연속된 자연수의 합
투 포인터 사용
 */

import java.util.*;
import java.io.*;

public class SumOfNumbers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long num = Integer.parseInt(br.readLine());
		
		long first = 0;
		long second = 1;
		long sum = 1;
		long cnt = 1;
		
		while(first != num-1) {			
			if(sum > num) {
				sum -= first; 
				first += 1;
			}
			else if(sum < num) {
				second += 1;
				sum += second;
			}
			else {
				cnt += 1;
				sum -= first;
				first += 1;
				second += 1;
				sum += second;
			}
		}
		System.out.println(cnt);
	}
}

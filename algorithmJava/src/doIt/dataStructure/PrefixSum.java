package doIt.dataStructure;

import java.util.*;
import java.io.*;

/*
숫자합 구하기
백준 11659
기존 리스트와 숫자합을 저장하는 리스트 생성 후 저장 -> 구간 A, B가 있을 때 숫자합 리스트에서 B 인덱스 값 - (A-1 인덱스값)
 */
public class PrefixSum {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken());
		int num = Integer.parseInt(st.nextToken());
		
		int[] list = new int[size];
		int[] listSum = new int[size];
		
		st = new StringTokenizer(br.readLine());

		for(int i=0; i<size; i++) {
			list[i] = Integer.parseInt(st.nextToken());
			if(i==0) listSum[i] = list[i];
			else listSum[i] = list[i] + listSum[i-1];
		}
		
		for(int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			
			if(first-1 == 0) System.out.println(listSum[second-1]);
			else {
				int total = listSum[second-1] - listSum[first-2];
				System.out.println(total);
			}
		}
	}
} 
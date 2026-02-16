/*
백준 4153 (직각삼각형)

피타고라스 정의를 이용해 직각삼각형인지 확인
빗변을 확인해 max에 저장
빗변이 아닌 다른 변들을 plus에 저장
max와 plus가 같으면 right 아닐 시 wrong
 */

package solvedAc.class2;

import java.util.*;
import java.io.*;

public class Num_4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			long first = Long.parseLong(st.nextToken());
			long second = Long.parseLong(st.nextToken());
			long third = Long.parseLong(st.nextToken());
			
			if(first==0 && second==0 && third ==0) break;
			
			long max = 0;
			long plus = 0;
			
			first *= first;
			if(first > max) max = first;
			
			second *= second;
			if(second > max) max = second;

			third *= third;
			if(third > max) max = third;

			if(first == max) plus += second + third;
			else if(second == max) plus += first + third;
			else plus += first + second;
			
			if(max == plus) System.out.println("right");
			else System.out.println("wrong");
		}
	}
}

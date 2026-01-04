package doIt.dataStructure;

import java.util.*;
import java.io.*;

/*
 숫자의 합 구하기
 백준 11720
 문자열로 값을 받은 후 문자열로 변환 -> 0의 아스키 값을 빼서 숫자로 변환 후 저장
 */

public class SumNumber {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int sum = 0;
	
		for(int i=0; i<num; i++) {
			char value = str.charAt(i);
			sum += value - '0';
		}
		
		System.out.println(sum);
		br.close();
	}
}

package doIt.dataStructure;

import java.util.*;
import java.io.*;

/*
 평균 구하기
 백준 1546
 값들을 받은 후 sort로 정렬 -> max 찾은 후 계산
 */

public class Mean {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int count = Integer.parseInt(br.readLine());
		
		String value = br.readLine();
		st = new StringTokenizer(value);
		
		double[] num = new double[count];
		
		for (int i=0; i<count; i++) {
			num[i] = Double.parseDouble(st.nextToken());
		}
		
		Arrays.sort(num);
		
		double max = num[count-1];
		double sum = 0;
		
		for(int i=0; i < count; i++) {
			sum += num[i] / max * 100;

		}
		
		System.out.println(sum/count);
	}
}

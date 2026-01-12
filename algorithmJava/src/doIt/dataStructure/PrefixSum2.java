package doIt.dataStructure;

import java.util.*;
import java.io.*;

/*
백준 11660
구간 합을 구해서 문제풀기
좌표값을 구하면 1,1부터 구한 좌표값까지의 직삭각형 범위의 합을 누적합으로 저장
 */

public class PrefixSum2 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken());
		int num = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[size+1][size+1];
		int[][] arrSum = new int[size+1][size+1];
		
		for(int i=1; i<=size; i++) {
			st = new StringTokenizer(br.readLine());
			for(int z=1; z<=size; z++) {
				arr[i][z] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=1; i<=size; i++) {
			for(int z=1; z<=size; z++) {
				arrSum[i][z] = arrSum[i-1][z] + arrSum[i][z-1] - arrSum[i-1][z-1] + arr[i][z];
			}
		}
		
		for(int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			System.out.println(arrSum[x2][y2] - arrSum[x1-1][y2] - arrSum[x2][y1-1] + arrSum[x1-1][y1-1]);
		}
	}
}

package doIt.dataStructure;

/*
 백준 12891
 DNA 비밀번호
 슬라이딩 윈도우로 비교
 */

import java.util.*;
import java.io.*;

public class DnaPassword {
	
	static char[] arr;
	static int[] dna;
	static int[] dnaCheck;
	static int cnt;
	
	static void check() {
		for(int z=0; z<4; z++) {
			if(dna[z] <= dnaCheck[z]) {
				if(z==3) cnt += 1;
				continue;
			}
			else if(dna[z] > dnaCheck[z]) break;
		}
	}
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());
		
		String str = br.readLine();
		arr = str.toCharArray(); 		
		dna = new int[4];
		dnaCheck = new int[4];
		cnt = 0;
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<4; i++) {
			dna[i] = Integer.parseInt(st.nextToken());
			dnaCheck[i] = 0;
		}
		
		for(int i=0; i<length; i++) {
			if(arr[i] == 'A') dnaCheck[0] += 1;
			else if(arr[i] == 'C') dnaCheck[1] += 1;
			else if(arr[i] == 'G') dnaCheck[2] += 1;
			else if(arr[i] == 'T') dnaCheck[3] += 1;
		}				
		
		check();	//index 0 확인
		
		for(int i=1; i<size - length+1; i++) {
			if(arr[i-1] == 'A') dnaCheck[0] -= 1;
			else if(arr[i-1] == 'C') dnaCheck[1] -= 1;
			else if(arr[i-1] == 'G') dnaCheck[2] -= 1;
			else if(arr[i-1] == 'T') dnaCheck[3] -= 1;
			
			if(arr[i+length-1] == 'A') dnaCheck[0] += 1;
			else if(arr[i+length-1] == 'C') dnaCheck[1] += 1;
			else if(arr[i+length-1] == 'G') dnaCheck[2] += 1;
			else if(arr[i+length-1] =='T') dnaCheck[3] += 1;
			
			check();
		}
		System.out.println(cnt);
	}
}

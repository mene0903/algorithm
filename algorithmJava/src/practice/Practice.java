package practice;

import java.util.*;
import java.io.*;

public class Practice {
	
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	
	int cnt = Integer.parseInt(sc.nextLine());
	String num = sc.nextLine();
	int sum = 0;
	
	StringTokenizer st = new StringTokenizer(num);
	

	for(int i = 0; i<cnt; i++) {
		 sum += Integer.parseInt(st.nextToken());
	}
	
	System.out.println(sum);
	
	}
}
package solvedAc.class2;

import java.util.*;
import java.io.*;

public class Num_11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		Queue<Integer> queue = new LinkedList<>();
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int cnt = 0;
		bw.write("<");
		
		for(int i=1; i<n+1; i++) {
			queue.add(i);
		}
		
		while(!queue.isEmpty()) {
			int del = queue.remove();
			cnt += 1;
			
			if(cnt == k) {
				if(queue.isEmpty()) {
					bw.write(del + ">");
				}
				else {
					bw.write(del + ", ");
				}
				cnt = 0;
				continue;
			}
			
			queue.add(del);
		}
		
		bw.flush();
		bw.close();
	}
}

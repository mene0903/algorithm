package mathematics;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;

public class Num_2217 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int rope[] = new int[num];
		int max = 0;
		int cnt = 1;
		
		for(int i=0; i<num; i++) {
			rope[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(rope);
		for(int i=num-1; i>-1; i--) {
			if (rope[i]*cnt > max) max = rope[i]*cnt;
			cnt += 1;
		}
		System.out.println(max);
	}
}

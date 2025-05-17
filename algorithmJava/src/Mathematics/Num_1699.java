package Mathematics;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Num_1699 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int dp[] = new int[num+1];
		dp[1] = 1;
	
		for (int i=2; i<num+1; i++) {
			dp[i] = i;
			for(int z=1; z*z<=i; z++) {
				dp[i] = Math.min(dp[i], dp[i-z*z]+1);
			}
		}
		System.out.println(dp[num]);
		
	}

}

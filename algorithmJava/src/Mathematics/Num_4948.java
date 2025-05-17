package Mathematics;

import java.util.Scanner;

public class Num_4948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			long n = sc.nextLong();
			long n2 = n*2;
			if(n==0) break;
			if(n==1) {
				System.out.println(1);
				continue;
			}
			int cnt = 0;
			if (n%2 != 0) n += 1;
			
			for(long i = n+1; i<n2; i+=2 ) {
				boolean bool = true;
				long check = (long)Math.sqrt(i);
				
				for(long z=2; z<check+1; z++) {
					if(i%z == 0) {
						bool = false;
						break;
					}
				}
				if(bool) cnt+=1;
			}
			
			System.out.println(cnt);

		}
	}
}

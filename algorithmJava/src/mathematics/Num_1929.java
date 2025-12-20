package mathematics;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Num_1929 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] num = br.readLine().split(" ");
		int firstNum = Integer.parseInt(num[0]);
		int secondNum = Integer.parseInt(num[1]);
		
		for(int i=firstNum; i<secondNum+1; i++) {
			boolean tf = true;
			if(i==1) continue;
			
			for(int z=2; z<=(int)Math.sqrt(i); z++) {  //%가 0이면 소수 x
				if(i%z == 0) {
					tf = false;
					break;
				}
			}
			if(tf==true) System.out.println(i);
		}
	}
}

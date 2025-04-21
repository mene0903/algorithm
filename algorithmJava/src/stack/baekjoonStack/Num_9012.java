package stack.baekjoonStack;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.IOException;

public class Num_9012 {
		public static String correct(String answer) {
		String[] correct = answer.split("");
		int count = 0;
		for (int i=0; i<correct.length; i++) {
			if (correct[i].equals("(")) count+=1;
			else count -= 1;
			if (count<0) return "NO";
		}
		if (count == 0) return "YES";
		else return "NO";
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for (int i=0; i<num; i++) {
			String answer = br.readLine();
			System.out.println(correct(answer));
		}
	}
}

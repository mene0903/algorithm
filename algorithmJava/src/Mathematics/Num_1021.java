package Mathematics;

import java.util.Scanner;
import java.util.LinkedList;

public class Num_1021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> queue = new LinkedList<>();
		
		String[] firstLine = sc.nextLine().split(" ");
		String[] secondLine = sc.nextLine().split(" ");
		int all = Integer.parseInt(firstLine[0]);
		int seq = Integer.parseInt(firstLine[1]);
		int cnt = 0;
		
		for(int i=0; i<all; i++) {
			queue.add(i+1);
		}
		
		for(int i=0; i<seq; i++) {
			int count = 0;
			for(int z=0; z<all-i; z++) {
				if(queue.getFirst()==Integer.parseInt(secondLine[i])) {
					if(count>all-count-i) cnt += all-count-i;  //한개를 찾을 때마다 전체 길이가 1씩 줄어들기에 -i
					else cnt += count;
					queue.poll();
					break;
				}
				int first = queue.getFirst();
				queue.poll();
				queue.add(first);
				count += 1;
			}
		}
		System.out.println(cnt);
	}
}

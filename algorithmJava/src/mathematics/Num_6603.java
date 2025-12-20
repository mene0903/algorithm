package mathematics;

import java.util.Scanner;

public class Num_6603 {
	static int arr[];
    static int[] selected = new int[6];

	static void dfs(int a, int b) {
		if(a == 6) {
			for(int i=0; i<selected.length; i++) {
                System.out.print(selected[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i=b; i<arr.length; i++) {
			selected[a] = arr[i];
			dfs(a+1, i+1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean tf = true;
	
		while(true) {
			int num = sc.nextInt();
			
			if(num==0) break;
			
			arr = new int[num];
			for (int i=0; i<num; i++) {
				arr[i] = sc.nextInt();
			}
			if(!tf) System.out.println();
			tf = false;
			
			dfs(0,0);
		}
	}

}

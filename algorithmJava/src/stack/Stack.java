package stack;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack {
	private static ArrayList<Integer> stack = new ArrayList<>();   //정수로 입력받는다 가정
	static int top = 0;
	
	private static void push(int num) {
		top += 1;
		stack.add(num);
	}
	
	private static void pop() {
		stack.remove(top-1);
		top -= 1;
	}
	
	private static int getTop() {
		return stack.get(top-1);
	}

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.printf("pop = 1, push = 2, 현재 스택의 상단값 = 3, 그만하고 싶으면 0 : ");
			int decision = sc.nextInt();
			if (decision == 1) {
				System.out.printf("push할 값을 입력해주세요: ");
				int num = sc.nextInt();
				push(num);
			}
			else if (decision == 2) {
				if (stack.isEmpty()) {
					System.out.println("값이 없습니다.");
					continue;
				}
				pop();
			}
			else if (decision == 3) {
				if (stack.isEmpty()) {
					System.out.println("값이 없습니다.");
					continue;
				}
				System.out.println("현재 스택의 TOP는 = " + top + "번째, TOP의 값은 = " + getTop());
			}
			else break;
		}
	}
}


/*
스택 LIFO (Last In First Out)
push = 데이터 값 push
pop  = 데이터 값 pop
스택의 TOP이 n이라 할 때 pop을 해주면 n-=1
*/
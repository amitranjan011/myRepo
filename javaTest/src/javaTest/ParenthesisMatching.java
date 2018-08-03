package javaTest;

import java.util.Stack;

public class ParenthesisMatching {

	public static void main(String[] args) {
		String str = "a(b(c(()))";
		check1(str);

	}

	private static void check(String str) {
		Stack<Character> st = new Stack<>();
		for (char c : str.toCharArray()) {
			
			if (c == '(') {
				System.out.println(c);
				st.push(c);
			} else if (c == ')') {
				System.out.println(c);
				if (!st.isEmpty()) {
					char temp = st.pop();
					if (temp != '(') {
						System.out.println("not matching");
					}
				} else if (st.isEmpty()) {
					System.out.println("not matching");
				}
			}
		}
	}

	
	private static void check1(String str) {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '(') {
				stack.push(i);
			}
			
			if (c == ')') {
				if (stack.isEmpty()) {
					System.out.println("'(' is unmatched at position " + i + 1);
				} else {
					int pop = stack.pop() + 1;
					System.out.println("'(' at position " + pop + " is matched with ')' at position " + i + 1);
				}
			}
		}
		
		while(!stack.isEmpty()) {
			int pop = stack.pop() + 1;
			System.out.println("( is unmatched at position " + pop);
		}
	}
}

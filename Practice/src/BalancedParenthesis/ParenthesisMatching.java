package BalancedParenthesis;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisMatching {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Expression");
		String str = scan.next();
		//Stack<Integer> stk =new Stack<Integer>();
		StackInt stk =new StackInt(10);
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '('|| ch =='{'||ch=='[')
				stk.push(i);
			else if (ch == ')' || ch == '}' || ch==']') {
				try {
					int p = stk.pop() + 1;
					System.out.println("')' is Matched at" + p);
				} catch (Exception e) {
					System.out.println("')' is unmatched at index" + (i + 1));
				}
			}

		}
		while (!stk.isEmpty()) {
			System.out.println("'(' is unmatched at index" + (stk.pop() + 1));
		}

	}

}

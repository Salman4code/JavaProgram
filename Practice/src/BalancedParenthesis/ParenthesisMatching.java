package BalancedParenthesis;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisMatching {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Expression");
		String str = scan.next();
		//Stack<Character> stk = new Stack<Character>();
		char ch[] = str.toCharArray();
		int flag = 0;
	 StackInt stk =new StackInt(10);
		for (int i = 0; i < str.length(); i++) {

			if (ch[0] != '(') {
				flag++;
				break;
			}
			/*
			 * if (ch == '(') stk.push(i); else if (ch == ')') { try { int p =
			 * stk.pop() + 1; System.out.println("')' is Matched at " + p); }
			 * catch (Exception e) {
			 * System.out.println("')' is unmatched at index " + (i + 1)); } }
			 * 
			 * } while (!stk.isEmpty()) {
			 * System.out.println("'(' is unmatched at index " + (stk.pop() +
			 * 1)); }
			 */
			if (ch[i] == '(' || ch[i]=='['||ch[i]=='{') {
				stk.push(ch[i]);

			} else if (ch[i] == ')'||ch[i]==']'||ch[i]=='}') {
				stk.pop();
			}
		}
		if (stk.isEmpty()) 
			System.out.println("Balanced");
		 else 
			System.out.println("Not balanced");
		}
	

}

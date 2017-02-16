package BalancedParenthesis;

import java.util.Scanner;

public class ParenthesisMatching {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Expression");
		String str = scan.next();
		Stack stk =new Stack(5);
		for (int i = 0; i < str.length(); i++) {
			char ch =str.charAt(i);
			if(ch=='(')
			stk.push(ch);
			else if(ch==')')
			{
			try
			{
				int p =stk.pop()+1;
				System.out.println("')' is Matched at"+p);
			}
			catch(Exception e)
			{
				System.out.println();
			}
			}
		}
	}

}

package BasicProgram;

import java.util.Scanner;

public class QuestionNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first, last, middle, key;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int range = (int) Math.pow(2, n - 1);
		System.out.println(range);
		System.out.println("Please enter number between 0 to " + range);
		key = sc.nextInt();
		first = 0;
		last = range;
		middle = (first + last) / 2;
		String input = null;
		findNUmber(first, last, middle, range, input,n);
	}

	private static void findNUmber(int first, int last, int middle, int range, String input,int n) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Is your number is\t" + middle);
		System.out.println("Please type yes or high or low");

		input = sc.nextLine();
		int count=0;
		if (input.equals("yes")) {
			System.out.println("your number is" + middle);
			count++;
			return;
		} else if (input.equals("low")) {
			last = middle;
			count++;
		} else if (input.equals("high")) {
			first = middle;
			count++;
		}
		if(count<n)
		{
			middle=(first+last)+1/2;
			System.out.println("Is your number is"+middle);
			input =sc.nextLine();
		}
	}
	/*
	 * public static int power(int p,int n) { int powerOfTwo = 1; int i=0; if(n>=0 &&
	 * n<31) { while (i <= n) { //System.out.println(i + " " + powerOfTwo);
	 * powerOfTwo = 2 * powerOfTwo; i = i + 1; return powerOfTwo; } } else
	 * System.out.println("Input must be between 0 to 31");
	 * 
	 * }
	 */

}

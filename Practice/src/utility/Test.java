package utility;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputInteger();
		InputString();
		SearchInteger();
		
	}

	public static void InputInteger() {
		utility u1 = new utility();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr1[] = new int[n];
		System.out.println("Enter " + n + "number");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		u1.bubblesortInteger(arr1);
		for (int j = 0; j < arr1.length; j++) {

			System.out.println(arr1[j]);
		}
	}

	public static void InputString() {
		utility u1 = new utility();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		String arr1[] = new String[n];
		System.out.println("Enter\t" + n + "\tString ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.next();
		}
		u1.bubblesortString(arr1);
		// u1.insertionsortString(arr1);

		System.out.println("The Sorted String is" + Arrays.toString(arr1));

	}
 public static void SearchInteger()
 {
	 utility u1 =new utility();
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter size of array");
	 int n = sc.nextInt();
	 int arr[]=new int[n];
	 System.out.println("Enter\t"+n+"\tNumber");
	 for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	 System.out.println("Enter number you want to search");
	 int key = sc.nextInt();
	 u1.BinarySearchInteger(arr, key);
	 for (int j = 0; j < arr.length; j++) {
	 System.out.println(arr[j]);
	 }
 }
 public static void SearchString() {
		utility u1 = new utility();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		String arr1[] = new String[n];
		System.out.println("Enter\t" + n + "\tString ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.next();
		}
		System.out.println("Enter key to search");
		String key=sc.next();
		int p=u1.BinarySearchString(arr1, key);
		// u1.insertionsortString(arr1);

		System.out.println("The Sorted String is" + Arrays.toString(arr1));

	}
}
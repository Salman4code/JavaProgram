package BasicProgram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchword {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String arr1[];
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter How many Alphabate in word you want to
		// enter");
		// int n = sc.nextInt();
		// arr1 = new String[n];

		InputStream in = new FileInputStream(new File("/home/bridgeit/workspace/Practice/src/BasicProgram/abc.txt"));

		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		String strp = "";
		StringBuilder out = new StringBuilder();
		String line = "";
		while ((line = reader.readLine()) != null) {
			// out.append(line);
			strp += line;

		}
		System.out.println(out.toString()); // Prints the string content read //
											// from input stream
		reader.close();
		String str[] = strp.split(" ");
		/*
		 * System.out.println("Enter String alphabtes"); for (int i = 0; i
		 * <str.length; i++) { str[i]=sc.next(); //arr1[i] = sc.next(); }
		 */
		Arrays.sort(str);
		System.out.println("Sorted Order for String is");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

		System.out.println("Enter the string you want to search");
		String search = sc.next();
		int p = binarysearch(str, search);
		if (p == -1) {
			System.out.println("String not found ");
		} else {
			System.out.println("String found at location\t" + p);
		}
	}

	public static int binarysearch(String arr1[], String key) {
		int first = 0, middle;
		int last = arr1.length;
		while (first < last) {
			middle = (first + last) / 2;
			if (key.compareTo(arr1[middle]) > 0) {
				first = middle + 1;
			} else if (key.compareTo(arr1[middle]) < 0) {
				last = middle;
			} else {
				return middle;
			}
		}
		return -1;
	}
}
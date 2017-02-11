import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String one");
		String str1 = sc.nextLine();
		System.out.println("Enter String two");
		String str2 = sc.nextLine();

		char[] ch1 = str1.toLowerCase().replaceAll("\\s+", "").toCharArray();
		char[] ch2 = str2.toLowerCase().replaceAll("\\s+", "").toCharArray();

		System.out.println(ch1);
		System.out.println(ch2);
		int len = ch1.length;
		int len1 = ch2.length;
		if (len == len1) {
			Arrays.sort(ch1);
			Arrays.sort(ch2);

		//	if (Arrays.equals(ch1, ch2)) 
			if(ch1==ch2)
			{
				System.out.println("String are Anagram");
			} else {
				System.out.println("String are not Anagram");
			}
		} else {
			System.out.println("Both String must be of same size");
		}
	}
}
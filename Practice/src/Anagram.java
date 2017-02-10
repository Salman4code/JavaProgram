import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String one");
		String str1 = sc.nextLine();
		System.out.println("Enter String two");
		String str2 = sc.nextLine();
		
		String str3 =str1.toLowerCase().replaceAll("\\s+","");
		String str4 = str2.toLowerCase().replaceAll("\\s+","");

		System.out.println(str3);
		System.out.println(str4);
	}

}

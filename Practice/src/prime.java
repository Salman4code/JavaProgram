import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n, sum = 0;
		n = sc.nextInt();
		int flag;
		for (int i = 1; i < n; i++) {
			flag = 0;
			for (int j = 2; j < i / 2; j++) {

				if (i % j == 0) {
					flag++;
					break;
				}
			}
			if (flag == 0) {

				if (n % i == 0) {
					System.out.println(i);
				}
			}
		}
	}
}
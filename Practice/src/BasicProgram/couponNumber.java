
package BasicProgram;
import java.util.Random;
import java.util.Scanner;

public class couponNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many coupan number you want");
		n= sc.nextInt();

		int array[] = new int[n];

		for (int i = 0; i < 10; i++) {
			Random r = new Random();
			int random1 = r.nextInt(20);
			array[i] = random1;
			count++;

			for (int j = 0; j < i; j++) {
				if (array[j] == array[i]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Unique Coupon\t"+i+"\tnumber\t"+ array[i]);

		}
		System.out.println("Number of Random generated are\t" + count);
	}

}

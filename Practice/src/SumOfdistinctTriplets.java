import java.util.Scanner;

public class SumOfdistinctTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many number you want");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " Integer ");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		SumOfThree(arr);
	}

	private static void SumOfThree(int[] arr1) {

		int n = arr1.length;
		int count = 0;
		for (int i = 0; i < n-2; i++) {
			for (int j = i + 1; j <n-1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr1[i] + arr1[j] + arr1[k] == 0) {
						System.out.println("First Distinct Triplets");
						System.out.println("Number are "+arr1[i]+" "+arr1[j]+" "+arr1[k]);
						count++;
					}
					else
					{
						System.out.println("Number are Not distinst triple");
					}
						

				}
			}
		}

	}

}

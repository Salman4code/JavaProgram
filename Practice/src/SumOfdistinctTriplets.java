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
		SumOfdistinctTriplets.SumOfThree(arr);
	}

	public static void SumOfThree(int[] arr1) {

		int n = arr1.length;
		int count = 0, res = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					res =arr1[i]+arr1[j]+arr1[k];
					if (arr1[i] + arr1[j] + arr1[k] == 0) 
					{
						System.out.println("Number are present\t" + arr1[i] + " " + arr1[j] + " " + arr1[k]+"\t at Position\t"+i+" "+j+" "+k);
						count=0;
						}
					} 
				}
			}
			if(count==1)
			{
				System.out.println("Triples are not Present");
				
			}
			
		}

	}



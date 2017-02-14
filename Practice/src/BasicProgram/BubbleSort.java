package BasicProgram;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 30, 40, 50, 10, 20 };

		bubblesort(arr1);
		for(int i=0 ;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}

	private static void bubblesort(int[] arr1) {
		// TODO Auto-generated method stub
		int n = arr1.length;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n-i); j++) {
				if(arr1[j-1]>arr1[j])
				{
					int temp = arr1[j-1];
					arr1[j-1]	=	arr1[j];
					arr1[j] = temp;
				}

			}
		}
	}

}

package utility;

public class utility {

	public void bubblesortInteger(int[] arr1) {
		// TODO Auto-generated method stub
		int n = arr1.length;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr1[j - 1] > arr1[j]) {
					int temp = arr1[j - 1];
					arr1[j - 1] = arr1[j];
					arr1[j] = temp;
				}

			}
		}
	}

	public void insertionSort(int[] arr2)
	{
		for (int j = 1; j < arr2.length; j++) {
			int key = arr2[j];
			int i=j-1;
			while(i>=0 && arr2[i]>key)
			{
				arr2[i+1]=arr2[i];
				i--;
			}
			arr2[i+1]=key;
		}
	}
	public void insertionsort(String arr1[]) {
		int len = arr1.length;
		for(int j=1;j<len;j++)
		{
			String key = arr1[j];
			int i =j-1;
			while(i>=0)
			{
				if(key.compareTo(arr1[i]) > 0)
				{
					break;
				}
				arr1[i+1]=arr1[i];
				i--;
			}
			arr1[i+1]=key;
		}
}
}
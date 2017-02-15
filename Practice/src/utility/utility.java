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

	public void bubblesortString(String[] arr1) {
		// TODO Auto-generated method stub
		int n = arr1.length;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr1[j - 1].compareTo(arr1[j]) > 0) {
					String temp = arr1[j - 1];
					arr1[j - 1] = arr1[j];
					arr1[j] = temp;
				}

			}
		}
	}

	public void insertionSortInteger(int[] arr2) {
		for (int j = 1; j < arr2.length; j++) {
			int key = arr2[j];
			int i = j - 1;
			while (i >= 0 && arr2[i] > key) {
				arr2[i + 1] = arr2[i];
				i--;
			}
			arr2[i + 1] = key;
		}
	}

	public void insertionsortString(String arr1[]) {
		int len = arr1.length;
		for (int j = 1; j < len; j++) {
			String key = arr1[j];
			int i = j - 1;
			while (i >= 0) {
				if (key.compareTo(arr1[i]) > 0) {
					break;
				}
				arr1[i + 1] = arr1[i];
				i--;
			}
			arr1[i + 1] = key;
		}
	}

	public static int BinarySearchString(String arr1[], String key) {

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

	public void BinarySearchInteger(int arr[], int key) {
		int first = 0, last, middle;
		bubblesortInteger(arr);
		last = arr.length-1;
		middle = (first + last) / 2;
		while (first <last) {
			if (arr[middle] < key) {
				first = middle + 1;
			} else if (arr[middle] == key) {
				System.out.println("Number Found at location\t" + middle);
				break;
			} 
			else 
				last = middle - 1;
			
			middle = (first + last) / 2;
		}
		if (first > last) {
			System.out.println(key + " is not present");
		}
	}
}

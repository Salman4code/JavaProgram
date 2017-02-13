package BasicProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String arr1[] = {"D","E","A","C","B"};

		insertionsort(arr1);
	
		
			System.out.println(Arrays.toString(arr1));
		
	}

	public static void insertionsort(String arr1[]) {
		int len = arr1.length;
		for(int j=1;j<len;j++)
		{
			String key = arr1[j];
			int i =j-1;
			while(i>0)
			{
				if(key.compareTo(arr1[i])<0)
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

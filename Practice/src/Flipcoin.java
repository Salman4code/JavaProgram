import java.util.Scanner;

public class Flipcoin {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of time coin to be flip");
	int n = sc.nextInt();
	double tail = 0,head = 0;

	
	for(int i=0;i<n;i++)
	{
		double num = Math.random();
		System.out.println(num);
		if(num<0.5)
		{
			tail++;
		
		System.out.println("tail"+tail);
		}
		else
		{
		head++;
		System.out.println("Head"+head);
	}
		}
	
	double hper = (head/n)*100.0;
	double tper = (tail/n)*100.0;
	System.out.println("Head Flip Percentage"+hper);
	System.out.println("Tail Flip Percentage"+tper);
	
}
}

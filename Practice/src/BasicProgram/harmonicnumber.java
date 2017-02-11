package BasicProgram;
import java.util.Scanner;

public class harmonicnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many harmonic Number you want");
		int n = sc.nextInt();
		double num=0.1;
		double sum=0.0;
		for(int i=1;i<n;i++)
		{
			
			sum = sum+num/i;
			System.out.println(sum);
		}
		
		System.out.println("Harmonic Number are"+sum);
	}

}

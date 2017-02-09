
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 63, sum = 0;
		int flag;
		for (int i = 1; i < n; i++)
		{
			flag = 0;
			for (int j = 2; j < i/2; j++) 
			{

				if (i % j == 0) 
				{
					flag ++;
					break;
				}
			}
				if (flag == 0) {
					
				if(n%i==0){
					System.out.println(i);
				}
				//	sum = sum + i;
				}

			}
		
//System.out.println(sum);
	}
}
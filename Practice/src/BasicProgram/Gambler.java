package BasicProgram;
import java.util.Scanner;

public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int $stake, $goal, No_of_times;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter $Stake value");
		$stake = sc.nextInt();
		System.out.println("Enter $ goal value");
		$goal = sc.nextInt();
		System.out.println("Enter Number of time you bet");
		No_of_times = sc.nextInt();
		int bet = 0;
		int win=0;
		double wper;
		
		
		for (int i = 0; i < No_of_times; i++) {
			double num = Math.random();
			if (num < 0.5) {
				win++;
				$stake++;
			}
			else
			{
				$stake--;
			}
		if($stake==$goal)
		{
			wper=((double)win/i)*100;
			System.out.println("Lose Percetage"+(100.0-wper));
			System.out.println("Win Percentage"+wper);
			System.out.println("Win");
			return;
		}
		else if($stake==0)
		{
			wper=((double)win/i)*100;
			System.out.println("lose Percetage"+(100.0-wper));
			System.out.println("win Percentage"+wper);
			System.out.println("loss");
			return;
		}

	}
System.out.println("please bet again");
}
}
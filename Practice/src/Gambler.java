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
				System.out.println($stake);
			}
			else
			{
				$stake--;
				System.out.println($stake);
			}
		if($stake==$goal)
		{
			wper=(double)(win/No_of_times)*100;
			System.out.println("Win Percetage"+(100-wper));
			System.out.println("lose Percentage"+wper);
			System.out.println("Win");
			return;
		}
		else if($stake==0)
		{
			wper=(win/No_of_times)*100;
			System.out.println("WIN Percetage"+(100-wper));
			System.out.println("Lose Percentage"+wper);
			System.out.println("loss");
			return;
		}

	}
System.out.println("please bet again");
}
}
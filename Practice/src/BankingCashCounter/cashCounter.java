package BankingCashCounter;

import java.util.Scanner;

public class cashCounter {
public static void main(String[] args) {
	Queue q = new Queue();
	int count=0;
	People p =new People();
	q.insert(p);
	System.out.println(q.getsize());
	Scanner sc = new Scanner(System.in);
	do
	{
	System.out.println("Welcome to Cash Counter");
	System.out.println("1.Desposit");
	System.out.println("2.Withdraw");
	System.out.println("3.Show Balance");
	System.out.println("4.people in the queue");
	int choice=sc.nextInt();
	
	
	switch(choice){
	case 1:
		System.out.println("Enter the Amount to Deposit");
		double credit =sc.nextInt();
		p.deposit(credit);
		q.remove();
		break;
	case 2:
		System.out.println("Enter the Amount to withdraw");
		double debit =sc.nextInt();
		p.withdraw(debit);
		q.remove();
		break;
	case 3:
		System.out.println("Your balance is");
		System.out.println(p.Balance());
		break;
	case 4:
		q.insert(new People());
		count++;
		System.out.println("People in the queue"+q.getsize());
		break;
	default:
		System.out.println("invalid input");
		
	}
	}
	
	while(iscontinue());
	
}
public static boolean iscontinue() {
	Scanner sc =new Scanner(System.in);
	System.out.println("Do you want to continue type yes or no");
	String ch=sc.nextLine();
	if(ch.equals("yes"))
		return true;
	else 
		return false;
}
}

package Stockreport;

import java.util.ArrayList;
import java.util.Scanner;



public class StockPortfolio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList a1 = new ArrayList();
		System.out.println("Enter Number of Stock you want");
		int n = sc.nextInt();
		String nm;
		int sh;
		double pr;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter [" + i + "] Stock Names");
			nm = sc.next();
			System.out.println("Enter Number Of Share");
			sh = sc.nextInt();
			System.out.println("Enter Share Price");
			pr = sc.nextInt();
			Stock stk = new Stock(nm, sh, pr);
			a1.add(stk);
		}
		
		System.out.println("Stock Detail Are::");
		Stock s =new Stock();
		for(int i=0;i<a1.size();i++)
			{
				System.out.println(a1.get(i));
				//System.out.println(s.calculateStock());
			}
 
			
		
	}

	
}

package BasicProgram;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Stopwatch {

	public static void main(String[] args) {

		/*
		 * Calendar cal = Calendar.getInstance(); SimpleDateFormat sdf = new
		 * SimpleDateFormat("HH:mm:ss"); System.out.println(
		 * sdf.format(cal.getTime()) );
		 */
		long starttime = 0;
		long stoptime = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter 0 to Start the watch");
		int s = sc.nextInt();

		if (s == 0) {
			starttime = System.currentTimeMillis();
			System.out.println(starttime);
		} else {
			System.out.println("You have entered wrong number");
		
			while (s!= 0) {
				System.out.println("Please Enter 0 to start the watch");
				s=sc.nextInt();
				if(s==0){
					starttime = System.currentTimeMillis();
				}
			}
		}
		System.out.println("Please Enter 1 to stop the Watch");
		int stp = sc.nextInt();
		if (stp == 1) {
			stoptime = System.currentTimeMillis();

		} else {
			System.out.println("You have entered wrong number");
			while (s!= 1) {
				System.out.println("Please Enter 1 to start the watch");
				s=sc.nextInt();
				if(s==1){
					stoptime = System.currentTimeMillis();
				}
		}}
		long TimeElapsesd = (stoptime - starttime);
		System.out.println("Time Elapsed between Start and stop \t" + TimeElapsesd);
		long second = TimeElapsesd / 1000;
		System.out.println("Time in second " + second);

		/*
		 * double start = System.currentTimeMillis();
		 * System.out.println("Start Time is\t"+start); double end
		 * =System.currentTimeMillis();
		 */
	}

}


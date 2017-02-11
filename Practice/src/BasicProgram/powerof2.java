package BasicProgram;
import java.util.Scanner;

public class powerof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// read in one command-line argument
        int n = Integer.parseInt(args[0]);

        int i = 0;         	
        //System.out.println("Enter any number");
        int powerOfTwo = 1;       

        if(n>=0 && n<31)
        {
        while (i <= n) {
            System.out.println(i + " " + powerOfTwo);  
            powerOfTwo = 2 * powerOfTwo;          
            i = i + 1;
        }
        }
        else
        	System.out.println("Input must be between 0 to 31");
	
	}
}

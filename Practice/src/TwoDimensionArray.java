import java.awt.DisplayMode;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows You want");
		r = sc.nextInt();
		System.out.println("Enter Number of column You want");
		c = sc.nextInt();

		int AI[][] = ArrayInteger(r, c);
		double AD[][] = ArrayDouble(r, c);
		String AS[][]= ArrayString(r,c);
		
		Display(AI,AD,AS,r,c);

	}

	private static String[][] ArrayString(int r, int c) {
		String AS[][]= new String[r][c];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer Value");
		System.out.println("Enter Number to be Stored on the Array");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				AS[i][j] = sc.next();

			}
System.out.println();
		}

		return AS;
	}

	//
	public static int[][] ArrayInteger(int r, int c) {
		int AI[][] = new int[r][c];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer Value");
		System.out.println("Enter Number to be Stored on the Array");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				AI[i][j] = sc.nextInt();

			}
System.out.println();
		}
		return AI;
	}

	public static double[][] ArrayDouble(int r, int c) {
		double AD[][] = new double[r][c];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Double Value");
		System.out.println("Enter Number to be Stored on the Array");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				AD[i][j] = sc.nextDouble();

			}
System.out.println();
		}
		return AD;
	}

	public static void Display(int AI[][],double AD[][],String AS[][], int r, int c) {
		
		
		PrintWriter pw = new PrintWriter(System.out,true);
		
		//For Array Integer
		
		pw.println("\t Matrix for Integer value \n");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				pw.print("\t" + AI[i][j]);
			}
			pw.println();
		}
		
		//For Array Double
		pw.println("\tMatrix for double value \n");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				pw.print("\t" + AD[i][j]);

			}
			pw.println("\t");
		}
		
		//For Array String
		pw.println("\t Matrix for String \n");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				pw.print("\t" + AS[i][j]);

			}
			pw.println("\t");
			pw.flush();
		}
	}

}

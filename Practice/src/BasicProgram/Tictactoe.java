package BasicProgram;

import java.util.Scanner;

public class Tictactoe {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome To tic tac toe game");

		int num = 1, r = 3, c = 3;
		int pos[][] = new int[r][c];

		// Assigning Number to the Position

		for (int i = 0; i < pos.length; i++) {
			for (int j = 0; j < pos.length; j++) {
				pos[i][j] = num;
				num++;
			}
		}

		// Displaying Number to the position
		Display(pos, r, c);

		// System.out.println("Enter ");
		// Accept input from user
		for (int i = 0; i < 9; i++) {
			int A;
			System.out.println("User 1 turn");
			System.out.println("Enter the position number where you want to type 0");
			A = sc.nextInt();
			if (A == 1 || A == 2 || A == 3) {
				r = 0;
				c = A - 1;
			} else if (A == 4 || A == 5 || A == 6) {
				r = 1;
				c = A - 4;
			} else if (A == 7 || A == 8 || A == 9) {
				r = 2;
				c = A - 7;
			}
			if (pos[r][c] != 1 && pos[r][c] != 0) {
				pos[r][c] = 0;
			}
			Display(pos, r, c);

			int B;
			System.out.println("User 2 its your turn");
			System.out.println("Enter the position number where you want to type 1");
			B = sc.nextInt();
			if (B == 1 || B == 2 || B == 3) {
				r = 0;
				c = B - 1;
			} else if (B == 4 || B == 5 || B == 6) {
				r = 1;
				c = B - 4;
			} else if (B == 7 || B == 8 || B == 9) {
				r = 2;
				c = B - 7;
			}
			if (pos[r][c] != 1 && pos[r][c] != 0) {
				pos[r][c] = 1;
			}
			Display(pos, r, c);
		}
		if ((pos[r][0] == 1 && pos[r][1] == 1 && pos[r][2] == 1) || (pos[0][c] == 1 && pos[1][c] == 1 && pos[2][c] == 1)
				|| (pos[0][0] == 1 && pos[1][1] == 1 && pos[2][2] == 1)
				|| (pos[0][2] == 1 && pos[1][1] == 1 & pos[2][0] == 1)) {
			System.out.println("You won");
		}

	}

	public static void Display(int pos[][], int r, int c) {

		for (int k = 0; k < pos.length; k++) {
			for (int i = 0; i < pos.length; i++) {
				System.out.print("\t");
				System.out.print(pos[k][i] + "\t");
			}
			System.out.println();

		}
	}
}
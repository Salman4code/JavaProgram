import java.util.Scanner;

public class Tictactoe {

	public static void main(String[] args) {
		
		
		 	        
		Scanner sc =new Scanner(System.in);
		System.out.println("Welcome To tic tac toe game");
		
		int num=1,r=3,c=3;
		int  pos[][] =new int[r][c];
		
		//Assigning Number to the Position
		
		for (int i = 0; i < pos.length; i++) {
			for (int j = 0; j < pos.length; j++) {
				pos[i][j]=num;
				num++;	
			}		
		}
		 
		//Displaying Number to the position
		Display(pos, r, c);
		
		//System.out.println("Enter ");
		//Accept input from user
		int A;
		System.out.println("Enter the position number where you want to type X");
		A=sc.nextInt(); 
		if(A==1 || A==2 || A==3)
		{
			pos[0][0]=0;
		}
		Display(pos, r, c);
}
	public static void Display(int pos[][],int r,int c) {
		

		for(int k=0;k<pos.length;k++)
		{
			for (int i = 0; i < pos.length; i++) {
				System.out.print("\t");
				System.out.print(pos[k][i]+"\t");	
			}
			System.out.println();
	}
	}
}
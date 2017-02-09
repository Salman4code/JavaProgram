import java.io.*;
import java.util.Scanner;
public class Flipcoin
{
public static void main(String args[])
{
int no_of_times;
int head=0;
int tail=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number of time coin to be flip");
no_of_times=sc.nextInt();
double random=Math.random();
for(int i=0;i<=no_of_times;i++)
{
if(random<0.5)
tail++;
else
head++;
}
System.out.println("Tail flip"+tail);
System.out.println("Head flip"+head);
}
}

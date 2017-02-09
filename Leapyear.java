import java.io.*;
import java.util.Scanner;
public class Leapyear{

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int year;
System.out.println("Enter Year");
year = sc.nextInt();
int temp = year;
int count=0;
while(temp>0)
{
temp=temp/10;
count++;
}
if(count==4)
{
if(year%4==0)
System.out.println("Year is a Leap Year");
else
System.out.println("Year is not a leap year");
}
else
System.out.println("Digit must a 4 digit in number");
}
}


import java.io.*;
import java.util.Scanner;
public class Username{

public static void main(String args[]) 
{
String str;
Scanner sc = new Scanner(System.in);
System.out.print("Enter User Name(Max Character 3)");
str = sc.nextLine();
int len = str.length();
if(len>3)
System.out.println("Hello "+str+",How Are You");
else
System.out.println("Character Must be of 4 digit");
}
}


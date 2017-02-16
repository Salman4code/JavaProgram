package BalancedParenthesis;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Stack {
	protected int Top,len,size;
	protected int stk[];
	public Stack(int n)
	{
		size=n;
		stk = new int[size];
		Top=-1;
		len=0;
	}
	public int isFull() {
		return Top=size-1;
	}
	public boolean isEmpty(){
		return Top==-1;
	}
	public int getsize()
	{
		return len;
	}
	public int peek()
	{
		return stk[Top];
	}
	public void push(int i)
	{
	if(Top+1>=size) throw new NoSuchElementException("underflow Exception");	
	
	if(Top+1<size)
	{
		stk[++Top]=i;
	}
	len++;
	}
	public int pop()
	{
		if(isEmpty()) throw new NoSuchElementException("Underflow Exception");
		
		len--;
		return stk[--Top];
	}
	public void display()
	{
		if(len==0)
		{
			System.out.println("Stack is Empty");
			return;
		}
		for(int i=Top;i>=0;i--)
		{
			System.out.println("Stack Element are\t"+stk[i]);
		}
	}
/*	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int ns =sc.nextInt();
		Stack s =new Stack(ns);
		s.push(45);
		s.push(65);
		s.push(20);
		s.display();
		s.pop();
		s.pop();
		s.display();
	}*/

}

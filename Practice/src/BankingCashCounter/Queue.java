package BankingCashCounter;
import java.util.Scanner;

public class Queue {
 protected Object arr[];
 int rear,front,size,len;
 public Queue()
 {
	 size = 100;
	 len=0;
	 arr=new Object[size];
	 rear=-1;
	 front =-1;
	
 }
 public boolean isEmpty()
 {
	 return front==-1;
 }
 public boolean isFull()
 {
	 return rear==size-1 && front==0 ;
 }
 public int getsize()
 {
	 return len;
 }
/* public int peek()
 {
	// return arr[rear];
 }*/
 public boolean insert(Object val)
 {
	 if(rear==-1)
	 {
		 front=0;
		 rear=0;
		 arr[rear]=val;
		 len++;
		 return true;
	 }
	 else if(rear+1<size)
	 {
		 arr[++rear]=val;
	 len++;
	 return true;
	 }
	 throw new StackOverflowError();
 }
 public Object remove()
 {
	 len--;
	 Object ele =arr[front];
	 if(front==rear)
	 {
		 front=-1;
		 rear=-1;
	 }
	 else
		 front++;
	 return null;
 }
 public void display()
 {
	 if(len==0)
	 {
		 System.out.println("Queue is empty");
		 return;
	 }
	 for(int i =front ;i<=rear;i++)
	 {
		 System.out.println(arr[i]);
	 }
 }
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Size of queue");
		int n=sc.nextInt();
		Queue q = new Queue(n);
		//q.insert(10);
		q.display();
	}*/

}

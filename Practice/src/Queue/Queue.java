package Queue;
import java.util.Scanner;

public class Queue {
 protected int arr[],rear,front,size,len;
 public Queue(int n)
 {
	 size = n;
	 arr=new int[n];
	 rear=-1;
	 front =-1;
	 len=0;
 }
 public boolean isEmpty()
 {
	 return front==-1;
 }
 public boolean isFull()
 {
	 return rear==size-1 && front==0 ;
 }
 public void insert(int val)
 {
	 if(rear==-1)
	 {
		 arr[++rear]=val;
		 len++;
	 }
	 else if(rear+1<size)
		 arr[++rear]=val;
	 len++;
 }
 public int remove()
 {
	 len--;
	 int ele =arr[front];
	 if(front==rear)
	 {
		 front=-1;
		 rear=-1;
	 }
	 else
		 front++;
	 return ele;
 }
 public void display()
 {
	 if(len==0)
	 {
		 System.out.println("Queue is empty");
		 return;
	 }
	 for(int i =front ;i<rear;i++)
	 {
		 System.out.println(arr[i]);
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Size of queue");
		int n=sc.nextInt();
		Queue q = new Queue(n);
		q.insert(10);
	}

}

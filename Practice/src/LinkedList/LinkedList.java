package LinkedList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LinkedList {
	protected Node start;
	protected Node end;
	protected int size;

  public LinkedList() {
		// TODO Auto-generated constructor stub
	  start=null;
	  end=null;
	  size=0;
	}
		public void insertAtStart(int val) {
			Node nptr = new Node(val,null);
			size++;
			if(start==null)
			{
				start = nptr;
				end = start;
			}
			else
				nptr.setLink(start);
				start= nptr;
		}
		public void insertAtEnd(int val) {
			Node nptr = new Node(val,null);
			size++;
			if(start==null)
			{
				start = nptr;
				end = start;
			}
			else
				end.setLink(nptr);
				end= nptr;
		}
		public void insertAtpos(int val,int pos) {
			Node nptr = new Node(val,null);
			Node ptr = start;
			pos =pos-1;
			for (int i = 1; i < size; i++) {
				if(i==pos)
				{
					Node tmp = ptr.getLink();
					ptr.setLink(nptr);
					nptr.setLink(tmp);
				}
				ptr=ptr.getLink();
			}
			size++;
		}
	
		public void remove(int pos)
		{
			
		}
		public void display()
		{
			if(size==0)
			{
				System.out.println("Linked list empty");
				return;
			}
		
			if(start.getLink()==null)
			{
				System.out.println(start.getData()+"->");
			}
			Node ptr = start;
			System.out.print(start.getData()+"->");
			ptr= ptr.getLink();
			while(ptr.getLink()!=null)
			{
				System.out.print(ptr.getData()+"->");
				ptr= ptr.getLink();
			}
			System.out.println(ptr.getData());
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            FileReader reader = new FileReader("/home/bridgeit/workspace/Practice/src/LinkedList/test.txt");
	            BufferedReader bufferread = new BufferedReader(reader);
	            String character;
	            String strp="";
	            while ((character = bufferread.readLine()) != null) {
	                System.out.println( character);
	                strp =strp+character;
	            }
	           
	            reader.close();
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		 
		
		LinkedList l = new LinkedList();
		l.insertAtEnd(25);
		l.insertAtStart(35);
		l.display();
	}

}

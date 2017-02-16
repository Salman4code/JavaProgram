package LinkedList;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LinkedList {
	protected Node start;
	protected Node end;
	protected int size;

	public LinkedList() {
		// TODO Auto-generated constructor stub
		start = null;
		end = null;
		size = 0;
	}

	public void insertAtStart(int val) {
		Node nptr = new Node(val, null);
		size++;
		if (start == null) {
			start = nptr;
			end = start;
		} else
			nptr.setLink(start);
		start = nptr;
	}

	public void insertAtEnd(int val) {
		Node nptr = new Node(val, null);
		size++;
		if (start == null) {
			start = nptr;
			end = start;
		} else
			end.setLink(nptr);
		end = nptr;
	}

	public void insertAtpos(int val, int pos) {
		Node nptr = new Node(val, null);
		Node ptr = start;
		pos = pos - 1;
		for (int i = 1; i < size; i++) {
			if (i == pos) {
				Node tmp = ptr.getLink();
				ptr.setLink(nptr);
				nptr.setLink(tmp);
			}
			ptr = ptr.getLink();
		}
		size++;
	}

	public void remove(int pos) {
		if (pos == 1) {
			start = start.getLink();
			size--;
			return;
		}
		if (pos == size) {
			Node s = start;
			Node t = start;
			while(s!=end)
			{
				t=s;
				s=s.getLink();
			}
			end=t;
			end.setLink(null);
			size--;
			return;

		}
		Node ptr =start;
		pos=pos-1;
		for (int i = 0; i < size-1; i++) {
			if (i==pos) {
				Node tmp = ptr.getLink();
				tmp=tmp.getLink();
				ptr.setLink(tmp);
				break;
			}
			ptr=ptr.getLink();
		}
		size++;

	}

	public void display() {
		if (size == 0) {
			System.out.println("Linked list empty");
			return;
		}

		if (start.getLink() == null) {
			System.out.println(start.getData() + "->");
		}
		Node ptr = start;
		System.out.print(start.getData() + "->");
		ptr = ptr.getLink();
		while (ptr.getLink() != null) {
			System.out.print(ptr.getData() + "->");
			ptr = ptr.getLink();
		}
		System.out.println(ptr.getData());
	}

	public void Search() {
		Node tmp = start;
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Search");
		System.out.println("If Number found it will be deleted\t If not found number will be added");
		int num = sc.nextInt();
		int pos = 1;
		while (tmp.getLink() != null) {
			pos++;
			if (tmp.getData() == num) {
				flag++;
				break;
			}
			
			tmp = tmp.getLink();
		}
		if (flag == 1) {
			System.out.println("Number Found at Position\t" + pos);
			remove(pos);
			display();
		} else {
			insertAtpos(num, pos);
			// insertAtEnd(num);
			display();
		}
		
	 
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fs = new FileReader("//home/bridgeit/workspace/Practice/src/LinkedList/test.txt");

		BufferedReader br = new BufferedReader(fs);
		String s = "", s1 = "";
		while ((s = br.readLine()) != null) {
			s1 = s1 + s;
		}
		br.close();
		String[] str = s1.split(",");
		int[] arr = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		/*
		 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]);
		 * }printing array to check
		 */
		Arrays.sort(arr);
		LinkedList l = new LinkedList();
		for (int i = 0; i < arr.length; i++) {

			// int tmp = arr[i];

			l.insertAtEnd(arr[i]);
		}
		// l.insertAtEnd(25);
		// l.insertAtStart(35);
		l.display();
		l.Search();
		
	}
	 public void ReinsertinFile()
	 {
		 try {
	            FileWriter writer = new FileWriter("/home/bridgeit/workspace/Practice/src/LinkedList/test.txt", true);
	            writer.write("Hello World");
	            writer.write("\r\n");   // write new line
	            writer.write("Good Bye!");
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 }
}

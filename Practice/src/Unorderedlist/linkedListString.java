package Unorderedlist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class linkedListString {
	protected Node start;
	protected Node end;
	protected int size;

	public linkedListString() {
		// TODO Auto-generated constructor stub
		start = null;
		end = null;
		size = 0;
	}

	public boolean isEmpty()

	{

		return start == null;

	}

	public int getSize()

	{

		return size;

	}

	public void insertAtStart(String val) {
		Node nptr = new Node(val, null);
		size++;
		if (start == null) {
			start = nptr;
			end = start;
		} else
			nptr.setLink(start);
		start = nptr;
	}

	public void insertAtEnd(String val) {
		Node nptr = new Node(val, null);
		size++;
		if (start == null) {
			start = nptr;
			end = start;
		} else
			end.setLink(nptr);
		end = nptr;
	}

	public void insertAtpos(String val, int pos) {
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
			while (s != end) {
				t = s;
				s = s.getLink();
			}
			end = t;
			end.setLink(null);
			size--;
			return;
		}
		Node ptr = start;
		pos = pos - 1;
		for (int i = 1; i < size - 1; i++) {
			if (i == pos) {
				Node tmp = ptr.getLink();
				tmp = tmp.getLink();
				ptr.setLink(tmp);
				break;
			}
			ptr = ptr.getLink();
		}
		size--;

	}

	String st;

	public void display() {
		st = "";
		if (size == 0) {
			System.out.println("Linked list empty");
			return;
		}

		if (start.getLink() == null) {
			System.out.println(start.getData() + "->");
		}
		Node ptr = start;
		System.out.print(start.getData() + "->");
		st = st + start.getData() + ",";
		ptr = ptr.getLink();
		while (ptr.getLink() != null) {
			System.out.print(ptr.getData() + "->");
			st = st + ptr.getData() + ",";
			ptr = ptr.getLink();
		}
		System.out.println(ptr.getData());
		st = st + ptr.getData() + ",";
	}

	public void search() {
		Node ptr = start;
		int flag = 0;
		int pos = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String for Search");
		String s = sc.nextLine();

		while (ptr.getLink() != null) {
			pos++;
			if (ptr.getData().equals(s)) {
				flag++;
				break;
			}
			ptr = ptr.getLink();
		}
		if (flag == 1) {
			remove(pos);
			display();
		} else {
			insertAtEnd(s);
			display();
		}
	}

	public String removeonce() { // removing from start only once /*
		Node ptr = start;
		String s = ptr.getData();
		start = ptr.getLink();
		size--;
		return s;
		// For removing last element in the String
		/*
		 * Node ptr =start; Node tmp = null ; while(ptr.getLink()!=null) {
		 * tmp=ptr; ptr=ptr.getLink(); } end=tmp; end.setLink(null); size--;
		 */

	}

	public void reinsertString() {

		FileWriter writer;
		try {
			writer = new FileWriter("/home/bridgeit/workspace/Practice/src/Unorderedlist/abc1.txt");
			writer.write(st);
			writer.flush();

			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader reader = new FileReader("/home/bridgeit/workspace/Practice/src/Unorderedlist/abc.txt");
			BufferedReader bufferread = new BufferedReader(reader);
			String character = "";
			String strp = "";
			while ((character = bufferread.readLine()) != null) {
				System.out.println(character);
				strp += character;
			}

			reader.close();

			linkedListString l = new linkedListString();
			String[] str = strp.split(" ");
			for (int i = 0; i < str.length; i++) {
				String tmp = str[i];
				l.insertAtEnd(tmp);
			}

			l.search();

			l.display();
			l.reinsertString();
			System.out.println(l.st);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

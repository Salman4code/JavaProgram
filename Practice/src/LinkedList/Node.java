package LinkedList;

public class Node {
protected int data;
protected Node link;

public Node()
{
	data=0;
	link=null;
}
public Node(int d,Node n)
{
	data =d;
	link=n;
}
public Node getLink(){
	return link;
}
public void setLink(Node n) {
	this.link =n;
}
public int  getData() {
	return data;
}

}

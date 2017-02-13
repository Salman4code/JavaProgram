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
public int getLink(){
	return link;
}
public void setLink(Node link) {
	this.link = link;
}
public int  getData() {
	return data;
}

}

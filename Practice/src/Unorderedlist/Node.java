package Unorderedlist;

public class Node {
protected String data;
protected Node link;

public Node()
{
	
	link=null;
}
public Node(String d,Node n)
{
	data =d;
	link=n;
}
public void setLink(Node n) {
	this.link =n;
}
public  Node getLink(){
	return link;
}
public String  getData() {
	return data;
}

}

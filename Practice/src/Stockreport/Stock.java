package Stockreport;



public class Stock {
private String name;
private int Noofshare;
private double price;
private double totalstock;

public Stock(String name,int Noofshare,double price)
{
	this.name=name;
	this.Noofshare=Noofshare;
	this.price=price;
}
public Stock()
{
	
}
public String getname()
{
	return name;
}
public int getNoofshare(){
	return Noofshare;
}
public double getPrice(){
return price;
}
double calculateStock() {
		totalstock=((double)Noofshare)*(price);
return totalstock;
}
public String toString()
{
	return ("Name:\t"+name+"\tNo Of Share:\t"+Noofshare+"\tShare Price:\t"+price+"\tTotal Stock\t"+totalstock);
}

}
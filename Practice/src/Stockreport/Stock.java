package Stockreport;

import java.util.Scanner;

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
	double dec=((10*price)/100);
	price=dec*Noofshare;
	totalstock+=price;
return price;
}
public String toString()
{
	return ("Name:\t"+name+"\tNo Of Share:\t"+Noofshare+"\tPrice:\t"+price);
}

}
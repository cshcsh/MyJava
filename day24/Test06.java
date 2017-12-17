package com.java5200.date0611;

interface IBook{
	public String getName();
	public double getPrice();
	public String getAuthor();
}

class NovelBook implements IBook{
	private String Name;
	private double price;
	private String author;
	public NovelBook(String name, double price, String author) {
		super();
		Name = name;
		this.price = price;
		this.author = author;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "NovelBook [Name=" + Name + ", price=" + price + ", author=" + author + "]";
	}
	
}

class ComputerBook implements IBook{
	private String Name;
	private double price;
	private String author;
	private String dec;//领域说明
	
	public ComputerBook(String name, double price, String author, String dec) {
		super();
		Name = name;
		this.price = price;
		this.author = author;
		this.dec = dec;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getDec() {
		return dec;
	}
	public void setDec(String dec) {
		this.dec = dec;
	}
	@Override
	public String toString() {
		return "ComputerBook [Name=" + Name + ", price=" + price + ", author=" + author + ", dec=" + dec + "]";
	}
	
	
}
class BookStore{

	private String bookStoreName;
	private IBook iBook;
	private double money;
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}

	public BookStore(String bookStoreName, IBook iBook) {
		super();
		this.bookStoreName = bookStoreName;
		this.iBook = iBook;
	}

	public void sales(){
		if(this.iBook.getPrice()>=40){
			this.setMoney(this.iBook.getPrice()*0.9);
		}else{
			this.setMoney(this.iBook.getPrice()*0.8);
		}
		
	}
}

public class Test06 {

	public static void main(String[] args) {

		IBook iBook=new ComputerBook("java教程", 55.6, "高斯林", "这是一本java教材");
		System.out.println(iBook);
		BookStore bookStore=new BookStore("学友书店", iBook);
		bookStore.sales();
		System.out.print("折算价格：");
		System.out.println(bookStore.getMoney());
	}

}

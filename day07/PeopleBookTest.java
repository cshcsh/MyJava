package com.java5200.date0525;

public class PeopleBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book=new Book("Java从入门到单身", 99.00f);
		People people=new People("csh", 20);
		
		book.setPeople(people);
		people.setBook(book);
		
		System.out.println("从人找到书——" + "姓名：" + people.getName() + "，" +  
            "年龄：" + people.getAge() + "，" + "书名：" + people.getBook().getTitle() + "，" +  
            "价格：" + people.getBook().getPrice());  
		  
		        
        System.out.println("从书找到人——" + "书名：" + book.getTitle() + "，" +  
            "价格：" + book.getPrice() + "，" + "姓名：" + book.getPeople().getName() + "，" +  
            "年龄：" + book.getPeople().getAge());  
	}

}

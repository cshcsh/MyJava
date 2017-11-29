package com.java5200.date0525;

public class PeopleBookTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book2 book=new Book2("Java从入门到单身", 99.00f);
		Book2 book2=new Book2("python", 199.00f);
		People2 people=new People2("csh", 20);
		People2 people2=new People2("ccc", 2);
		book2.setPeople(people2);
		people2.setBook(book2);
		
		book.setPeople(people);
		people.setPeople(people2);
		people.setBook(book);
		
		System.out.println("从人找到书——" + "姓名：" + people.getName() + "，" +  
            "年龄：" + people.getAge() + "，" + "书名：" + people.getBook().getTitle() + "，" +  
            "价格：" + people.getBook().getPrice());  
		
		System.out.println("从人找到书——" + "姓名：" + people.getPeople().getName() + "，" +  
	            "年龄：" + people.getPeople().getAge() + "，" + "书名：" + people.getPeople().getBook().getTitle() + "，" +  
	            "价格：" + people.getPeople().getBook().getPrice());    
		        
        System.out.println("从书找到人——" + "书名：" + book.getTitle() + "，" +  
            "价格：" + book.getPrice() + "，" + "姓名：" + book.getPeople().getName() + "，" +  
            "年龄：" + book.getPeople().getAge());  
        
        System.out.println("从书找到人——" + "书名：" + book2.getTitle() + "，" +  
                "价格：" + book2.getPrice() + "，" + "姓名：" + book2.getPeople().getName() + "，" +  
                "年龄：" + book2.getPeople().getAge());  
	}

}

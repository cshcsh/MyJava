package com.java5200.date0525;

public class PeopleBookTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book2 book=new Book2("Java�����ŵ�����", 99.00f);
		Book2 book2=new Book2("python", 199.00f);
		People2 people=new People2("csh", 20);
		People2 people2=new People2("ccc", 2);
		book2.setPeople(people2);
		people2.setBook(book2);
		
		book.setPeople(people);
		people.setPeople(people2);
		people.setBook(book);
		
		System.out.println("�����ҵ��顪��" + "������" + people.getName() + "��" +  
            "���䣺" + people.getAge() + "��" + "������" + people.getBook().getTitle() + "��" +  
            "�۸�" + people.getBook().getPrice());  
		
		System.out.println("�����ҵ��顪��" + "������" + people.getPeople().getName() + "��" +  
	            "���䣺" + people.getPeople().getAge() + "��" + "������" + people.getPeople().getBook().getTitle() + "��" +  
	            "�۸�" + people.getPeople().getBook().getPrice());    
		        
        System.out.println("�����ҵ��ˡ���" + "������" + book.getTitle() + "��" +  
            "�۸�" + book.getPrice() + "��" + "������" + book.getPeople().getName() + "��" +  
            "���䣺" + book.getPeople().getAge());  
        
        System.out.println("�����ҵ��ˡ���" + "������" + book2.getTitle() + "��" +  
                "�۸�" + book2.getPrice() + "��" + "������" + book2.getPeople().getName() + "��" +  
                "���䣺" + book2.getPeople().getAge());  
	}

}

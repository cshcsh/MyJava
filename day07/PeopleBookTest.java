package com.java5200.date0525;

public class PeopleBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book=new Book("Java�����ŵ�����", 99.00f);
		People people=new People("csh", 20);
		
		book.setPeople(people);
		people.setBook(book);
		
		System.out.println("�����ҵ��顪��" + "������" + people.getName() + "��" +  
            "���䣺" + people.getAge() + "��" + "������" + people.getBook().getTitle() + "��" +  
            "�۸�" + people.getBook().getPrice());  
		  
		        
        System.out.println("�����ҵ��ˡ���" + "������" + book.getTitle() + "��" +  
            "�۸�" + book.getPrice() + "��" + "������" + book.getPeople().getName() + "��" +  
            "���䣺" + book.getPeople().getAge());  
	}

}

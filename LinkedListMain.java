package com.linkedlist;

public class LinkedListMain 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to linked list program");
		LinkedList<Integer> list=new LinkedList<>();
		//appending data is adding of elements..
		list.add(56);
		list.add(30);
		//as index starts from 0, 30 is inserted in between 56 and 70
		//by using index value..
		list.add(70);
		list.insertAt(2, 40); //inserted 40 after 30
		list.display();
		int ele=30;
		if(list.search(ele))
			System.out.println("ELement found " +ele);
		else
			System.out.println("ELement not found");
	}
}
		
package com.linkedlist;

public class LinkedListMain 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to linked list program");
		LinkedList<Integer> list=new LinkedList<>();
		//appending data is adding of elements..
		list.add(56);
		list.add(70);
		//as index starts from 0, 30 is inserted in between 56 and 70
		//by using index value..
		list.insertAt(1, 30);
		list.display();
	}
}

package com.linkedlist;

public class LinkedList<T> implements ILinkedList<T>
{
	Node<T> head;
	@Override
	public void add(T data)
	{
		Node<T> node=new Node<T>();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node<T> node1=head;
			while(node1.next!=null)
			{
				node1=node1.next;
			}
			node1.next=node;
		}
	}
	@Override
	public void display()
	{
		Node<T> node=head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}

}

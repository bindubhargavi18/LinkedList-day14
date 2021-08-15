package com.linkedlist;

public class LinkedList<T> implements ILinkedList<T>
{
	Node<T> head;
	int size=0;
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
		size++;
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
		System.out.println("size of list: "+size);
	}
	
	@Override
	public void insertAt(int index,T data)
	{
		Node<T> node = new Node<T>();
		node.data = data;
		node.next = null;
		
		if(index==0)
		{
			node.data = data;
			node.next = null;
			node.next = head;
			head = node;
		}
		else
		{
			Node<T> n = head;
			for(int i=0;i<index-1;i++)
			{
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
		size++;
	}
	
	@Override
	public void deleteAt(int index)
	{
		if(index==0)
		{
			head = head.next;
		}
		else
		{
			Node<T> n = head;
			Node<T> n1 = null;
			for(int i=0;i<index-1;i++)
			{
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			n1 = null;
		}
		size--;
	}
	
	@Override
	public boolean search(T searchEle) 
    { 
        Node<T> temp = head;  
        while (temp != null) 
        { 
            if (temp.data == searchEle) 
                return true;    
            temp = temp.next; 
        } 
        return false;    
    }

}


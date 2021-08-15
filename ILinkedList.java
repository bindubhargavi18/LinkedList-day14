 package com.linkedlist;

 public interface ILinkedList<T> 
 {
 	public void add(T data);
 	public void display();
 	public void insertAt(int index,T data);
 	public void deleteAt(int index);
 	public boolean search(T searchEle);

 }
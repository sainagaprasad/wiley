package com.assignment.linkedlist;
import java.util.LinkedList;

public class AddLastToFirst {

	public static void main(String[] args) {
	LinkedList<Integer> llist=new LinkedList<>();
	llist.addFirst(5);
	llist.addFirst(4);
	llist.addFirst(3);
	llist.addFirst(2);
	llist.addFirst(1);
	llist.addFirst(llist.removeLast());
	System.out.println(llist);

	}

}
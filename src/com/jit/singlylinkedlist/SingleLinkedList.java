package com.jit.singlylinkedlist;

public class SingleLinkedList {

	public Node start;

	public SingleLinkedList() {
		start = null;
	}

	public void displayList() {
		Node p;
		if (start == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("List is : ");
		p = start;
		while (p != null) {
			System.out.print(p.info+" ");
			p = p.link;
		}
		System.out.println();
	}

	public void countNodes() {
		int n = 0;
		Node p = start;
		while (p != null) {
			n++;
			p = p.link;
		}
		System.out.println("Number of nodes in the List = " + n);
	}

	public boolean search(int x) {
		Node p;
		int position = 1;
		p = start;

		while (p != null) {
			if (p.info == x)
				break;
			position++;
			p = p.link;
		}
		if (p == null) {
			System.out.println(x + " not found in list");
			return false;
		} else {
			System.out.println(x + " is at position " + position);
			return true;
		}
	}
}
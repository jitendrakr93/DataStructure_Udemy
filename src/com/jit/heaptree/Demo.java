package com.jit.heaptree;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Heap h = new Heap(20);
		int choice, value;
		while (true) {
			System.out.println("1.Insert");
			System.out.println("2.Delete root");
			System.out.println("3.Display");
			System.out.println("4.Exit");
			System.out.println("Enter your choice : ");
			choice = scan.nextInt();
			if (choice == 4)
				break;
			switch (choice) {
			case 1:
				System.out.println("Enter the value to be inserted : ");
				value = scan.nextInt();
				h.insert(value);
				break;
			case 2:
				System.out.println("Maximum value is : " + h.deleteRoot());
				break;
			case 3:
				h.display();
				break;
			default:
				System.out.println("Wrong choice");
			}
		}
		scan.close();
	}

}
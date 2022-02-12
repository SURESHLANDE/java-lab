package com.Capgemini;
import java.util.ArrayList;

public class ColDemo {

	public static void main(String[] args) {


		ArrayList list = new ArrayList();

		System.out.println(list.size());
		System.out.println(list);

		list.add(10); // not int , it is Integer 
		list.add(10.5);
		list.add("abc");

		System.out.println(list.size());
		System.out.println(list);

		list.add(20);

		System.out.println(list.size());
		System.out.println(list);

		list.remove(1);

		System.out.println(list.size());
		System.out.println(list);

	}

}
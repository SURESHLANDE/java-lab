package com.Capgemini;

import java.util.HashSet;
import java.util.Set;


public class Hash_Set_1
{
	public static void main(String[] args) 
	{
			Set<Integer> set = new HashSet<>();

			System.out.println(set.size());
			System.out.println(set);
			set.add(10);
			set.add(20);
			set.add(30);
			System.out.println(set.size());
			System.out.println(set);
			set.add(20);
			System.out.println(set.size());
			System.out.println(set);

	}


}

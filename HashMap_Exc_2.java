package com.Capgemini;

import java.util.HashMap;

public class HashMap_Exc_2
{
	
	public static void main(String[] args)
	{
	
		HashMap<String, Integer > map = new HashMap<>();
		
		map.put("Tokyo", 10);
		map.put("Berlin", 30);
		map.put("Professor", 20);

		
		System.out.println("Size of map is:- "+ map.size());

		System.out.println( map );

	}

}
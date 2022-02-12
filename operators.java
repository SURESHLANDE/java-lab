package com.Capgemini;

import java.util.Scanner;

public class operators {

	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	
	System.out.println("Input  :");
	int n = sc.nextInt();
	int sum = 0;
	while(n>0);{
		int mod = n%10;
		sum = sum + (int) Math.pow(mod, 3);
		n=n/10;
		
	}
	
	System.out.println("output= "+sum);
	

	}

}

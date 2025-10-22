package com.codegnan.fundamentals;

import java.util.Scanner;

public class TaxPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter income");
		int inc=sc.nextInt();
		int perc=0;
		if (inc<=10000) 
			perc=0;
		else if (inc>=10001 && inc<=50000)
			perc=10;
		else if (inc>=50001 && inc<=100000)
			perc=20;
		else
			perc=30;
		System.out.println(perc+"%");
		sc.close();
	}
}

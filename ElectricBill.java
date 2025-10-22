package com.codegnan.fundamentals;

import java.util.Scanner;

public class ElectricBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter units");
		int units=sc.nextInt();
		System.out.println("Are you a senior citizen?(yes/no) ");
		String sr=sc.next().toLowerCase();
		double bill=0;
		if(units<=100) {
			bill=units*0.15;
		}
		else if(units>101 && units <=200) {
			bill=units*2.00;
		}
		else if(units>201 && units<=300) {
			bill=units*3.00;
		}
		else {
			bill=units*5.00;
		}
		if (bill>1000) {
			bill+=bill*0.10;
		}
		if (sr.equals("yes")) {
			bill-=bill*0.05;
		}
		System.out.println(bill);
		sc.close();
	}
}

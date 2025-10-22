package com.codegnan.fundamentals;

import java.util.Scanner;

public class Shoppingcart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amo");
		int amo=sc.nextInt();
		System.out.println("is it a festival season (yes/no):");
		String fest=sc.next().toLowerCase();
		System.out.println("do you have premium membership?(yes/no): ");
		String prem=sc.next().toLowerCase();
		double bill=amo;
		if (amo>=10000) {
			bill=amo-(amo*0.20);
		}
		else if (amo>=5000) {
			bill=amo-(amo*0.10);
		}
		else {
			bill=amo;
		}
		if (fest.equals("yes")) {
			bill-=bill*0.05;
		}
		if (prem.equals("yes")) {
			bill-=200;
		}
		System.out.println(bill);
		sc.close();
	}
}

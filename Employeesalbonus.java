package com.codegnan.fundamentals;

import java.util.Scanner;

public class Employeesalbonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter years of experience: ");
        int years = sc.nextInt();
        System.out.print("Enter performance ");
        int perf = sc.nextInt();
        double basesal=0;
        double bonus=0;
        if (years<2) {
        	basesal=30000;
        }
        else if (years>=2 && years<5) {
        	basesal=50000;
        }
        else if( years>=5) {
        	basesal=70000;
        }
        if (perf>=8){
        	bonus=basesal*0.10;
        }
        double totsal=basesal+bonus;
        System.out.println("The basesal is"+basesal);
        System.out.println("The bonus is"+bonus);
        System.out.println("The total sal  is"+totsal);
		sc.close();	
	}
}

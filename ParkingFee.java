package com.codegnan.fundamentals;

import java.util.Scanner;

public class ParkingFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the vehicle type (Car, Bike, Truck): ");
	        String vehicle = sc.next().toLowerCase();
	        System.out.print("Enter the time of arrival (24-hour format, e.g., 14 for 2 PM): ");
	        int arrival = sc.nextInt();
	        System.out.print("Enter the time of departure (24-hour format, e.g., 18 for 6 PM): ");
	        int dep = sc.nextInt();
	        int hrsPark;
	        if (dep >= arrival)
	            hrsPark = dep - arrival;
	        else 
	            hrsPark = (24 - arrival) + dep;
	        double ratePerHour;
	        switch (vehicle) {
	            case "car":
	                ratePerHour = 50;
	                break;
	            case "bike":
	                ratePerHour = 30;
	                break;
	            case "truck":
	                ratePerHour = 100;
	                break;
	            default:
	                System.out.println("Invalid vehicle type!");
	                sc.close();
	                return;
	        }
	        double totalFee = hrsPark * ratePerHour;
	        if (hrsPark > 5)
	            totalFee *= 0.8; 
	        boolean surApp = false;
	        for (int i = 0; i < hrsPark; i++) {
	            int currHr = (arrival + i) % 24;
	            if (currHr >= 18 || currHr < 8) {
	                surApp = true;
	                break;
	            }
	        }
	        if (surApp)
	            totalFee *= 1.5;
	        System.out.printf("Total parking fee: ₹%.2f%n", totalFee);
	        sc.close();
	}
}

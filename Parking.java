package javaaa;
import java.util.*;
public class Parking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the hours to park an vehcile(24 hrs-format)");
		int hours=sc.nextInt();
		int fee=(hours<=3)?(hours*2):(3*2+(hours-3)*1);
		System.out.println(fee);
		sc.close();
		
	}

}

package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Hi there! Please input a year and I will tell you if it was a leap year: ");
		int year = in.nextInt();
		
		boolean byFour = year % 4 == 0;
		boolean notByHundred = year % 100 != 0;
		boolean byFourHundred = year % 400 == 0;
		
		boolean leapYear = ((byFour && notByHundred) || byFourHundred);
		System.out.println(year + " is a leap year: " + leapYear);
		
	}

}

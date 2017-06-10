package basic;

import java.util.Scanner;

public class Leap {
	public static void main(String[] args)
	{
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		year=sc.nextInt();
		if((year%400==0)||(year%4==0)||(year%100!=0))
		{
			System.out.println("leap ");
		}
		else
		{
			System.out.println("not leap");
		}
	}
}

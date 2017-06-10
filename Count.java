package basic;

import java.util.Scanner;

public class Count {
	public static void main(String[] args)
	{
		int num,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		while(num>0)
		{
			num=num/10;
			count=count+1;
		}
	System.out.println("number of digit in given number:"+ count);}

}

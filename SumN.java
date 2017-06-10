package basic;

import java.util.Scanner;

public class SumN {
public static void main(String[] args)
{
	int x,i=1,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	x=sc.nextInt();
	while(i<=x)
	{ sum=sum+i;
    i++;
}
    System.out.println("sum of natural number is:" + sum);
}
}

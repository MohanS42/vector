package basic;

import java.util.Scanner;

public class SumNfor{
public static void main(String[] args)
{
	int x,i=1,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	x=sc.nextInt();
	for(i=1;i<=x;i++)
	{ sum=sum+i;

}
    System.out.println("sum of natural number is:" + sum);
}
}

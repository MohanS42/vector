package assignment;
import java.util.Scanner;
public class Ass20 {
	public static void main(String[] args)
	{
		int x,temp=0;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number:");
	    x=sc.nextInt();
	    while(x!=0){
	    	temp=temp*10;
	        temp=temp+x%10;
	        x=x/10;
	}System.out.println(temp);
	}}


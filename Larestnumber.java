package basic;
import java.util.Scanner;
public class Larestnumber {
public static void main(String[] args)
{
	int x,y,z;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbers");
	x=sc.nextInt();
	y=sc.nextInt();
	z=sc.nextInt();
	if(x>y&&x>z)
		{System.out.println("1st number is the Largest number");}
	else if(y>x&&y>z)
		{System.out.println("2nd number is the Largest number");}
	else if(z>x&&z>y)
	{System.out.println("3rd number is the Largest number");}		}

}

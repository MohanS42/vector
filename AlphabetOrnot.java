package basic;
import java.util.Scanner;
public class AlphabetOrnot {
public static void main(String[] args)
{
	char ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the character");
	ch=sc.next().charAt(0);
	if((ch>='a' && ch<='z')||(ch>='A'&& ch<='Z'))
	{
		System.out.println("It's alphabet");
	}
	else
	{
		System.out.println("it's not alphabet");
	}
}
}

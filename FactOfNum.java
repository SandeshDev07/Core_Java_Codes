/*
	Calculate Factorial of given Number....
													*/

import java.util.*;

public class FactOfNum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number to calculate Factorial : ");
		int num = sc.nextInt();

		if(num < 0)
		{
			System.out.println("Can not calculate Factorial for " + num);
			System.exit(0);
		}

		long fact = 1;

		for(int i=1; i<=num; i++)
		{
			fact = fact * i;
		}

		System.out.println("Factorial of " + num + " is " + fact);

	}
}
/*
	Calculate sum of First 'n' Numbers........
				APPROACH-2							*/

import java.util.*;

public class SumOfFirstNNum_2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number to Calculate Sum : ");
		int num = sc.nextInt();

		if(num < 0)
		{
			System.out.println("Invalid Value for n = " + num);
			System.exit(0);
		}

		long sum = num * (num + 1)/2;

		System.out.println("Sum = " + sum);
	}
}
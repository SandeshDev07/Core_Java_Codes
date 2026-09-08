/*
	Calculates Sum of First 'n' Numbers.......
				APPROACH-1										*/

import java.util.*;

public class SumOfFirstNNum_1
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

		long sum = 0;

		for(int i=1; i<=num; i++)
		{
			sum = sum + i;
		}

		System.out.println("Sum = " + sum);
	}
}
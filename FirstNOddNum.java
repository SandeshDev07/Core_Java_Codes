/*
	Print First 'n' Odd Numbers....
										*/

import java.util.*;

public class FirstNOddNum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Till what Number you want to print Even Numbers : ");
		int num = sc.nextInt();

		if(num < 0)
		{
			System.out.println("Invalid Input!!....");
			System.exit(0);
		}

		System.out.println("Odd Numbers Between 0 to " + num + " are :");

		for(int i=1; i<=num; i++)
		{
			if( i%2 == 1)
			{
				System.out.println(i);
			}
		}

	}
}
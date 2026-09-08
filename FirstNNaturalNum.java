/*
	Print First 'n' Natural Numbers......
												*/

import java.util.*;

public class FirstNNaturalNum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value for n : ");
		int n = sc.nextInt();

		if(n < 1)
		{
			System.out.println("Invalid input for n : " + n);
			System.exit(0);       // It terminates the Program...
		}

		System.out.println("Natural Numbers upto " + n +" are");

		for(int i=1; i<=n; i++)
		{
			System.out.println(i);
		}
	}
}
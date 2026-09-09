/*
		Print Following Pattern........

		1 2 3 4
		1 2 3 4
		1 2 3 4
		1 2 3 4                     */

import java.io.*;

public class PatternPrinting_3
{
	public static void main()
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=4; j++)
			{
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}
}
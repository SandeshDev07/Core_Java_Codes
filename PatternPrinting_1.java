/*
		Print Following Pattern.....

		A A A A
		B B B B
		C C C C
		D D D D         		*/

import java.io.*;

public class PatternPrinting_1
{
	public static void main(String args[])
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=4; j++)
			{
				System.out.print( (char) (i+64) + " " );
			}

			System.out.println();
		}
	}
}			